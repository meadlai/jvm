package com.kmboot.jvm.classfile.attribute.stackmaptable;

import com.kmboot.jvm.base.U1;
import com.kmboot.jvm.base.U2;

public class ChopFrame extends StackMapFrame {
    public U1 chop = new U1();
public U1 frameType = chop; /* 248-250 */
public U2 offsetDelta;
}
