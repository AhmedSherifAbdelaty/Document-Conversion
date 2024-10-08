package com.doc.conversion.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Utils {
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH-mm-ss";
    public static final String UPLOADED_FILE_DIR = "uploadedFiles";

    public static String getNowDateTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}
