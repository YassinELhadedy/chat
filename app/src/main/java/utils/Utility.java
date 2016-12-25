package utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.firebase.codelab.friendlychat.R;

/**
 * Created by Elhadedy on 12/24/2016.
 */

public class Utility {
    public static void setFirebaseInstanceId(Context context, String InstanceId) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor;
        editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.pref_firebase_instance_id_key),InstanceId);
        editor.apply();
    }

    public static String getFirebaseInstanceId(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String key = context.getString(R.string.pref_firebase_instance_id_key);
        String default_value = context.getString(R.string.pref_firebase_instance_id_default_key);
        return sharedPreferences.getString(key, default_value);
    }
}
