/* Obj-C to Java:
* Class: NSDistributedLock.
* Source File: NSDistributedLock.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSDistributedLock extends OSObject {
	// Instance Variables.
    String path;
    boolean locked;

	// Methods.
    static OSDistributedLock lockWithPath(String aPath)
    {
	return null;
    }

    OSDistributedLock initWithPath(String aPath)
    {
	return null;
    }

    boolean tryLock()
    {
	return false;
    }

    void breakLock()
    {
    }

    void unlock()
    {
    }

    OSDate lockDate()
    {
	return null;
    }


}


