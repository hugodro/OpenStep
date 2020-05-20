/* Obj-C to Java:
* Class: NSActionCell.
* Source File: NSActionCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSActionCell extends OSCell implements OSCoding {
	// Instance Variables.
    int tag;
    Object target;
    Object action;

	// Methods.
    void setAlignment(int mode)
    {
    }

    void setBezeled(boolean flag)
    {
    }

    void setBordered(boolean flag)
    {
    }

    void setEnabled(boolean flag)
    {
    }

    void setFloatingPointFormat_left_right(boolean autoRange, int leftDigits, int rightDigits)
    {
    }

    void setFont(OSFont fontObject)
    {
    }

    void setImage(OSImage image)
    {
    }

    double doubleValue()
    {
	return 0.0;
    }

    float floatValue()
    {
	return 0.0f;
    }

    int intValue()
    {
	return 0;
    }

    void setStringValue(String aString)
    {
    }

    String stringValue()
    {
	return null;
    }

    void drawWithFrame_inView(OSRect cellFrame, OSView controlView)
    {
    }

    OSView controlView()
    {
	return null;
    }

    Object action()
    {
	return null;
    }

    void setAction(Object aSelector)
    {
    }

    void setTarget(Object anObject)
    {
    }

    Object target()
    {
	return null;
    }

    void setTag(int anInt)
    {
    }

    int tag()
    {
	return 0;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


