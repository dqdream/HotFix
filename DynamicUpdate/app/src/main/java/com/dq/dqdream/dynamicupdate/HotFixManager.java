package com.dq.dqdream.dynamicupdate;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by DQ on 2017/2/27.
 */
public class HotFixManager {
    private  static String TAG="HotFixManager";
    private  static HotFixManager hotFixManager;
    private Context mContext;
    private PatchManager mPatchManager;
    public static HotFixManager getInstance(){
        if (hotFixManager == null){
            hotFixManager=new HotFixManager();
        }
        return hotFixManager;
    }

    private HotFixManager (){}

    public void hotFixPatch(Context mContext,String appVersion,String mPath){
        mPatchManager = new PatchManager(mContext);
        mPatchManager.init(appVersion);
        Log.d(TAG, "PatchManager inited.");
        mPatchManager.loadPatch();
        Log.d(TAG, "PatchManager apatch loaded.");
        try {
            mPatchManager.addPatch(mPath);
            Log.d(TAG, "PatchManager apatch:" + mPath + " added.");
        } catch (IOException e) {
            Log.e(TAG, "", e);
        }
//        mPatchManager.removeAllPatch();
    }

}
