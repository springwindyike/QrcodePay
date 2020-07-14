package com.jiewen.qrcodepay.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.icbc.smartpos.deviceservice.aidl.IBeeper;
import com.icbc.smartpos.deviceservice.aidl.IDeviceInfo;
import com.icbc.smartpos.deviceservice.aidl.IDeviceService;
import com.icbc.smartpos.deviceservice.aidl.IInsertCardReader;
import com.icbc.smartpos.deviceservice.aidl.ILed;
import com.icbc.smartpos.deviceservice.aidl.IMagCardReader;
import com.icbc.smartpos.deviceservice.aidl.IPBOC;
import com.icbc.smartpos.deviceservice.aidl.IPrinter;
import com.icbc.smartpos.deviceservice.aidl.IRFCardReader;
import com.icbc.smartpos.deviceservice.aidl.IScanner;

/**
 *
 * POS设备驱动服务
 */

public class DeviceService {
    private static final String TAG = DeviceService.class.getSimpleName();

    private static DeviceService _deviceService = null;
    private Context _context;
    /***
     * 0前置扫码器，1后置扫码器
     */
    private int _cameraId = 1;
    /***
     * 服务是否绑定
     */
    private boolean isdeviceServiceBind = false;
    /***
     * 设备AIDL服务
     */
    private IDeviceService ideviceService;
    /***
     * pboc流程对象
     */
    private IPBOC ipboc;

    /***
     * 设备管理器
     */
    private IDeviceInfo iDeviceInfo;

    /***
     * LED灯对象
     */
    private ILed iLed;
    /***
     * 蜂鸣器对象
     */
    private IBeeper iBeeper;
    /***
     * 打印机对象
     */
    private IPrinter iPrinter;
    /***
     * 扫码器对象
     */
    private IScanner iScanner;

    /***
     * 磁条读卡器对象
     */
    private IMagCardReader iMagCardReader;

    /***
     * 接触式IC读卡器对象
     */
    private IInsertCardReader insertCardReader;

    /***
     * 非接触读卡器对象
     */
    private IRFCardReader irfCardReader;

    public DeviceService(Context context){
        super();
        if (context != null) {
            this._context = context;
        }
    }

    public static DeviceService getInstance(Context context) {
        if (_deviceService == null) {
            _deviceService = new DeviceService(context);
        }

        return _deviceService;
    }

    ServiceConnection connection = new ServiceConnection(){
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e(TAG, "设备驱动服务中断");
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            ideviceService = IDeviceService.Stub.asInterface(service);
            if (ideviceService != null) {
                try {
                    ipboc = ideviceService.getPBOC();
                    iLed = ideviceService.getLed();
                    iBeeper = ideviceService.getBeeper();
                    iPrinter = ideviceService.getPrinter();
                    iScanner = ideviceService.getScanner(1);
                    iMagCardReader = ideviceService.getMagCardReader();
                    insertCardReader = ideviceService.getInsertCardReader();
                    irfCardReader = ideviceService.getRFCardReader();
                    iDeviceInfo = ideviceService.getDeviceInfo();
//                    ipboc = IPBOC.Stub.asInterface(ideviceService.getPBOC());
//                    iLed = ILed.Stub.asInterface(ideviceService.getLed());
//                    iBeeper = IBeeper.Stub.asInterface(ideviceService.getBeeper());
//                    iPrinter = IPrinter.Stub.asInterface(ideviceService.getPrinter());
//                    iScanner = IScanner.Stub.asInterface(ideviceService.getScanner(1));
//                    iMagCardReader = IMagCardReader.Stub.asInterface(ideviceService.getMagCardReader());
//                    insertCardReader = IInsertCardReader.Stub.asInterface(ideviceService.getInsertCardReader());
//                    irfCardReader = IRFCardReader.Stub.asInterface(ideviceService.getRFCardReader());
//                    iDeviceInfo = IDeviceInfo.Stub.asInterface(ideviceService.getDeviceInfo());
//                    Toast.makeText(_context,"设备驱动服务绑定成功", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "设备驱动服务绑定成功");
                } catch (RemoteException e) {
//                    Toast.makeText(_context,"获取设备驱动接口异常", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "获取设备驱动接口异常");
                    e.printStackTrace();
                }
            }
        }
    };

    /***
     * 绑定服务
     */
    public void bindDeviceService() {
        if (!isdeviceServiceBind) {
            Log.e(TAG, "bindDeviceService");
            Intent intent = new Intent();
            intent.setAction("com.icbc.smartpos.device_service");
            intent.setPackage("com.icbc.smartpos.deviceservice");
            isdeviceServiceBind = _context.bindService(intent, connection, Context.BIND_AUTO_CREATE);
        }
    }

    /***
     * 解绑服务
     */
    public void unbindDeviceService() {
        if (isdeviceServiceBind) {
            _context.unbindService(connection);
            isdeviceServiceBind = false;
            Log.e(TAG, "设备驱动服务解绑成功");
        }else {
            Log.e(TAG, "设备驱动服务未绑定无需解绑");
        }
    }

    /***
     * 设置扫码器前置/后置,默认前置
     * @param cameraId 0前置扫码器，1后置扫码器
     */
    public void setCameraId(int cameraId) {
        if (cameraId == 0 || cameraId == 1) {
            this._cameraId = cameraId;
        }
    }

    public IMagCardReader getiMagCardReader() {
        return iMagCardReader;
    }


    public IInsertCardReader getInsertCardReader() {
        return insertCardReader;
    }


    public IRFCardReader getIrfCardReader() {
        return irfCardReader;
    }

    public IDeviceInfo getiDeviceInfo() {
        return iDeviceInfo;
    }

    public void setiDeviceInfo(IDeviceInfo iDeviceInfo) {
        this.iDeviceInfo = iDeviceInfo;
    }

    /***
     *  获取pboc流程对象
     * @return IPBOC
     */
    public IPBOC getIPBOC() {
        return ipboc;
    }

    /***
     * 获取打印机对象
     * @return IPrinter
     */
    public IPrinter getIPrinter() {
        return iPrinter;
    }

    /***
     * 获取扫码器对象
     * @return IScanner
     */
    public IScanner getIScanner() {
        return iScanner;
    }

//    /***
//     * 获取LED灯对象
//     * @return
//     */
//    public ILed getiLed() {
//        return iLed;
//    }
//
//    /***
//     * 获取蜂鸣器对象
//     * @return
//     */
//    public IBeeper getiBeeper() {
//        return iBeeper;
//    }

    /***
     * 打开蜂鸣
     * @param msec 蜂鸣持续的时间，单位：毫秒
     */
    public void openBeeper(int msec) {
        try {
            iBeeper.startBeep(msec);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭蜂鸣
     */
    public void closeBeeper() {
        try {
            iBeeper.stopBeep();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 打开蓝色LED灯
     */
    public void openBlueLed() {
        try {
            iLed.turnOn(1);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭蓝色LED灯
     */
    public void closeBlueLed() {
        try {
            iLed.turnOff(1);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 打开黄色LED灯
     */
    public void openYellowLed() {
        try {
            iLed.turnOn(2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭黄色LED灯
     */
    public void closeYellowLed() {
        try {
            iLed.turnOff(2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 打开绿色LED灯
     */
    public void openGreenLed() {
        try {
            iLed.turnOn(3);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭绿色LED灯
     */
    public void closeGreenLed() {
        try {
            iLed.turnOff(3);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 打开红色LED灯
     */
    public void openRedLed() {
        try {
            iLed.turnOn(4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭红色LED灯
     */
    public void closeRedLed() {
        try {
            iLed.turnOff(4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 打开LED灯
     * @param blue 蓝灯 true-打开
     * @param yellow 黄灯 true-打开
     * @param green 绿灯 true-打开
     * @param red 红灯 true-打开
     */
    public void openLed(boolean blue, boolean yellow, boolean green, boolean red) {
        try {
            if (blue)
                iLed.turnOn(1);
            if (yellow)
                iLed.turnOn(2);
            if (green)
                iLed.turnOn(3);
            if (red)
                iLed.turnOn(4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /***
     * 关闭LED灯
     * @param blue 蓝灯 true-关闭
     * @param yellow 黄灯 true-关闭
     * @param green 绿灯 true-关闭
     * @param red 红灯 true-关闭
     */
    public void closeLed(boolean blue, boolean yellow, boolean green, boolean red) {
        try {
            if (blue)
                iLed.turnOff(1);
            if (yellow)
                iLed.turnOff(2);
            if (green)
                iLed.turnOff(3);
            if (red)
                iLed.turnOff(4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
