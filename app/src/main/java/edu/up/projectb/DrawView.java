
package edu.up.projectb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.ImageView;

public class DrawView extends SurfaceView {
    private Bitmap board =
            BitmapFactory.decodeResource(getResources(), R.drawable.coloredboard);

  //  private Bitmap artTwo =
  //          BitmapFactory.decodeResource(getResources(), R.drawable.arttwo);
private Paint green = new Paint();

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        green.setColor(0xFF00FF00);
        green.setStyle(Paint.Style.FILL);
        board = Bitmap.createScaledBitmap(board, 1112, 834, false);
       // artTwo = Bitmap.createScaledBitmap(artTwo, 50, 60, false);
    }
    @Override
    public void onDraw(Canvas canvas) {
      //  canvas.drawRect(0, 0, 4000, 4000, green);
        //canvas.drawBitmap(artTwo, 0, 130, null);
        canvas.drawBitmap(board, 0, 130, null);


    }

}

