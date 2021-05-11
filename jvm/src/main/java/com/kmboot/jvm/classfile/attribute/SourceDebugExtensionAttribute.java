package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;

public class SourceDebugExtensionAttribute extends AttributeBase {
public U2 attributeNameIndex;
public U4 attributeLength;
    public U1[] debugExtension;
}
