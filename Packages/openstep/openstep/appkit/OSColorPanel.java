/* Obj-C to Java:
* Class: NSColorPanel.
* Source File: NSColorPanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSColorPanel extends OSPanel implements OSCoding {
	// Methods.
    static OSColorPanel sharedColorPanel()
    {
	return null;
    }

    static boolean sharedColorPanelExists()
    {
	return false;
    }

    static void setPickerMask(int mask)
    {
    }

    static void setPickerMode(int mode)
    {
    }

    OSView accessoryView()
    {
	return null;
    }

    boolean isContinuous()
    {
	return false;
    }

    int mode()
    {
	return 0;
    }

    void setAccessoryView(OSView aView)
    {
    }

    void setAction(Method aSelector)
    {
    }

    void setContinuous(boolean flag)
    {
    }

    void setMode(int mode)
    {
    }

    void setShowsAlpha(boolean flag)
    {
    }

    void setTarget(Object anObject)
    {
    }

    boolean showsAlpha()
    {
	return false;
    }

    void attachColorList(OSColorList aColorList)
    {
    }

    void detachColorList(OSColorList aColorList)
    {
    }

    static boolean dragColor_withEvent_fromView(OSColor aColor, OSEvent anEvent, OSView sourceView)
    {
	return false;
    }

    float alpha()
    {
	return 0.0;
    }

    OSColor color()
    {
	return null;
    }

    void setColor(OSColor aColor)
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


