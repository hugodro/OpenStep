/* Obj-C to Java:
* Class: NSScreen.
* Source File: NSScreen.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSScreen extends OSObject {
	// Instance Variables.
    OSMutableDictionary device_desc;

        // Non-OpenStep; TMP Helpers.
    static OSScreen _mainScreen= new OSScreen();

	// Methods.
    static OSScreen mainScreen()
    {
	return _mainScreen;
    }

    static OSScreen deepestScreen()
    {
	return null;
    }

    static OSArray screens()
    {
	return null;
    }

    int depth()
    {
	return 0;
    }

    OSRect frame()
    {
	return OSRect.zeroRect();
    }

    OSDictionary deviceDescription()
    {
	return null;
    }


}


