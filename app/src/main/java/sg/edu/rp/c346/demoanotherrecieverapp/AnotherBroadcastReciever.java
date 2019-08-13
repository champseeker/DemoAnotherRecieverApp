package sg.edu.rp.c346.demoanotherrecieverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received in AnotherBroadcastReceiver", Toast.LENGTH_LONG).show();
    }

}
