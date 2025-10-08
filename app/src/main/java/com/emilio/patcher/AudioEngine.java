package com.emilio.patcher;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioEngine {
    MediaPlayer player;

    public void play(Context context, int resId) {
        player = MediaPlayer.create(context, resId);
        player.start();
    }

    public void stop() {
        if (player != null) player.stop();
    }
}
