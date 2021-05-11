package com.kmboot.jvm.classfile.attribute.stackmaptable;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.classfile.attribute.stackmaptable.verificationtypeinfo.VerificationTypeInfo;

public class AppendFrame extends StackMapFrame {
    public U1 append = new U1();
    /**
     *  252-254
     */
    public U1 frameType = append;
    public U2 offsetDelta;
    public VerificationTypeInfo[] locals ;
}
