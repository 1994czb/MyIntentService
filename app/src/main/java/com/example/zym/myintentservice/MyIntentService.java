package com.example.zym.myintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
        //调用父类的有参构造函数
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        //打印当前线程的id
        Log.d("MyIntentService", "This id is" + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "onDestroy executed");
    }
}
