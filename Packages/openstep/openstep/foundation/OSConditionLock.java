/* Obj-C to Java:
* Class: NSConditionLock.
* Source File: NSLock.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSConditionLock extends OSObject implements OSLocking {
	// Instance Variables.
    objc_mutex_t mutex;
    objc_condition_t condition;
    int value;

	// Methods.
    Object initWithCondition(int aCondition)
    {
	return null;
    }

    int condition()
    {
	return 0;
    }

    void lockWhenCondition(int aCondition)
    {
    }

    boolean lockBeforeDate(OSDate limit)
    {
	return false;
    }

    boolean lockWhenCondition_beforeDate(int aCondition, OSDate limit)
    {
	return false;
    }

    boolean tryLock()
    {
	return false;
    }

    boolean tryLockWhenCondition(int aCondition)
    {
	return false;
    }

    void unlockWithCondition(int aCondition)
    {
    }


}


