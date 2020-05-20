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
    Object be_screen_reserved;

	// Methods.
    static OSScreen mainScreen()
    {
	return null;
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
	return null;
    }

    OSDictionary deviceDescription()
    {
	return null;
    }


}


