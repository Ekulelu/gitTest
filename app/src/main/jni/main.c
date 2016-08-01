//
// Created by 黄政 on 16/8/1.
//
#include "com_royole_ekulelu_jnitest_JNIUtil.h"


/*
* Class:     Java_com_wobiancao_ndkjnidemo_ndk_JniUtils
* Method:    getStringFormC
* Signature: ()Ljava/lang/String;
*/

JNIEXPORT jstring JNICALL Java_com_royole_ekulelu_jnitest_JNIUtil_getStringFormC
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"这里是来自c的string");
   }