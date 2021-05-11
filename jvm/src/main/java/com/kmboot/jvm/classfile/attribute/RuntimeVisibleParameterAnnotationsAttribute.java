package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;
import com.kmboot.jvm.classfile.attribute.RuntimeVisibleParameterAnnotations.ParameterAnnotation;

public class RuntimeVisibleParameterAnnotationsAttribute extends AttributeBase {
public U2 attributeNameIndex;
public U4 attributeLength;
public U1 numParameters;
    public ParameterAnnotation[] parameterAnnotations;
}
