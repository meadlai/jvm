package com.kmboot.jvm.classfile.attribute.stackmaptable;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.classfile.attribute.stackmaptable.verificationtypeinfo.VerificationTypeInfo;

public class FullFrame extends StackMapFrame {
    public U1 fullFrame = new U1();
public U1 frameType = fullFrame; /* 255 */
public U2 offsetDelta;
public U2 numberOfLocals;
    public VerificationTypeInfo[] locals ;
public U2 numberOfStackItems;
    public VerificationTypeInfo[] stack;
}
