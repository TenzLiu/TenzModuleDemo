package com.tenz.modulemain.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tenz.modulelib.base.BaseActivity;
import com.tenz.modulemain.R;
import com.tenz.modulemain.R2;

import butterknife.OnClick;

/**
 * Author: TenzLiu
 * Time: 2018/7/4 10:19
 * Desc:
 */

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);

    }

    @Override
    protected void initData() {
        super.initData();

    }

    @OnClick({R2.id.tv_module_one,R2.id.tv_module_two,R2.id.tv_module_fragment})
    public void onClick(View view){
        if(view.getId() == R.id.tv_module_one){
            // 1. 应用内简单的activity跳转
            ARouter.getInstance().build("/moduleone/main")
                    .navigation();
        }else if(view.getId() == R.id.tv_module_two){
            // 2. 应用内简带参数的activity跳转
            ARouter.getInstance().build("/moduletwo/main")
                    .withString("name","TenzLiu")
                    .navigation();
        }else if(view.getId() == R.id.tv_module_fragment){
            // 3. 应用内fragment的获取
            Intent intent = new Intent(this,ShowFragmentActivity.class);
            startActivity(intent);
        }
    }

}
