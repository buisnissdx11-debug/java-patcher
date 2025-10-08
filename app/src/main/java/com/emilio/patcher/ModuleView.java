package com.emilio.patcher;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class ModuleView extends LinearLayout {
    public ModuleView(Context context, String name) {
        super(context);
        setOrientation(VERTICAL);
        setPadding(20, 20, 20, 20);

        TextView title = new TextView(context);
        title.setText(name);
        addView(title);

        SeekBar volume = new SeekBar(context);
        volume.setMax(100);
        volume.setProgress(75);
        addView(volume);
    }
}
