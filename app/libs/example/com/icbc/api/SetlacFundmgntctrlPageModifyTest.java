package com.icbc.api;

import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;

import java.util.ArrayList;
import java.util.List;

import com.icbc.api.request.SetlacFundmgntctrlPageModifyRequestV1;
import com.icbc.api.request.SetlacFundmgntctrlPageModifyRequestV1.SetlacFundmgntctrlPageModifyRequestV1Biz;

public class SetlacFundmgntctrlPageModifyTest {

	/**
	 * @param args
	 */

	protected static final String MY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAWAcPiTMRU906PTdy0ozspX7XptZnkEw2C8R64RDB9BiRFXAj0cU4aTA1MyfmGIlceeVdgJf7OnmvpHnYxjQ7sGxMItPtodrGwA2y8j0AEbHc5pNWU8Hn0zoY9smHS5e+KjSbWv+VNbdnrRFTpDeiJ3+s2E/cKI2CDRbo7cAarAgMBAAECgYABiA933q4APyTvf/uTYdbRmuiEMoYr0nn/8hWayMt/CHdXNWs5gLbDkSL8MqDHFM2TqGYxxlpOPwnNsndbW874QIEKmtH/SSHuVUJSPyDW4B6MazA+/e6Hy0TZg2VAYwkB1IwGJox+OyfWzmbqpQGgs3FvuH9q25cDxkWntWbDcQJBAP2RDXlqx7UKsLfM17uu+ol9UvpdGoNEed+5cpScjFcsB0XzdVdCpp7JLlxR+UZNwr9Wf1V6FbD2kDflqZRBuV8CQQCxxpq7CJUaLHfm2kjmVtaQwDDw1ZKRb/Dm+5MZ67bQbvbXFHCRKkGI4qqNRlKwGhqIAUN8Ynp+9WhrEe0lnxo1AkEA0flSDR9tbPADUtDgPN0zPrN3CTgcAmOsAKXSylmwpWciRrzKiI366DZ0m6KOJ7ew8z0viJrmZ3pmBsO537llRQJAZLrRxZRRV6lGrwmUMN+XaCFeGbgJ+lphN5/oc9F5npShTLEKL1awF23HkZD9HUdNLS76HCp4miNXbQOVSbHi2QJAUw7KSaWENXbCl5c7M43ESo9paHHXHT+/5bmzebq2eoBofn+IFsyJB8Lz5L7WciDK7WvrGC2JEbqwpFhWwCOl/w==";

	protected static final String APIGW_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB";

	protected static final String APP_ID = "10000000000000015544";
	public static void main(String[] args) throws Exception  {

		// ����client����
		UiIcbcClient client = new UiIcbcClient(APP_ID, MY_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8);

		// �����������request
		SetlacFundmgntctrlPageModifyRequestV1 request = new SetlacFundmgntctrlPageModifyRequestV1();
		// ��������·��
		request.setServiceUrl("http://ip:port/ui/setlac/fundmgntctrl/page/add/V1");
		// ����֪ͨurl
		request.setNotifyUrl("https://www.xxx.com/do.notify");

		SetlacFundmgntctrlPageModifyRequestV1Biz bizContent = new SetlacFundmgntctrlPageModifyRequestV1Biz();
		request.setBizContent(bizContent);

		bizContent.setApiName("JSON"); //��������JSON
		bizContent.setApiVersion("001.001.003.001"); //��������001.001.003.001

		//��ֵ
		SetlacFundmgntctrlPageModifyRequestV1Biz.Old olddata=new SetlacFundmgntctrlPageModifyRequestV1Biz.Old();
		bizContent.setOlddata(olddata);
		olddata.setAccount("0200041709000000111");
		//��ֵ
		SetlacFundmgntctrlPageModifyRequestV1Biz.New newdata=new SetlacFundmgntctrlPageModifyRequestV1Biz.New();
		bizContent.setNewdata(newdata);
		newdata.setAccount("0200041709000000112");


		//unit_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo> oldUnitInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo>();
		olddata.setUnitInfos(oldUnitInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo oldUnitInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo();
		oldUnitInfos.add(oldUnitInfo);
		oldUnitInfo.setCino("1111111111");
		//unit_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo> newUnitInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo>();
		newdata.setUnitInfos(newUnitInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo newUnitInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo();
		newUnitInfos.add(newUnitInfo);
		newUnitInfo.setCino("1111111112");

		//ctrl_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitCtrlInfo> oldUnitCtrlInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitCtrlInfo>();
		oldUnitInfo.setCtrlInfos(oldUnitCtrlInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitCtrlInfo oldUnitCtrlInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitCtrlInfo();
		oldUnitCtrlInfos.add(oldUnitCtrlInfo);
		oldUnitCtrlInfo.setLatmtyp("1");
		//ctrl_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitCtrlInfo> newUnitCtrlInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitCtrlInfo>();
		newUnitInfo.setCtrlInfos(newUnitCtrlInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitCtrlInfo newUnitCtrlInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitCtrlInfo();
		newUnitCtrlInfos.add(newUnitCtrlInfo);
		newUnitCtrlInfo.setLatmtyp("2");

		//pay_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitPayInfo> oldUnitPayInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitPayInfo>();
		oldUnitInfo.setPayInfos(oldUnitPayInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitPayInfo oldUnitPayInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.Old.UnitInfo.UnitPayInfo();
		oldUnitPayInfos.add(oldUnitPayInfo);
		oldUnitPayInfo.setOacclof("1");
		//pay_info��ֵ
		List<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitPayInfo> newUnitPayInfos = new ArrayList<SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitPayInfo>();
		newUnitInfo.setPayInfos(newUnitPayInfos);
		SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitPayInfo newUnitPayInfo = new SetlacFundmgntctrlPageModifyRequestV1Biz.New.UnitInfo.UnitPayInfo();
		newUnitPayInfos.add(newUnitPayInfo);
		newUnitPayInfo.setOacclof("2");

		// �������ύ�ı����ؿͻ���������ñ����Զ��ύ��ɵ���
		System.out.println(client.buildPostForm(request));
	}

}
