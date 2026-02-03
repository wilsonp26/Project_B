
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


    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        board = Bitmap.createScaledBitmap(board, 1482, 1112, false);
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(board, 40, 20, null);
    }

}

