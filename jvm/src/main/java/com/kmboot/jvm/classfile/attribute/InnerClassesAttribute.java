package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;
import com.kmboot.jvm.classfile.attribute.innerClasses.Classes;

public class InnerClassesAttribute extends AttributeBase {
public U2 attributeNameIndex;
public U4 attributeLength;
public U2 numberOfClasses;
    public Classes[] classes;
}
