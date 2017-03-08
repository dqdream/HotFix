package com.dq.dqdream.dynamicupdate;

import android.app.Application;
import android.os.Environment;

/**
 * Created by DQ on 2017/3/8.
 */
public class HotApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
//        String patchFileString = Environment.getExternalStorageDirectory()
//                .getAbsolutePath() +"/out.apatch";
//        HotFixManager.getInstance().hotFixPatch(this, "1.0", patchFileString);
    }
}
