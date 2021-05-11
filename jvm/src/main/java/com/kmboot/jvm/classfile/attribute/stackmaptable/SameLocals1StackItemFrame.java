package com.kmboot.jvm.classfile.attribute.stackmaptable;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.classfile.attribute.stackmaptable.verificationtypeinfo.VerificationTypeInfo;

public class SameLocals1StackItemFrame extends StackMapFrame {
    public U1 sameLocals1StackItem = new U1();
public U1 frameType = sameLocals1StackItem;/* 64-127 */
    public VerificationTypeInfo[] stack;
}
