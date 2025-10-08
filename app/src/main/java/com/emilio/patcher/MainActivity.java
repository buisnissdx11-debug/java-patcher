package com.emilio.patcher;

import android.os.Bundle;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabHost = new TabHost(this);
        tabHost.setup();

        TabHost.TabSpec mixerSpec = tabHost.newTabSpec("Mixer");
        mixerSpec.setContent(() -> new MixerTab(this));
        mixerSpec.setIndicator("🎛 Mixer");
        tabHost.addTab(mixerSpec);

        TabHost.TabSpec routingSpec = tabHost.newTabSpec("Routing");
        routingSpec.setContent(() -> new RoutingTab(this));
        routingSpec.setIndicator("🔀 Routing");
        tabHost.addTab(routingSpec);

        setContentView(tabHost);
    }
}
