package com.nxzzld.nothingappication.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;

public class SPUtil {
    public static SPUtil INSTANCE = new SPUtil();
    private static final String SP_NAME = "zzld";

    private SharedPreferences sharedPreferences;
    private Gson gson = new Gson();

    private SPUtil() {
        sharedPreferences = Utils.getApp().getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    }

    public void saveBoolean(String key, boolean value) {
        sharedPreferences.edit().putBoolean(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public void saveString(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();
    }

    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }

    public void saveObject(String key, Object value) {
        String objString = gson.toJson(value);
        saveString(key, objString);
    }

    public <T> T getObject(String key, Class<T> obj) {
        String objString = getString(key, "");
        if (TextUtils.isEmpty(objString)) return null;
        return gson.fromJson(objString, obj);
    }

    public void remove(String key) {
        sharedPreferences.edit().remove(key).apply();
    }
}
