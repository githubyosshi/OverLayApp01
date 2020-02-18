package com.bird_brown.overlayapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class FrontView extends View {   //activity_mainにFrontViewクラスを表示

    public FrontView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);   //引数canvasに絵を描く

        //Paintクラスのオブジェクトを生成
        Paint paint = new Paint();

        //色は黄色に設定
        paint.setColor(Color.YELLOW);

        //円を描画　＊円は中心座標(x, y)=(250, 200)で半径100
        canvas.drawCircle(250, 200, 100, paint);
    }
}
