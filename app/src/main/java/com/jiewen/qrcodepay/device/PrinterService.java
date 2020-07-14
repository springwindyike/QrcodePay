package com.jiewen.qrcodepay.device;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RemoteException;

import com.icbc.smartpos.deviceservice.aidl.IPrinter;
import com.icbc.smartpos.deviceservice.aidl.PrinterListener;


/**
 *
 * 打印驱动封装
 */

public class PrinterService {
    private static PrinterService _printerService = null;
    /***
     * 打印机状态正常
     */
    private final int ERROR_NONE = 0x00;
    /***
     * 缺纸，不能打印
     */
    private final int ERROR_PAPERENDED = 0xF0;
    /***
     * 硬件错误
     */
    private final int ERROR_HARDERR = 0xF2;
    /***
     * 打印头过热
     */
    private final int ERROR_OVERHEAT = 0xF3;
    /***
     * 缓冲模式下所操作的位置超出范围
     */
    private final int ERROR_BUFOVERFLOW = 0xF5;
    /***
     * 低压保护
     */
    private final int ERROR_LOWVOL = 0xE1;
    /***
     * 纸张将要用尽，还允许打印(单步进针打特有返回值)
     */
    private final int ERROR_PAPERENDING = 0xF4;
    /***
     * 打印机芯故障(过快或者过慢)
     */
    private final int ERROR_MOTORERR = 0xFB;
    /***
     * 自动定位没有找到对齐位置,纸张回到原来位置
     */
    private final int ERROR_PENOFOUND = 0xFC;
    /***
     * 卡纸
     */
    private final int ERROR_PAPERJAM = 0xEE;
    /***
     * 没有找到黑标
     */
    private final int ERROR_NOBM = 0xF6;
    /***
     * 打印机处于忙状态
     */
    private final int ERROR_BUSY = 0xF7;
    /***
     * 黑标探测器检测到黑色信号
     */
    private final int ERROR_BMBLACK = 0xF8;
    /***
     * 打印机电源处于打开状态
     */
    private final int ERROR_WORKON = 0xE6;
    /***
     * 打印头抬起(自助热敏打印机特有返回值)
     */
    private final int ERROR_LIFTHEAD = 0xE0;
    /***
     * 切纸刀不在原位(自助热敏打印机特有返回值)
     */
    private final int ERROR_CUTPOSITIONERR = 0xE2;
    /***
     * 低温保护或AD出错(自助热敏打印机特有返回值)
     */
    private final int ERROR_LOWTEMP = 0xE3;

    private IPrinter _iPrinter;
    private Context _context;
    private IPrinterListener _iListener;

    public interface IPrinterListener {
        void onFinish();
        void onError(String msg);
    }

    public PrinterService(Context context) {
        super();
        if (context != null) {
            _context = context;
        }
        _iPrinter = DeviceService.getInstance(null).getIPrinter();
    }

    public static PrinterService getInstance(Context context) {
        if (_printerService == null) {
            _printerService = new PrinterService(context);
        }
        return _printerService;
    }

    /***
     * 设置打印机的打印灰度
     * @param gray 打印灰度，0~10级
     * @return PrinterService
     */
    public PrinterService setPrinterGray(int gray) {
        try {
            _iPrinter.setGray(gray);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /***
     * 添加一行打印文本
     * @param format 指定打印字体的格式
     *               font(int)：字体，0:small, 1:normal, 2:large
     *               align(int)：对齐方式，默认左对齐，0:left, 1:center, 2:right
     *               underline(boolean)：是否添加下划线，（true：添加；false：不添加）
     *               autoTrunc(boolean)：超出一行是否自动截断（true：截断；false：不截断，默认 true）
     * @param text 打印文本
     * @return PrinterService
     */
    public PrinterService appendPrinterString(Bundle format, String text) {
        try {
            _iPrinter.addText(format, text);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /***
     * 添加条码打印
     * @param format 打印格式
     *               align(int) - 0:left, 1:center, 2:right
     *               width(int) - 宽度
     *               height(int) - 高度
     * @param barcode 条形码内容
     * @return PrinterService
     */
    public PrinterService appendPrinterBarCode(Bundle format, String barcode) {
        try {
            _iPrinter.addBarCode(format, barcode);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /***
     * 添加二维码打印
     * @param format 打印格式
     *               offset(int) - 打印起始位置
     *               expectedHeight(int) - 期望高度
     * @param qrCode 二维码内容
     * @return PrinterService
     */
    public PrinterService appendPrinterQrCode(Bundle format, String qrCode) {
        try {
            _iPrinter.addQrCode(format, qrCode);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /***
     * 添加图片打印
     * @param format 打印格式，可设置打印的位置、宽度、高度
     *               offset(int) - 打印起始位置
     * @param imageData 图片数据
     * @return PrinterService
     */
    public PrinterService appendPrinterImage(Bundle format, byte[] imageData) {
        try {
            _iPrinter.addImage(format, imageData);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }


    /***
     * 添加走纸
     * @param lines 走纸行数
     * @return PrinterService
     */
    public PrinterService appendPrinterFeedLine(int lines) {
        try {
            _iPrinter.feedLine(lines);
            return this;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    private PrinterListener _printerlistener = new PrinterListener.Stub() {
        @Override
        public void onFinish() throws RemoteException {
            _iListener.onFinish();
        }

        @Override
        public void onError(int i) throws RemoteException {
            _iListener.onError("打印失败, Error=["+i+"]");
        }
    };

    private PrinterListener _tmplistener = new PrinterListener.Stub() {
        @Override
        public void onFinish() throws RemoteException {
        }

        @Override
        public void onError(int i) throws RemoteException {
        }
    };


    /***
     * 启动打印
     */
    public void startPrinter(final IPrinterListener iPrinterListener) {
        try {
            _iListener = iPrinterListener;
            int status = _iPrinter.getStatus();
            if (status == ERROR_NONE) {
                _iPrinter.startPrint(_printerlistener);
            }
            else if (status == ERROR_PAPERENDED) {
                //缺纸
                try {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(_context);
                    alertDialog.setTitle("缺纸");
                    alertDialog.setMessage("缺纸，不能打印。");
                    alertDialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startPrinter(iPrinterListener);
                        }
                    });
                    alertDialog.setNeutralButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                _iPrinter.startPrint(_tmplistener); //取消也调用一个启动打印，目的是清除打印缓存数据。
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    alertDialog.show();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }else {
                try {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(_context);
                    alertDialog.setTitle("故障");
                    alertDialog.setMessage("打印机故障，不能打印。");
                    alertDialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            return;
                        }
                    });
                    alertDialog.show();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return;
    }
}
