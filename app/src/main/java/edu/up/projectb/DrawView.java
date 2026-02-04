
package edu.up.projectb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class DrawView extends SurfaceView {
    private Bitmap board =
            BitmapFactory.decodeResource(getResources(), R.drawable.coloredboard);

private Paint green = new Paint();

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        green.setColor(0xFF00FF00);
        green.setStyle(Paint.Style.FILL);
        board = Bitmap.createScaledBitmap(board, 1112, 834, false);
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(board, 0, 130, null);
    }

}

