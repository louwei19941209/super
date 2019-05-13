package com.springmvc.commons.util;

import java.util.ResourceBundle;

public class GetProperties {
    private static final String JDBC_PROPERTY_FILE_NAME = "jdbc";

    private static ResourceBundle bundle = ResourceBundle.getBundle(JDBC_PROPERTY_FILE_NAME);

    public static String get(String key) {
        return bundle.getString(key);
    }

}
