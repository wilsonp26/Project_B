
package edu.up.projectb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
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

        //Makes the board smaller
        board = Bitmap.createScaledBitmap(board, 1112, 834, false);
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(board, 0, 130, null);

        //This is the beginning of the color declaration section
        Paint spaceGrey = new Paint();
        spaceGrey.setColor(0xFF343d46);
        spaceGrey.setStyle(Paint.Style.FILL);

        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);

        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);

        Paint yellow = new Paint();
        yellow.setColor(Color.YELLOW);
        yellow.setStyle(Paint.Style.FILL);

        //end of the declaration section

        //The drawCircles draw the head of the piece, and the rectangles draw the body
        canvas.drawCircle(420, 250, 15, spaceGrey);
        canvas.drawRect(415,250, 425, 280,spaceGrey);

        canvas.drawCircle(420, 250, 15, red);
        canvas.drawRect(415,250, 425, 280,red);

        canvas.drawCircle(420, 250, 15, blue);
        canvas.drawRect(415,250, 425, 280,blue);

        canvas.drawCircle(420, 250, 15, green);
        canvas.drawRect(415,250, 425, 280,green);

        canvas.drawCircle(420, 250, 15, yellow);
        canvas.drawRect(415,250, 425, 280,yellow);

    }

}

// Attributions for the assets used in this project:
// https://www.sprinttosave.com/product-p-674011.html
