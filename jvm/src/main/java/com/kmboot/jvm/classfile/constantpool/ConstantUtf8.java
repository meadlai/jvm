package com.kmboot.jvm.classfile.constantpool;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;

public class ConstantUtf8 extends ConstantBase {
    public U1 tag;
    public U2 length;
    public U1[] bytes;
}
