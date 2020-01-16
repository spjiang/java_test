package com.spjiang.app;

import java.math.BigDecimal;

public class JavaBigDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.45600");
        System.out.println(d1.compareTo(d2)); // 0
    }
}
