package com.wanghonghui.utils;

public class StringUtils {

    /**
     * 校验手机号
     *
     * @param mobile
     * @return
     */
    public static Boolean checkMobile(String mobile) {
        boolean flag = true;
        if (mobile.equals(null)) {
            flag = false;
				/*^匹配开始地方$匹配结束地方，[3|4|5|7|8]选择其中一个{4,8},\d从[0-9]选择
				{4,8}匹配次数4~8	，java中/表示转义，所以在正则表达式中//匹配/,/匹配""*/
            //验证手机号码格式是否正确
        } else if (!mobile.matches("^1[3|4|5|7|8][0-9]\\d{4,8}$")) {
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }
}
