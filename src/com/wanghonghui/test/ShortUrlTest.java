package com.wanghonghui.test;

import com.alibaba.fastjson.JSONObject;
import com.wanghonghui.utils.HttpRequestUtils;

public class ShortUrlTest {
    public static void main(String[] args) {
        String jsonData = HttpRequestUtils.sendPost("https://api.uomg.com/api/long2dwz?dwzapi=urlcn&url=http://qrpay.uomg.com", "");
        if (!"".equals(jsonData) && null != jsonData) {
            JSONObject jsonObject = JSONObject.parseObject(jsonData);
            String ae_url = (String)jsonObject.get("ae_url");
            System.out.println(ae_url);
        }
    }
}
