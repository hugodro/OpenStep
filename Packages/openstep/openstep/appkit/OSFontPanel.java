/* Obj-C to Java:
* Class: NSFontPanel.
* Source File: NSFontPanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSFontPanel extends OSPanel implements OSCoding {
	// Instance Variables.
    OSFont panel_font;

	// Methods.
    static OSFontPanel sharedFontPanel()
    {
	return null;
    }

    OSFont panelConvertFont(OSFont fontObject)
    {
	return null;
    }

    void setPanelFont_isMultiple(OSFont fontObject, boolean flag)
    {
    }

    OSView accessoryView()
    {
	return null;
    }

    boolean isEnabled()
    {
	return false;
    }

    void setAccessoryView(OSView aView)
    {
    }

    void setEnabled(boolean flag)
    {
    }

    boolean worksWhenModal()
    {
	return false;
    }

    void orderWindow_relativeTo(OSWindowOrderingMode place, int otherWindows)
    {
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


