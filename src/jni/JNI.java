package jni;

public class JNI {
	static {
        System.load("C:/Dev/workspace/jni/bin/jni/JNI.dll");
    }
    
    private native int getNumber();
    
    public static void main(String[] args){
        JNI jni = new JNI();
    
        System.out.println(jni.getNumber()); //JNI�� ȣ�� �� ���� �޼���
    }
}
