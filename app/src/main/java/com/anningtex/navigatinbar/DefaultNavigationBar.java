package com.anningtex.navigatinbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.anningtex.navigatinbar.navigationbar.AbsNavigationBar;

public class DefaultNavigationBar extends AbsNavigationBar<DefaultNavigationBar.Builder.DefaultNavigationBarParams> {
    public DefaultNavigationBar(Builder.DefaultNavigationBarParams params) {
        super(params);
    }

    @Override
    public int bindLayoutId() {
        return R.layout.title_bar;
    }

    @Override
    public void applyView() {
        // 绑定效果
        setText(R.id.title, getmParams().mTitle);
        setText(R.id.right_text, getmParams().mRightText);

        setOnClickListener(R.id.right_text, getmParams().mRightClickListener);

        // 左边 要写一个默认的 finishActivity

    }

    public static class Builder extends AbsNavigationBar.Builder {
        DefaultNavigationBarParams p;

        public Builder(Context context, ViewGroup parent) {
            super(context, parent);
            p = new DefaultNavigationBarParams(context, parent);
        }

        @Override
        public DefaultNavigationBar builder() {
            DefaultNavigationBar navigationBar = new DefaultNavigationBar(p);
            return navigationBar;
        }

        // 1、设置所有效果
        public DefaultNavigationBar.Builder setTitle(String title) {
            p.mTitle = title;
            return this;
        }

        public DefaultNavigationBar.Builder setRightText(String rightText) {
            p.mRightText = rightText;
            return this;
        }

        public DefaultNavigationBar.Builder setRightIcon(int rightIconRes) {
            p.mRightIconRes = rightIconRes;
            return this;
        }

        public DefaultNavigationBar.Builder setRightClickListener(View.OnClickListener rightClickListenerightClickListener) {
            p.mRightClickListener = rightClickListenerightClickListener;
            return this;
        }

        public static class DefaultNavigationBarParams extends AbsNavigationBar.Builder.AbsNavigationBarParams {
            public String mTitle;
            public String mRightText;
            public int mRightIconRes;
            public View.OnClickListener mRightClickListener;

            // 所有效果的放置

            public DefaultNavigationBarParams(Context context, ViewGroup parent) {
                super(context, parent);
            }
        }
    }
}
