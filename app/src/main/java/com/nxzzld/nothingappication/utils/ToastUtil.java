package com.nxzzld.nothingappication.utils;

import android.widget.Toast;

public class ToastUtil {
    public static void show(String msg) {
        Toast.makeText(Utils.getApp(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(String msg) {
        Toast.makeText(Utils.getApp(), msg, Toast.LENGTH_LONG).show();
    }
}
