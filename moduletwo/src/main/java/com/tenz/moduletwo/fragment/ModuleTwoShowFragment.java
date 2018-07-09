package com.tenz.moduletwo.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tenz.modulelib.base.BaseFragment;
import com.tenz.moduletwo.R;

/**
 * Author: TenzLiu
 * Time: 2018/7/5 17:16
 * Desc:
 */

@Route(path = "/moduletwo/showfragment")
public class ModuleTwoShowFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_two_show;
    }

}
