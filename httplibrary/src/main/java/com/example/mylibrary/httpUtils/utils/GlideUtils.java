package com.example.mylibrary.httpUtils.utils;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class GlideUtils {

    //圆形预览头像  fixme 小图片不要用渐变，会加载不出来
    public static void glideCirclePerson(Context context, String imgurl, final ImageView img) {
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgurl = imgurl.replaceAll("amp;", "");//被转义了
        Glide.with(context.getApplicationContext())
                .load(imgurl)
                .into(img);
    }

    //无默认头像
    public static void glideDjImg(Context context, String imgurl, ImageView img) {
        Glide.with(context.getApplicationContext())
                .load(imgurl)
//                .transition(DrawableTransitionOptions.withCrossFade(500)) // 渐变
                .fitCenter()
                .into(img);
    }

    //banner
    public static void glideBannerImg(Context context, String imgurl, ImageView img) {
        Glide.with(context.getApplicationContext())
                .load(imgurl)
                .transition(DrawableTransitionOptions.withCrossFade(500)) // 渐变
//                .placeholder(R.drawable.)
//                .error(R.mipmap.ic_launcher)
                .fitCenter()
                .into(img);
    }

    //无错误预览
    public static void glideNoerrorPerImg(Context context, Object imgUrl, ImageView img) {
        Glide.with(context.getApplicationContext()).load(imgUrl)
                .transition(DrawableTransitionOptions.withCrossFade(500)) // 渐变
                .into(img);
    }
}
