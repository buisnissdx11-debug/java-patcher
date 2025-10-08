package com.emilio.patcher;

import android.content.Context;
import android.widget.FrameLayout;

public class RoutingTab extends FrameLayout {
    public RoutingTab(Context context) {
        super(context);
        WireView wireView = new WireView(context);
        addView(wireView);
    }
}
