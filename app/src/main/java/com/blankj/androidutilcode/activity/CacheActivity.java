package com.blankj.androidutilcode.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseActivity;
import com.blankj.utilcode.util.CacheUtils;
import com.blankj.utilcode.util.LogUtils;

public class CacheActivity extends BaseActivity {

    private EditText mContextEt;
    private TextView mShowTv;

    public void saveToCache(View view) {
        String content = mContextEt.getText().toString();
        LogUtils.d("content=" + content);
        if (!TextUtils.isEmpty(content)) {
            CacheUtils.getInstance().put("content", content);
        }
    }

    public void showFromCache(View view) {
        String content = CacheUtils.getInstance().getString("content", "dont exist");
        mShowTv.setText(content);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_cache;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        mContextEt = (EditText) view.findViewById(R.id.et_content);
        mShowTv = (TextView) view.findViewById(R.id.tv_show);
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
