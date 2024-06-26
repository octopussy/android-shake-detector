package safety.com.br.android_shake_detector.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author netodevel
 */
public class ShakeBroadCastReceiver extends BroadcastReceiver {

    private ShakeCallback callback;

    public ShakeBroadCastReceiver() {
    }

    public ShakeBroadCastReceiver(ShakeCallback callback) {
        this.callback = callback;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("ShakeBroadCastReceiver", "AAAAAAAAAA");
        if (null != intent && intent.getAction().equals("private.shake.detector")) {
            this.callback.onShake();
        }
    }

}
