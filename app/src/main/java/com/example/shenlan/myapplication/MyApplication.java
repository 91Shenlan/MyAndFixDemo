package com.example.shenlan.myapplication;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by shenlan on 2016/7/24.
 */
public class MyApplication extends Application {
    private static final String TAG="euler";
    private static final String APATCH_PATH = "/Download/out.apatch";
    private PatchManager mPatchManager;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化patch管理类
        mPatchManager=new PatchManager(this);
        // 初始化patch版本
        mPatchManager.init("1.0");
        Log.d(TAG,"inited");
        // 加载已经添加到PatchManager中的patch
        mPatchManager.loadPatch();
        Log.d(TAG,"apatch loaded");
        String patchFileString= Environment.getExternalStorageDirectory().getAbsolutePath()+APATCH_PATH;
        try {
            //添加patch，只需指定patch的路径即可，补丁会立即生效
            mPatchManager.addPatch(patchFileString);
            Log.d(TAG, "apatch:" + patchFileString + " added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
