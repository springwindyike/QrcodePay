package com.jiewen.qrcodepay.device;

import android.os.Bundle;
import android.os.RemoteException;

import com.icbc.smartpos.deviceservice.aidl.IScanner;


/**
 *
 */

public class ScannerService {
    private static ScannerService _scannerService = null;

    private IScanner _iScanner;
    /***
     * 扫码界面标题，若存在该参数，则扫码界面显示该标题，否则根据支付方式显示对应标题
     */
    private String _title;
    /***
     * 扫码支付方式，0：通用支付，1：龙支付/银联，2:支付宝/微信
     */
    private int _payType = 0;
    /***
     * 扫码超时时间，单位秒。默认30秒
     */
    private long _timeout = 30;
    private IScannerListener _iScannerListener;

    public interface IScannerListener {
        void onSuccess(String barcode);
        void onError(String message);
        void onTimeout();
        void onCancel();
    }

    public ScannerService() {
        super();
        _iScanner = DeviceService.getInstance(null).getIScanner();
    }

    public static ScannerService getInstance() {
        if (_scannerService == null) {
            _scannerService = new ScannerService();
        }
        return _scannerService;
    }

    private com.icbc.smartpos.deviceservice.aidl.ScannerListener ScannerListener = new com.icbc.smartpos.deviceservice.aidl.ScannerListener.Stub() {
        @Override
        public void onSuccess(String code) throws RemoteException {
            _iScanner.stopScan();
            _iScannerListener.onSuccess(code);
        }

        @Override
        public void onError(int i, String s) throws RemoteException {
            _iScanner.stopScan();
            _iScannerListener.onError(s+"error["+i+"]");
        }

        @Override
        public void onTimeout() throws RemoteException {
            _iScanner.stopScan();
            _iScannerListener.onTimeout();
        }

        @Override
        public void onCancel() throws RemoteException {
            _iScanner.stopScan();
            _iScannerListener.onCancel();
        }
    };

    /***
     * 扫码界面标题，若存在该参数，则扫码界面显示该标题，否则根据支付方式显示对应标题
     * @param value
     */
    public void setTitle(String value){
        _title = value;
    }

    /***
     * 扫码支付方式，0：通用支付，1：龙支付/银联，2:支付宝/微信
     * @param value
     */
    public void setPayType(int value){
        _payType = value;
    }

    /***
     * 设置扫码超时时间，单位秒
     * @param timeout
     */
    public void setTimeout(long timeout) {
        if (timeout > 0) {
            _timeout = timeout;
        }
    }

    /***
     * 开启扫码
     * @param listener 扫码结果监听器
     */
    public void startScan(IScannerListener listener) {
        _iScannerListener = listener;
        Bundle param = new Bundle();
        try {
            param.putLong("timeout", _timeout); //超时时间
            param.putInt("payType", _payType); //扫码支付方式 0：通用支付，1：龙支付/银联，2:支付宝/微信
            param.putString("title", _title); //扫码界面标题
            _iScanner.startScan(param, _timeout, ScannerListener);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return;
    }
}
