/* Obj-C to Java:
* Class: NSException.
* Source File: NSFuncallException.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSException extends OSObject {
	// Instance Variables.
    String name;
    String reason;
    OSDictionary userInfo;

	// Methods.
    static OSException exceptionWithName_reason_userInfo(String name, String reason, OSDictionary userInfo)
    {
	return null;
    }

    static void raise_format(String name, String format, Object[] ellipsis)
    {
    }

    static void raise_format_arguments(String name, String format, Object[] argList)
    {
    }

    Object initWithName_reason_userInfo(String name, String reason, OSDictionary userInfo)
    {
	return null;
    }

    void raise()
    {
    }

    String name()
    {
	return null;
    }

    String reason()
    {
	return null;
    }

    OSDictionary userInfo()
    {
	return null;
    }


}


