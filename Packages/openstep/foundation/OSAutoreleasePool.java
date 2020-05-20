/* Obj-C to Java:
* Class: NSAutoreleasePool.
* Source File: NSAutoreleasePool.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSAutoreleasePool extends OSObject {
	// Instance Variables.
    OSAutoreleasePool parentPool;
    int countOfObjects;
    OSAutoreleasePoolChunk firstChunk;
    OSAutoreleasePoolChunk currentChunk;
    Object ownerThread;

	// Methods.
    static void taskNowMultiThreaded(Object notification)
    {
    }

    Object init()
    {
	return null;
    }

    void dealloc()
    {
    }

    static void addObject(Object anObject)
    {
    }

    void addObject(Object anObject)
    {
    }

    static Object defaultPool()
    {
	return null;
    }

    static int autoreleaseCountForObject(Object anObject)
    {
	return 0;
    }

    int autoreleaseCountForObject(Object anObject)
    {
	return 0;
    }

    static void enableDoubleReleaseCheck(boolean enable)
    {
    }

    static void enableRelease(boolean enable)
    {
    }

    static void setPoolCountThreshhold(int trash)
    {
    }

    Object trash()
    {
	return null;
    }


}


