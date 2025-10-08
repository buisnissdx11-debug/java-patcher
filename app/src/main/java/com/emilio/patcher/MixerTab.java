package com.emilio.patcher;

import android.content.Context;
import android.widget.LinearLayout;

public class MixerTab extends LinearLayout {
    public MixerTab(Context context) {
        super(context);
        setOrientation(VERTICAL);
        addView(new ModuleView(context, "Oscillator"));
        addView(new EQModuleView(context));
        addView(new ModuleView(context, "Reverb"));
    }
}
