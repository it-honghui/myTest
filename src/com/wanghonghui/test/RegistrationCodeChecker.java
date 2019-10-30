package com.wanghonghui.test;

import com.wanghonghui.utils.RSA;

import java.net.URL;

public class RegistrationCodeChecker
{

    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNxi9acieK2YDKb6G91gmfSiWbEMgHFyOyGhBQaNH+5T4ikbI4UQQcptu1hGoWjouNLqh6IkP7gfzDs3iNm/ZWb+h1a1cusXKAqZRwiGPKv9CXaUTAoenPeo14fAdhePF1+Xthsm5xFz6w2KuMAn99yzudmH6B/IQTXzxZRrsZ4QIDAQAB";
    public static void main(String[] args) {
        URL url = null;
        try {
            // 加密
            url = new URL("http://wechat.gathub.cn/");
            String host = url.getHost();
            String s = RSA.encryptByPublicKey(host, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNxi9acieK2YDKb6G91gmfSiWbEMgHFyOyGhBQaNH+5T4ikbI4UQQcptu1hGoWjouNLqh6IkP7gfzDs3iNm/ZWb+h1a1cusXKAqZRwiGPKv9CXaUTAoenPeo14fAdhePF1+Xthsm5xFz6w2KuMAn99yzudmH6B/IQTXzxZRrsZ4QIDAQAB");
            System.out.println(s);

            // 解密
//            String code = "RKJGRYUGnIWNReVod8xM/mS2f+2g0gnvOvtrc7KIvsZsHGTlE1SlTlqtLFLHQNosjWEQVi6y3AKnihbvuwHhmWWhqV85p338gdV7/8V54pjajUqUBZ3+Yc0BY0ArU45oN+Jpii/tbakibdFtTwr2M8kZwqazMLtb+4s3S4sKRfM=";
//            String decrypt = RSA.decryptByPublicKey(code, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCNxi9acieK2YDKb6G91gmfSiWbEMgHFyOyGhBQaNH+5T4ikbI4UQQcptu1hGoWjouNLqh6IkP7gfzDs3iNm/ZWb+h1a1cusXKAqZRwiGPKv9CXaUTAoenPeo14fAdhePF1+Xthsm5xFz6w2KuMAn99yzudmH6B/IQTXzxZRrsZ4QIDAQAB");
//            System.out.println(decrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
