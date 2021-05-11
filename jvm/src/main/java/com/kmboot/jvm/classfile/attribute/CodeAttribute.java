package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;
import com.kmboot.jvm.classfile.attribute.code.ExceptionTable;

public class CodeAttribute extends AttributeBase {
    public U2 attributeNameIndex;
    public U4 attributeLength;
    public U2 maxStack;
    public U2 maxLocals;
    public U4 codeLength;
    public U1[] code;
    public U2 exceptionTableLength;
    public ExceptionTable[] exceptionTables;
    public U2 attributeCount;
    public AttributeBase[] attributes;
}
