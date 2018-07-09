package com.tenz.modulelib.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Author: TenzLiu
 * Time: 2018/7/4 11:05
 * Desc:
 */

public class ToastUtil {

    public static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

}
