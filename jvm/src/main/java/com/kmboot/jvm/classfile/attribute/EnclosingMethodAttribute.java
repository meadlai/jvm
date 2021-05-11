package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;

public class EnclosingMethodAttribute extends AttributeBase {
public U2 attributeNameIndex;
public U4 attributeLength;
public U2 classIndex;
public U2 methodIndex;
}
