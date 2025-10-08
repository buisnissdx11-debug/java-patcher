package com.emilio.patcher;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class WireView extends View {
    List<Pair<Point, Point>> wires = new ArrayList<>();
    Point startPoint = null;
    Point tempPoint = null;

    public WireView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(0xFF00FF00);
        paint.setStrokeWidth(5);

        for (Pair<Point, Point> wire : wires) {
            canvas.drawLine(wire.first.x, wire.first.y, wire.second.x, wire.second.y, paint);
        }

        if (startPoint != null && tempPoint != null) {
            canvas.drawLine(startPoint.x, startPoint.y, tempPoint.x, tempPoint.y, paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startPoint = new Point((int) event.getX(), (int) event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                tempPoint = new Point((int) event.getX(), (int) event.getY());
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                wires.add(new Pair<>(startPoint, new Point((int) event.getX(), (int) event.getY())));
                startPoint = null;
                tempPoint = null;
                invalidate();
                break;
        }
        return true;
    }
}
