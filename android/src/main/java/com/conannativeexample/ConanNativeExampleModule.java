package com.conannativeexample;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.String;
public class ConanNativeExampleModule extends ReactContextBaseJavaModule {
    public ConanNativeExampleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "ConanExample";
    }
    @ReactMethod
    public void showlog(Callback callback){
        callback.invoke("Native Modules Android");
    }
}