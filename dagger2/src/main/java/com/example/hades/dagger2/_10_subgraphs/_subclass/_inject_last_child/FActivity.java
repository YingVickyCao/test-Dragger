package com.example.hades.dagger2._10_subgraphs._subclass._inject_last_child;

import com.example.hades.dagger2.Log;

import javax.inject.Inject;

public class FActivity {
    private static final String TAG = FActivity.class.getSimpleName();
    @Inject
    protected A mA;

    public void onCreate() {
        System.out.println("START_FActivity_onCreate");
//        testF();
        // ERROR:When need some injected obj, NullPointerException
        Log.d(TAG,"ERROR:When need some injected obj, NullPointerException");
        System.out.println("END_FActivity_onCreate");
        System.out.println();
    }

    public void testF() {
        Log.d(TAG, "testF," + mA.info());
    }
}