package com.tenz.modulemain.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tenz.modulelib.base.BaseActivity;
import com.tenz.modulelib.util.ToastUtil;
import com.tenz.modulemain.R;
import com.tenz.modulemain.R2;

import butterknife.OnClick;

/**
 * Author: TenzLiu
 * Time: 2018/7/5 17:06
 * Desc:
 */

public class ShowFragmentActivity extends BaseActivity {

    private Fragment fragmentModuleOneShow;
    private Fragment fragmentMmoduleTwoShow;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_show_fragment;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        fragmentModuleOneShow = (Fragment) ARouter.getInstance()
                .build("/moduleone/showfragment")
                .navigation();
        fragmentMmoduleTwoShow = (Fragment) ARouter.getInstance()
                .build("/moduletwo/showfragment")
                .navigation();
    }

    @Override
    protected void initData() {
        super.initData();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fl_fragment,fragmentModuleOneShow);
        beginTransaction.add(R.id.fl_fragment,fragmentMmoduleTwoShow);
        beginTransaction.show(fragmentModuleOneShow).hide(fragmentMmoduleTwoShow).commit();
    }

    @OnClick({R2.id.tv_moduleone_fragment,R2.id.tv_moduletwo_fragment})
    public void onClick(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(view.getId() == R.id.tv_moduleone_fragment){
            fragmentTransaction.show(fragmentModuleOneShow).hide(fragmentMmoduleTwoShow).commit();
        }else if(view.getId() == R.id.tv_moduletwo_fragment){
            fragmentTransaction.show(fragmentMmoduleTwoShow).hide(fragmentModuleOneShow).commit();
        }
    }

}
