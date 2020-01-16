package com.spjiang.app.hash;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("8ae6ae71a75d3fb2e0225deeb004faf95d816a0a58093eb4cb5a3aa0f197050d7a4dc0a2d5c6fbae5fb5b0d536a0a9e6b686369fa57a027687c3630321547596".length());
        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest(); // 20 bytes: 6f44e49f848dd8ed27f73f59ab5bd4631b3f6b0d
        System.out.println(new BigInteger(1, result).toString(16));
    }
}

