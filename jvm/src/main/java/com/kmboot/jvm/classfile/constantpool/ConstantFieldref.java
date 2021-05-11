package com.kmboot.jvm.classfile.constantpool;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;

public class ConstantFieldref extends ConstantBase {
    public U1 tag;
    public U2 classIndex;
    public U2 nameAndTypeIndex;
}
