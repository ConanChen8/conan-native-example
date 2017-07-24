package com.conannativeexample;

/**
 * Created by ConanChen on 2017/7/24.
 */

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConanNativeExamplePackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
//        return Arrays.asList(new NativeModule[]{
//                new ConanNativeExampleModule(reactContext),
//        });
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new ConanNativeExampleModule(reactContext));

        return modules;
    }
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

}
