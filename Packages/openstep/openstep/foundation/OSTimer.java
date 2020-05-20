/* Obj-C to Java:
* Class: NSTimer.
* Source File: NSTimer.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSTimer extends OSObject {
	// Instance Variables.
    OSTimeInterval timeInterval;
    OSDate fireDate;
    OSInvocation invocation;
    Object userInfo;
    boolean repeats;
    boolean isValid;

	// Methods.
    static OSTimer scheduledTimerWithTimeInterval_invocation_repeats(OSTimeInterval seconds, OSInvocation anInvocation, boolean repeats)
    {
	return null;
    }

    static OSTimer scheduledTimerWithTimeInterval_target_selector_userInfo_repeats(OSTimeInterval seconds, Object anObject, Method aSelector, Object anArgument, boolean repeats)
    {
	return null;
    }

    static OSTimer timerWithTimeInterval_invocation_repeats(OSTimeInterval seconds, OSInvocation anInvocation, boolean repeats)
    {
	return null;
    }

    static OSTimer timerWithTimeInterval_target_selector_userInfo_repeats(OSTimeInterval seconds, Object anObject, Method aSelector, Object anArgument, boolean repeats)
    {
	return null;
    }

    void fire()
    {
    }

    void invalidate()
    {
    }

    OSDate fireDate()
    {
	return null;
    }

    Object userInfo()
    {
	return null;
    }

    boolean isValid()
    {
	return false;
    }

    boolean repeats()
    {
	return false;
    }


}


