package com.tenz.moduleone.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tenz.modulelib.base.BaseActivity;
import com.tenz.moduleone.R;

/**
 * Author: TenzLiu
 * Time: 2018/7/4 15:06
 * Desc:
 */

@Route(path = "/moduleone/main")
public class ModuleOneMainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_one_main;
    }

}
