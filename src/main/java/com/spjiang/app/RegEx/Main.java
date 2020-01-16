package com.spjiang.app.RegEx;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String encoded = URLEncoder.encode("中文 !", StandardCharsets.UTF_8);
        System.out.println(encoded);

        String s = "18580119882";
        boolean r = isValidMobileNumber(s);
        System.out.println(r);
    }

    static boolean isValidMobileNumber(String s) {
        return s.matches("\\d{11}");
    }
}
