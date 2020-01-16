package com.spjiang.app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JavaCommonsLogging {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(JavaCommonsLogging.class);
        log.info("start...");
        log.warn("end.");
    }
}