package com.icbc.api;


import com.icbc.api.request.JftUiVendorCloudCommonRequestV1;
import com.icbc.api.request.JftUiVendorCloudCommonRequestV1.JftUiVendorCloudCommonRequestV1Biz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 聚富通云鉴证子商户注册银行账户信息页测试类
 */
public class JftUiVendorCloudBankInfoAddTestV1 extends HttpServlet {

    private static final long serialVersionUID = 4578592096932183536L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            String appId = "10000000000000004473";
            String myPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ42tqQomxbLvuZTVKO4bBLwGp8SzRMiJ7jX9JNlS4sqmZzs9Z4lw/SSxf4dF9JJUErpNReUjzLp0As2FiuV8BALh6GYmiHGTWx7+v3HuWH9LiZNI00Ia+1HfpkJ8Sao8Ny5h1Pu49LayVleeLy496+phRE81dqlqaSHH8cKWnK1AgMBAAECgYBxod5f3QI2xzNe/e7GgAivOWAFbF16JofdDM4Opyww0fHucYqfgYRSPrCRqJeZYyqWAxUs0HhhGulfhAM8Xr5BxY5//x4HDqE2rOF7mrc/xkWNL+S9X5U0T8cdA3fnF/rYAUnJjKmeliuD2gcf5xYJENcnb8p/GQbiwIjoHDqe6QJBANzcevl9ke4cx1fa3ZcxVS3A1eHVtp573M/lo+8pRJlrf96ghFB54CzumsC0F7YfojDgCAN2egTqCGqNOuPJWWcCQQC3YqT5xlMlGk6Agav5Y6E5blx/AKJB8DeZSbjXLvytpXOASzoNR/A40uQXanXVqNU68l96FSq415AmTHi9OdWDAkA0el7t8Rw/i68B/Qsx5ZLrsCoh4vnlZmDtNQ9iwFeAbL6RU2qdBJhzlK5Io4IO0C1ll5XP3NLZYBJn3u7jOPB5AkEAiM/qHoHsM8j9effD0kmW1V7VWNajNqg9AnoykS73yaCem78DrzbVK7+B9UoyYNUVR2Xc/xpdhgsj+r6gcSN9ewJANSmxYF34601mteAnZwhyGKCJomiuSMNTr52i2uTspdZi0zqaerI1EGD3dAENxRebyPmPFxhwCcCbzF2gNUr1fw==";

            UiIcbcClient client = new UiIcbcClient(appId, myPrivateKey, IcbcConstants.CHARSET_UTF8);

            JftUiVendorCloudCommonRequestV1 request = new JftUiVendorCloudCommonRequestV1();
            request.setServiceUrl("https://ip:port/ui/jft/ui/vendor/cloud/bank/info/add/V1");

            JftUiVendorCloudCommonRequestV1Biz bizContent = new JftUiVendorCloudCommonRequestV1Biz();
            bizContent.setVendorToken("66666666660055005501");
            request.setBizContent(bizContent);

            resp.setHeader("Content-Type", "text/html;charset="
                    + IcbcConstants.CHARSET_UTF8);
            PrintWriter out = resp.getWriter();
            // System.out.println(client.buildPostForm(request));

            out.write("<html>");
            out.write("<head>");
            out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset="
                    + IcbcConstants.CHARSET_UTF8 + "\">");
            out.write("</head>");
            out.write("<body>");
            out.write(client.buildPostForm(request));
            out.write("</body>");
            out.write("</html>");
            out.flush();
            out.close();
        } catch (IcbcApiException e) {
            e.printStackTrace();
        }
    }

}


