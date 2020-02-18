package com.bird_brown.overlayapp01;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BackViewのオブジェクトを生成
        BackView back = new BackView(this);

        //作成したBackViewを描画に表示
        setContentView(back);

        //FrontViewのオブジェクトを生成
        FrontView front = new FrontView(this);

        //LinerLayout.LayoutParamsのオブジェクトを生成（画面全体に表示）
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);

        //FrontViewとBackViewを重ねて表示する
        addContentView(front, params);
    }
}
