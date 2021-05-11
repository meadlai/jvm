package com.kmboot.jvm.classfile.attribute;

import com.kmboot.jvm.base.U2;
import com.kmboot.jvm.base.U4;
import com.kmboot.jvm.classfile.attribute.RuntimeVisibleTypeAnnotations.TypeAnnotation;

/**
 * java8增加
 */
public class RuntimeVisibleTypeAnnotationsAttribute extends AttributeBase {
    public U2 attributeNameIndex;
    public U4 attributeLength;
    public U2 numAnnotations;
    TypeAnnotation[] annotations;
}
