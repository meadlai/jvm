package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;
import com.kmboot.jvm.classfile.attribute.lineNumberTable.LineNumber;

public class LineNumberTableAttribute extends AttributeBase {
public U2 attributeNameIndex;
public U4 attributeLength;
public U2 lineNumberTableLength;
    public LineNumber[] lineNumbers;
}
