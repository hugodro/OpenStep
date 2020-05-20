/* Obj-C to Java:
* Class: NSRunLoop.
* Source File: NSRunLoop.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSRunLoop extends OSObject {
	// Instance Variables.
    OSMutableDictionary inputsForMode;
    String mode;

	// Methods.
    static OSRunLoop currentRunLoop()
    {
	return null;
    }

    String currentMode()
    {
	return null;
    }

    OSDate limitDateForMode(String mode)
    {
	return null;
    }

    void addTimer_forMode(OSTimer aTimer, String mode)
    {
    }

    void acceptInputForMode_beforeDate(String mode, OSDate limitDate)
    {
    }

    void run()
    {
    }

    boolean runMode_beforeDate(String mode, OSDate limitDate)
    {
	return false;
    }

    void runUntilDate(OSDate limitDate)
    {
    }

    void performSelector_target_argument_order_modes(Method aSelector, Object target, Object anArgument, int order, OSArray modes)
    {
    }

    void cancelPerformSelector_target_argument(Method aSelector, Object target, Object anArgument)
    {
    }

    void addPosixFileDescriptor_forMode(OSPosixFileDescriptor fileDescriptor, String mode)
    {
    }

    void removePosixFileDescriptor_forMode(OSPosixFileDescriptor fileDescriptor, String mode)
    {
    }


}


