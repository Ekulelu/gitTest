package com.royole.ekulelu.jnitest;

/**
 * Created by Ekulelu on 16/8/1.
 */
public class JNIUtil {
    static {
        System.loadLibrary("NdkJniDemo");//之前在build.gradle里面设置的so名字，必须一致
    }

    public static native String getStringFormC();
}
