package com.bird_brown.overlayapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class BackView extends View {

    public BackView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Paintクラスのオブジェクトを生成
        Paint paint = new Paint();

        //色は赤に設定
        paint.setColor(Color.RED);

        //四角形を描画　＊四角形は左上座標(x, y)=(50, 150)、右下座標(x, y)=(450, 250)
        canvas.drawRect(50, 150, 450, 250, paint);
    }
}
