#include <stdio.h>
#include <jni.h>
#include "jni_JNI.h"

JNIEXPORT jint JNICALL Java_jni_JNI_getNumber
(JNIEnv *env, jobject jObj) {
	return 9999;
}
