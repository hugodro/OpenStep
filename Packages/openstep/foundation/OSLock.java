/* Obj-C to Java:
* Class: NSLock.
* Source File: NSLock.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSLock extends OSObject implements OSLocking {
	// Instance Variables.
    objc_mutex_t mutex;

	// Methods.
    boolean tryLock()
    {
	return false;
    }

    boolean lockBeforeDate(OSDate limit)
    {
	return false;
    }


}


