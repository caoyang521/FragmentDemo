package com.atg.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment03();
    }

    public void click1(View v) {
        //1.创建Fragment对象
        Fragment01 fragment01=new Fragment01();
        //2.获取Fragment管理器
        FragmentManager fm = getFragmentManager();
        //3.打开事务
        FragmentTransaction ft = fm.beginTransaction();
        //4.设置Fragment01显示在帧布局中
        ft.replace(R.id.f,fragment01);
        //5.提交
        ft.commit();
    }
    public void click2(View v){
        Fragment02 fragment02=new Fragment02();
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.f,fragment02);
        ft.commit();
    }
    public void click3(View v){
        showFragment03();
    }

    private void showFragment03() {
        Fragment03 fragment03=new Fragment03();
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.f,fragment03);
        ft.commit();
    }

}
