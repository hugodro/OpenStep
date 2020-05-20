/* Obj-C to Java:
* Class: NSButton.
* Source File: NSButton.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSButton extends OSControl implements OSCoding {
	// Methods.
    static Class cellClass()
    {
	return null;
    }

    static void setCellClass(Class classId)
    {
    }

    void setType(OSButtonType aType)
    {
    }

    void setState(int value)
    {
    }

    int state()
    {
	return 0;
    }

    void getPeriodicDelay_interval(float delay, float interval)
    {
    }

    void setPeriodicDelay_interval(float delay, float interval)
    {
    }

    String alternateTitle()
    {
	return null;
    }

    void setAlternateTitle(String aString)
    {
    }

    void setTitle(String aString)
    {
    }

    String title()
    {
	return null;
    }

    OSImage alternateImage()
    {
	return null;
    }

    OSImage image()
    {
	return null;
    }

    OSCellImagePosition imagePosition()
    {
	return null;
    }

    void setAlternateImage(OSImage anImage)
    {
    }

    void setImage(OSImage anImage)
    {
    }

    void setImagePosition(OSCellImagePosition aPosition)
    {
    }

    boolean isBordered()
    {
	return false;
    }

    boolean isTransparent()
    {
	return false;
    }

    void setBordered(boolean flag)
    {
    }

    void setTransparent(boolean flag)
    {
    }

    void highlight(boolean flag)
    {
    }

    String keyEquivalent()
    {
	return null;
    }

    int keyEquivalentModifierMask()
    {
	return 0;
    }

    void setKeyEquivalent(String aKeyEquivalent)
    {
    }

    void setKeyEquivalentModifierMask(int mask)
    {
    }

    void performClick(Object sender)
    {
    }

    boolean performKeyEquivalent(OSEvent anEvent)
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


