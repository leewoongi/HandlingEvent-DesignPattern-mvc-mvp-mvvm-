package com.prography.myapplication.util;

import android.app.Activity;
import android.view.WindowManager;

public class Util {
    public static void noStatusBar(Activity activity){
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
