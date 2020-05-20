/* Obj-C to Java:
* Class: NSSlider.
* Source File: NSSlider.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSlider extends OSControl implements OSCoding {
	// Methods.
    static Class cellClass()
    {
	return null;
    }

    static void setCellClass(Class classId)
    {
    }

    OSImage image()
    {
	return null;
    }

    int isVertical()
    {
	return 0;
    }

    float knobThickness()
    {
	return 0.0;
    }

    void setImage(OSImage backgroundImage)
    {
    }

    void setKnobThickness(float aFloat)
    {
    }

    void setTitle(String aString)
    {
    }

    void setTitleCell(OSCell aCell)
    {
    }

    void setTitleColor(OSColor aColor)
    {
    }

    void setTitleFont(OSFont fontObject)
    {
    }

    String title()
    {
	return null;
    }

    Object titleCell()
    {
	return null;
    }

    OSColor titleColor()
    {
	return null;
    }

    OSFont titleFont()
    {
	return null;
    }

    double maxValue()
    {
	return 0.0;
    }

    double minValue()
    {
	return 0.0;
    }

    void setMaxValue(double aDouble)
    {
    }

    void setMinValue(double aDouble)
    {
    }

    boolean acceptsFirstMouse(OSEvent theEvent)
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


