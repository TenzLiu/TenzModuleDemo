package com.tenz.moduletwo.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tenz.modulelib.base.BaseActivity;
import com.tenz.modulelib.util.ToastUtil;
import com.tenz.moduletwo.R;
import com.tenz.moduletwo.R2;

import butterknife.BindView;

/**
 * Author: TenzLiu
 * Time: 2018/7/4 15:24
 * Desc:
 */

@Route(path = "/moduletwo/main")
public class ModuleTwoMainActivity extends BaseActivity {

    @BindView(R2.id.tv_parameter)
    TextView tv_parameter;

    @Autowired
    String name;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_two_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        ARouter.getInstance().inject(this);
    }

    @Override
    protected void initData() {
        super.initData();
        tv_parameter.setText("我是接收到的参数name:"+name);
    }

}
