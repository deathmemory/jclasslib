/*
 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public
 License as published by the Free Software Foundation; either
 version 2 of the license, or (at your option) any later version.
 */

package org.gjt.jclasslib.structures.attributes.targettype;

import org.gjt.jclasslib.structures.InvalidByteCodeException;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Target info for a <tt>TypeAnnotation</tt> structure with a bytecode offset.
 */
public class OffsetTargetInfo extends TargetInfo {

    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public void read(DataInput in) throws InvalidByteCodeException, IOException {
        offset = in.readUnsignedShort();
    }

    @Override
    public void write(DataOutput out) throws InvalidByteCodeException, IOException {
        out.writeShort(offset);
    }

    @Override
    public int getLength() {
        return 2;
    }

    @Override
    public String getVerbose() {
        return "offset " + offset;
    }
}
