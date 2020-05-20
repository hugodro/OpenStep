/* Obj-C to Java:
* Class: NSAssertionHandler.
* Source File: NSFuncallException.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSAssertionHandler extends OSObject {
	// Methods.
    static OSAssertionHandler currentHandler()
    {
	return null;
    }

    void handleFailureInFunction_file_lineNumber_description(String functionName, String fileName, int line, String format, Object[] ellipsis)
    {
    }

    void handleFailureInMethod_object_file_lineNumber_description(Method selector, Object object, String fileName, int line, String format, Object[] ellipsis)
    {
    }


}


