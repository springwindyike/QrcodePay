package com.jiewen.qrcodepay.Activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.jiewen.qrcodepay.MyApplication;

public class BaseActivity extends Activity {
      //网关公钥
//    protected String APIGW_PUBLIC_KEY =
//            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";
//    //appid
//    protected String APPID = "Oikeclo001";
//    //私钥
//    protected String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIJBzZNaiobplRUgtJ4OzmUvZRK99ih/fUyDBOoFLtpJJCCRzp8T6V11YNlE7Xg5dt+EG7byQs2NImqg0eWEj/mBdZ7UmlAct7BNw2hyF2h4R5OEfXyjoH3wqGjKJayhaHTvLM1DYy/mDFBb0ShJYI1QMScQJZhsOhMMFhrrZwIZAgMBAAECgYAA2kdrOIOBoJPOQJmOE1C8jtPdjIrI9xSt5Imqsn/9A8+NuwacOfgkGXmZ0n6vc8jYa7f2uZ1AVTUtd4IIO5bpq8s0Tw2BfWALYwr/JdUuNKSjHVQsh/Do+wl8BgOgB4RqsNXWNGtoMC8lHKHmrVcpyJMfDc3cP07NZ1wG2zB0lQJBAM+dNZv2L/Z4RzvQcoVZEthYavZ4pkFoWGYC4jwc5G8um76zoQyrtxWYrtTP0GS+xFFX2dEuiGXxwzmSQJrPdrMCQQCgnUXcQe/if2c6TFt4x9v+6L0pmFClYyiOi9RuBSz1sHmPouuc/YYvuxAOdOzu3yzOkeo7b5KcCKITTWvKI+oDAkA5dl6vIw2VXycAJCp+Q/AWVyqLu0rw0Yud+HBbiPek2jabKqaJlkFfRdol5rrcF3zIstMDtahk5uxM0/DzqDZHAkBGnZ8vfdYIUVeDbDrzWXvCEXXJqewbKwOT2KqnTKM9yj9IBatttJGgvrAKiyH4zCqZD9JaG23sKGeJ8QopL60dAkEAtc4tlKoj3XZzRUXboqz0EhkgkjzDj50zpCD1sJKZ2EZH+A/7tXwPug+RnuSmKpM2uv3msqw3prdS3K4En8+rog==";
    //1、网关公钥
    protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCMpjaWjngB4E3ATh+G1DVAmQnI\n" +
            "piPEFAEDqRfNGAVvvH35yDetqewKi0l7OEceTMN1C6NPym3zStvSoQayjYV+eIcZ\n" +
            "ERkx31KhtFu9clZKgRTyPjdKMIth/wBtPKjL/5+PYalLdomM4ONthrPgnkN4x4R0\n" +
            "+D4+EBpXo8gNiAFsNwIDAQAB";
    //2、appid
    protected static final String APP_ID = "1234567890";
   // protected static final String APP_ID = "10000000000000520500";

    //3、密钥对认证方式，公钥在API平台登记，此处为私钥
    protected static final String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCo5A0flSVPwtDVNjCRy3c1EFPsX3dMuJWTo8b/Jl+7q70+vjflBbOYfF9pTq0e67eF0Nf+E+ZPRvDECKUBX8XFyz3vCaIdgpC+pFV9JRCPLA+AMIH2248+4q6e4qwugQOJH5O4/40i+wwnv4gz2RThy+SiGBMpbBA/Pd5bC1dgGIuGvVz0ZBi8sCyK/ms3PC9WQqD0yyrndzqST/MAL4NOCE+2K+CoULBWfDhxik7+asKqTXf9TwZflksmF/EHYw74dr28eWqHeCu6bxFR3H6Gjn9Chd102U4Cr08Uo1QxvNbooxBCGI1FiHrQOPMVXeBGUJeYz1qZoDwQOEdXNrALAgMBAAECggEAXteqMvkrec4aPhFvVwBekhL4Pf4iXZgujzlir7gZ/Kbl4E0r0FXSVChL4DRJbdrLNb9g/BKqvAxHep6sIshopLmMrybGvjGrHRPl2iAtW2lPzxnucfU8TQE5NIpwTLEwjhmIeFQyKtm2KsAZOZyHaIF6hDhm0lUYDpusuY315EUZQZz4fdCKYoen8+ny+idhkJlVfMzAgYIi5WoMCjAi4EXV5lBYQaowCMQc0CN2gyizxumNnyJof77N/Vpg/6PpePaAEid3c8a7sSmzAWcQKH1rb1qM1BNonNeoI4NPunEoB/1juqnVyJvhe6aedis/k3AnkD7PwcYHqoihOQDykQKBgQDpfm91YboW4UemLZaYr1VNSeQNMSg0eMeCQRX1rNUO3Y5dQJoa0Ik8jt0pmJ570H95W/GOwHE+iAnC3evRQDfYBJDDQtvYRTxuWwD+ZVbkpiuKHNkHin6YGc7UqsL0rhCwK+nH0K5LAJ7H5PSDqXLXPY6TyLZZjDOqtGv1INV1wwKBgQC5K4G/ICJSsRS+de7UzgPyanMOEBhCPlaKtdElcF9S1RGEIwOzT+mNbTwQU8S1Ac9UsE976cb5f9316eOHgxPc3C3Btb0yIfho6EdZVNU41IQDSIK63ciE+tB8j9FsTt0Y2iM3mGf+vNmL6cyFUDxEyb0hvde3K07weGt5ntYQGQKBgFgpNhpjCOlkrDHxmqAR66pgEOxuOBj/1Yy32HvHgza2ru9E2irvvDGSW60+A/EJ+2euMJnOzbNnmA/szQJYNf2pU6N2Vh3lnniogcqMJu/0UhI27DctsrjpXa/svem243QxUHbysyx8knc1WqFv1H2yr2fbbAaJqmR09SI8AH0TAoGAZ7RWFhSJJIbId2LVP5mh3EKB7X5WF8OR9F2fpLgqqtlp1fdGO0amJu7mlL5VjIpW87dKzLtBFLroNLGpHFvs4+TsO3DtZQZheV+dlgpM4GclCDG0BbPweYl++kQRpfcFHMYOszRICgL6U8G9KWymVGAn7J3GEm/O5h6LErJCcQECgYEAluoVDsJILX7SG1OGpCdXHFith4jafbvMxSinG6w0n+ZSBSLPUUCz7oUQBWyPDNsJN5akOtMII9IWcaB4oL3r5m97ymWormq6sbR4OLkeuMxhHL/Hp1aoiuZ0bz+T/3JnBdlzqBn2VoewOXYmez4DqQ4MBA/l6qBs1vHsRJK2Q/o=";

    private ProgressDialog mLoadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        APIGW_PUBLIC_KEY = MyApplication.getInstance().getUserSetting(MyApplication.publicKeyTag);
//        APPID = MyApplication.getInstance().getUserSetting(MyApplication.appIdTag);
//        MY_PRIVATE_KEY = MyApplication.getInstance().getUserSetting(MyApplication.privateKeyTag);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setmLoadingDialogNull();
    }

    public void showLoading(String msg){
        if (null == mLoadingDialog){
            mLoadingDialog = new ProgressDialog(this);
            mLoadingDialog.setTitle("提示");
            mLoadingDialog.setMessage(msg);
        }
        mLoadingDialog.show();
    }

    public void hideLoading(){
        if (null == mLoadingDialog){
            return;
        }
        mLoadingDialog.hide();
    }

    public void dissLoading(){
        if (null == mLoadingDialog){
            return;
        }
        mLoadingDialog.dismiss();
    }

    public void setmLoadingDialogNull(){
        if (null != mLoadingDialog){
            mLoadingDialog.dismiss();
            mLoadingDialog = null;
        }
    }
}
