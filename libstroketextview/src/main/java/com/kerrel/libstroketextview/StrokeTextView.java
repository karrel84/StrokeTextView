package com.kerrel.libstroketextview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/**
 * Created by 이주영 on 2017-06-27.
 */

public class StrokeTextView extends android.support.v7.widget.AppCompatTextView {

    private boolean isStroke = false;
    private float strokeWidth = 0.0f;
    private int strokeColor;

    public StrokeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        initView(context, attrs);
    }

    public StrokeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initView(context, attrs);
    }

    public StrokeTextView(Context context) {
        super(context);
    }

    private void initView(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.StrokeTextView);
        isStroke = a.getBoolean(R.styleable.StrokeTextView_textStroke, false);
        strokeWidth = a.getFloat(R.styleable.StrokeTextView_textStrokeWidth, 0.0f);
        strokeColor = a.getColor(R.styleable.StrokeTextView_textStrokeColor, 0xffffffff);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        if (isStroke) {
            ColorStateList states = getTextColors();
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(strokeWidth);
            setTextColor(strokeColor);
            super.onDraw(canvas);

            getPaint().setStyle(Paint.Style.FILL);
            setTextColor(states);
        }

        super.onDraw(canvas);
    }
}  
