package com.kerrel.stroketextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kerrel.libstroketextview.StrokeTextView;

public class StrokeTextViewActivity extends AppCompatActivity {

    private StrokeTextView mStrokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroke_text_view);
        mStrokeTextView = (StrokeTextView) findViewById(R.id.strokeTextView);

        mStrokeTextView.setStrokeColor(Color.parseColor("#FFFFFF"));
        mStrokeTextView.setStrokeWidth(2.0f);
        mStrokeTextView.setStroke(true);
    }
}
