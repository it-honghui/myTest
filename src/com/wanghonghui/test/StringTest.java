package com.wanghonghui.test;

public class StringTest {
    /**
     * 如果A中包含B
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] reptile_user_agent = new String[1];
        reptile_user_agent[0] = "python-requests/2.18.4";
        boolean flag = false;
        if (reptile_user_agent != null) {
            for (int i = 0; i < reptile_user_agent.length; i++) {
                if ("python-requests/2.18.4111112222".indexOf(reptile_user_agent[i]) != -1) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
