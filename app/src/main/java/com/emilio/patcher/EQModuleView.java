package com.emilio.patcher;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class EQModuleView extends LinearLayout {
    public EQModuleView(Context context) {
        super(context);
        setOrientation(VERTICAL);
        setPadding(20, 20, 20, 20);

        String[] bands = {"60Hz", "150Hz", "400Hz", "1kHz", "2.5kHz", "6kHz"};
        for (String label : bands) {
            TextView title = new TextView(context);
            title.setText(label);
            addView(title);

            SeekBar slider = new SeekBar(context);
            slider.setMax(100);
            slider.setProgress(50);
            addView(slider);
        }
    }
}
