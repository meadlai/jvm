package com.kmboot.jvm.classfile;

import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.classfile.attribute.AttributeBase;
import com.kmboot.jvm.runtime.JavaClass;

public class MethodInfo {
    public U2 accessFlags;
    public U2 nameIndex;
    public U2 descriptorIndex;
    public U2 attributeCount;
    public AttributeBase[] attributes;

    public int argSlotCount = -1;
    public JavaClass javaClass;
}
