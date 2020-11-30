CC = g++
RM = rm -f
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_251.jdk/Contents/Home
#编译参数可自行根据平台做相应的修改，该编译参数在MACOS下编译
CFLAGS = -g -fPIC -dynamiclib -I$(JAVA_HOME)/include  -I$(JAVA_HOME)/include/darwin

all : jniClass

jniClass: com_yjy_edu_enterprise_advanced_jni_JniClass.cpp
	${CC} ${CFLAGS} $^ -o libjniClass.dylib
    
clean:
	${RM} -rf *.dylib*