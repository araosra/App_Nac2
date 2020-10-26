package com.example.alarmenac2;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.media.Ringtone;
        import android.media.RingtoneManager;
        import android.net.Uri;

public class AppNac2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Uri tempo = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if (tempo == null){
            tempo = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }

        Ringtone ringtone = RingtoneManager.getRingtone(context, tempo);
        ringtone.play();
    }
}
