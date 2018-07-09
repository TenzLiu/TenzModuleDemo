package com.tenz.moduleone.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tenz.modulelib.base.BaseFragment;
import com.tenz.moduleone.R;

/**
 * Author: TenzLiu
 * Time: 2018/7/5 17:16
 * Desc:
 */

@Route(path = "/moduleone/showfragment")
public class ModuleOneShowFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_one_show;
    }

}
