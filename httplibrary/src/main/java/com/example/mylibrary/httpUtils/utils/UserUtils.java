package com.example.mylibrary.httpUtils.utils;

import android.content.Context;

public class UserUtils {

    public static String IS_LOGIN = "is_login";//是否登录
    public static String LOGIN_TYPE = "login_type";//登录方式 wx qq
    public static String SCREENHEIGHT = "screenheight";
    public static String SCREENWIDTH = "screenwidth";
    public static String TOKEN_LOGIN = "token_login";//登录 token
    public static String TOKEN_RY = "token_ry";//融云token
    public static String PHONE_NUM = "phone_num";
    public static String NICE_NAME = "nice_name";
    public static String NICE_IMG_URL = "nice_img_url";
    public static String SEX = "sex";//性别
    public static String LINK_URL_TITLE = "link_url_title";//网页标题
    public static String LINK_URL = "link_url";//网址
    public static String SpSaveLoadFileName = "SP_SAVE_LOADFILENAME";//下载好的svg保存姓名

    //退出登录时候调用
    public static void clearLoginInfo(Context context) {
        SPUtil.put(context, IS_LOGIN, "false");
        SPUtil.put(context, TOKEN_LOGIN, "");
        SPUtil.put(context, NICE_NAME, "");
        SPUtil.put(context, NICE_IMG_URL, "");//退出登录后 不清除
        SPUtil.put(context, TOKEN_RY, "");
    }

    //保存手机号码
    public static void savePhoneNum(Context context, String phoneNum) {
        SPUtil.put(context, PHONE_NUM, phoneNum);
    }

    //昵称
    public static void saveNiceName(Context context, String niceName) {
        SPUtil.put(context, NICE_NAME, niceName);
    }

    //头像url
    public static void saveNiceImgUrl(Context context, String niceImgUrl) {
        SPUtil.put(context, NICE_IMG_URL, niceImgUrl);
    }

    //token
    public static void saveToken(Context context, String token) {
        SPUtil.put(context, TOKEN_LOGIN, token);
    }

    //融云token
    public static void saveRyToken(Context context, String token) {
        SPUtil.put(context, TOKEN_RY, token);
    }

    //性别
    public static void saveSex(Context context, String sex) {
        SPUtil.put(context, SEX, sex);
    }

    //-------------------判断是否登录-------------------
    //是否登录
    public static boolean isLogin(Context context) {
        String code = (String) SPUtil.get(context, IS_LOGIN, "false");
        if (code.equals("true")) {
            return true;
        }
        return false;
    }

    //设置为登录状态
    public static void setUserIsLogin(Context context) {
        SPUtil.put(context, IS_LOGIN, "true");
    }
}
