/* Obj-C to Java:
* Class: NSData.
* Source File: NSData.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:09 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSData extends OSObject implements OSCoding, OSCopying, OSMutableCopying {
	// Methods.
    static OSObject allocWithZone(OSZone zone)
    {
	return null;
    }

    static Object data()
    {
	return null;
    }

    static Object dataWithBytes_length(Object bytes, int length)
    {
	return null;
    }

    static Object dataWithBytesNoCopy_length(Object bytes, int length)
    {
	return null;
    }

    static Object dataWithContentsOfFile(String path)
    {
	return null;
    }

    static Object dataWithContentsOfMappedFile(String path)
    {
	return null;
    }

    static Object dataWithData(OSData aData)
    {
	return null;
    }

    Object initWithBytes_length(Object bytes, int length)
    {
	return null;
    }

    Object initWithBytesNoCopy_length(Object bytes, int length)
    {
	return null;
    }

    Object initWithContentsOfFile(String path)
    {
	return null;
    }

    Object initWithContentsOfMappedFile(String path)
    {
	return null;
    }

    Object initWithData(OSData data)
    {
	return null;
    }

    void bytes()
    {
    }

    public String description()
    {
	return null;
    }

    void getBytes(Object buffer)
    {
    }

    void getBytes_length(Object buffer, int length)
    {
    }

    void getBytes_range(Object buffer, OSRange aRange)
    {
    }

    OSData subdataWithRange(OSRange aRange)
    {
	return null;
    }

    boolean isEqualToData(OSData other)
    {
	return false;
    }

    int length()
    {
	return 0;
    }

    boolean writeToFile_atomically(String path, boolean useAuxiliaryFile)
    {
	return false;
    }

    int deserializeAlignedBytesLengthAtCursor(int cursor)
    {
	return 0;
    }

    void deserializeBytes_length_atCursor(Object buffer, int bytes, int cursor)
    {
    }

    void deserializeDataAt_ofObjCType_atCursor_context(Object data, char type, int cursor, OSObjCTypeSerializationCallBack callback)
    {
    }

    int deserializeIntAtCursor(int cursor)
    {
	return 0;
    }

    int deserializeIntAtIndex(int index)
    {
	return 0;
    }

    void deserializeInts_count_atCursor(int intBuffer, int numInts, int cursor)
    {
    }

    void deserializeInts_count_atIndex(int intBuffer, int numInts, int index)
    {
    }

// Protocol OSCopying.
    public Object copyWithZone(OSZone zone)
    {
        return null;
    }

// Protocol OSMutableCopying.
    public Object mutableCopyWithZone(OSZone zone)
    {
        return null;
    }


}


