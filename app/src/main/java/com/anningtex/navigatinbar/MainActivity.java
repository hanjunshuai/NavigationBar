package com.anningtex.navigatinbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultNavigationBar navigationBar =
                new DefaultNavigationBar
                        .Builder(this, (ViewGroup) findViewById(R.id.layout))
                        .setTitle("投稿")
                        .setRightText("发布")
                        .setRightClickListener(v -> Toast.makeText(MainActivity.this, "发布", Toast.LENGTH_SHORT).show())
                        .setLeftText("left")
                        .setLeftClickListener(v -> Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show())
                        .setLeftTextClickListener(v -> Toast.makeText(this, "left", Toast.LENGTH_SHORT).show())
                        .builder();

        // 按返回默认关闭
        // 布局稍微完善一下
        // R.layout.title_bar 布局最好用（ToolBar 运用系统MD动画）
        //
    }
}
