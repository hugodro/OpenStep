/* Obj-C to Java:
* Class: NSPanel.
* Source File: NSPanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPanel extends OSWindow implements OSCoding {
	// Methods.
    boolean becomesKeyOnlyIfNeeded()
    {
	return false;
    }

    boolean isFloatingPanel()
    {
	return false;
    }

    void setBecomesKeyOnlyIfNeeded(boolean flag)
    {
    }

    void setFloatingPanel(boolean flag)
    {
    }

    void setWorksWhenModal(boolean flag)
    {
    }

    boolean worksWhenModal()
    {
	return false;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


