/* Obj-C to Java:
* Class: NSZone.
* Source File: NSZone.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSZone extends OSObject {
	// Instance Variables.
    int refCount;
    String name;

	// Methods.
    static OSZone defaultZone()
    {
    	return null;
    }

    static OSZone zoneFromPointer(Object aPointer)
    {
    	return null;
    }

    static boolean checkZone()
    {
	return false;
    }

    static Object allocZoneInstance()
    {
	return null;
    }

    Object initForSize_granularity_canFree(int startSize, int granularity, boolean canFree)
    {
	return null;
    }

    void malloc(int size)
    {
    }

    void calloc_byteSize(int numElems, int byteSize)
    {
    }

    void realloc_size(Object pointer, int size)
    {
    }

    void recycle()
    {
    }

    boolean pointerInZone(Object pointer)
    {
	return false;
    }

    void freePointer(Object pointer)
    {
    }

    void setName(String name)
    {
    }

    String name()
    {
	return null;
    }

    boolean checkOurZone()
    {
	return false;
    }


}


