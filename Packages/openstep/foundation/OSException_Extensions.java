/* Obj-C to Java:
* Category: NSException(Extensions).
* Source File: NSFuncallException.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSException categorizes Extensions {
	// Methods.
    boolean exceptionIsKindOfClass(Class aClass)
    {
	return false;
    }

    boolean exceptionIsIn(OSArray exceptions)
    {
	return false;
    }

    String errorString()
    {
	return null;
    }

    Object initWithFormat(String format, Object[] ellipsis)
    {
	return null;
    }

    Object initWithFormat_arguments(String format, va_list ap)
    {
	return null;
    }

    Object setName(String name)
    {
	return null;
    }

    Object setReason(String reason)
    {
	return null;
    }

    Object setUserInfo(OSDictionary userInfo)
    {
	return null;
    }


}


