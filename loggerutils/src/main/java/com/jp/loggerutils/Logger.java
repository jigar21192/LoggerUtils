package com.jp.loggerutils;

import android.util.Log;


public class Logger {

    private static String LOG_TAG = "Logger ";
    private static boolean isDebug = true;

    public static void i(String i) {
        if (isDebug) {
            Log.i(LOG_TAG, "" + i);
        }
    }

    public static void d(String d) {
        if (isDebug) {
        }
    }

    public static void v(String v) {
        if (isDebug) {
            Log.v(LOG_TAG, "" + v);
        }
    }

    public static void w(String w) {
        if (isDebug) {
            Log.w(LOG_TAG, "" + w);
        }
    }

    public static void e(String e) {
        if (isDebug) {
            Log.e(LOG_TAG, "" + e);
        }
    }
}
