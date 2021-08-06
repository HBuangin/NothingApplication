package com.nxzzld.nothingappication.net;


import com.nxzzld.nothingappication.net.api.entity.UserEntity;
import com.nxzzld.nothingappication.utils.SPUtil;

public class LocalStorage {
    private static final String TOKEN = "token";
    private static final String USER = "user";

    public static void saveUser(UserEntity.UserBean entity) {
        SPUtil.INSTANCE.saveObject(USER, entity);
    }

    public static void saveToken(String token) {
        SPUtil.INSTANCE.saveString(TOKEN, token);
    }

    public static String getToken() {
        return SPUtil.INSTANCE.getString(TOKEN, "");
    }

    public static UserEntity.UserBean getUser() {
        return SPUtil.INSTANCE.getObject(USER, UserEntity.UserBean.class);
    }

    public static void saveMember(UserEntity.UserBean.MemberBean memberBean) {
        UserEntity.UserBean userBean = LocalStorage.getUser();
        userBean.setMember(memberBean);
        LocalStorage.saveUser(userBean);
    }

    public static void exitLogin() {
        SPUtil.INSTANCE.remove(TOKEN);
        SPUtil.INSTANCE.remove(USER);
    }
}
