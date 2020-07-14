package com.icbc.api.request;

import com.icbc.api.AbstractIcbcRequest;
import com.icbc.api.BizContent;
import com.icbc.api.IcbcResponse;
import com.icbc.api.internal.util.fastjson.annotation.JSONField;

/**
 * @Author: kfzx-lihh
 * @Description: 页面服务请求类
 * @Date: 2019/10/23
 */
public class MyBankCustomerCreateAccountRequestV1 extends AbstractIcbcRequest<IcbcResponse> {

    public static class MyBankCustomerCreateAccountRequestV1Biz implements BizContent {

        /** 客户名称 */
        @JSONField(name = "cust_name")
        private String custName;
        /** 客户证件类型 */
        @JSONField(name = "cert_type")
        private String certType;
        /** 证件号码 */
        @JSONField(name = "cert_code")
        private String certCode;
        /** 客户类型 */
        @JSONField(name = "cust_type")
        private String custType;
        /** 客户管理行 */
        @JSONField(name = "busi_area")
        private String busiArea;
        /** 创建柜员编号 */
        @JSONField(name = "emp_code")
        private String empCode;
        /** 创建柜员所属机构 */
        @JSONField(name = "area_code")
        private String areaCode;
        /** 证件到期日 */
        @JSONField(name = "cert_valid")
        private String certValid;
        /** 是否可修改 */
        @JSONField(name = "modify_flag")
        private String modifyFlag;

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getCertType() {
            return certType;
        }

        public void setCertType(String certType) {
            this.certType = certType;
        }

        public String getCertCode() {
            return certCode;
        }

        public void setCertCode(String certCode) {
            this.certCode = certCode;
        }

        public String getCustType() {
            return custType;
        }

        public void setCustType(String custType) {
            this.custType = custType;
        }

        public String getBusiArea() {
            return busiArea;
        }

        public void setBusiArea(String busiArea) {
            this.busiArea = busiArea;
        }

        public String getEmpCode() {
            return empCode;
        }

        public void setEmpCode(String empCode) {
            this.empCode = empCode;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getCertValid() {
            return certValid;
        }

        public void setCertValid(String certValid) {
            this.certValid = certValid;
        }

        public String getModifyFlag() {
            return modifyFlag;
        }

        public void setModifyFlag(String modifyFlag) {
            this.modifyFlag = modifyFlag;
        }
    }

    @Override
    public Class<IcbcResponse> getResponseClass() {
        return null;
    }

    @Override
    public boolean isNeedEncrypt() {
        return false;
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    @Override
    public Class<? extends BizContent> getBizContentClass() {
        return MyBankCustomerCreateAccountRequestV1Biz.class;
    }

}