#include "com_yjy_edu_enterprise_advanced_jni_JniClass.h"
#include "jni.h"

JNIEXPORT void JNICALL Java_com_yjy_edu_enterprise_advanced_jni_JniClass_speak(JNIEnv *env, jobject obj, jstring str)
{
  const char *pword = env->GetStringUTFChars(str, NULL);
  printf("%s\n", pword);
}

JNIEXPORT void JNICALL Java_com_yjy_edu_enterprise_advanced_jni_JniClass_say(JNIEnv *env, jclass clazz, jstring str)
{
  const char *pword = env->GetStringUTFChars(str, NULL);
  printf("%s\n", pword);
}
