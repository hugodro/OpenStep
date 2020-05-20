/* Obj-C to Java:
* Class: NSThread.
* Source File: NSThread.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSThread extends OSObject {
	// Instance Variables.
    Object threadDictionary;
    boolean isRunning;
    Object target;
    Method selector;
    Object arg;
    Object autoreleaseStack;
    Object exceptionStack;

	// Methods.
    static OSThread currentThread()
    {
	return null;
    }

    static void exit()
    {
    }

    static boolean isMultiThreaded()
    {
	return false;
    }

    static void sleepUntilDate(OSDate aDate)
    {
    }

    static void detachNewThreadSelector_toTarget_withObject(Method aSelector, Object aTarget, Object anArgument)
    {
    }

    OSMutableDictionary threadDictionary()
    {
	return null;
    }

    OSAutoreleasePool threadDefaultAutoreleasePool()
    {
	return null;
    }

    void setThreadDefaultAutoreleasePool(OSAutoreleasePool pool)
    {
    }

    void threadDefaultExceptionHandler()
    {
    }

    void setThreadDefaultExceptionHandler(void handler)
    {
    }


}


