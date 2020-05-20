/* Obj-C to Java:
* Class: NSSliderCell.
* Source File: NSSliderCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSliderCell extends OSActionCell implements OSCoding {
	// Instance Variables.
    double max_value;
    double min_value;
    double scale_factor;
    int scroll_size;
    int knob_thickness;
    double page_value;
    boolean is_vertical;
    Object be_sc_reserved;

	// Methods.
    OSSize cellSizeForBounds(OSRect aRect)
    {
	return null;
    }

    OSRect knobRectFlipped(boolean flipped)
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

    void setVertical(boolean value)
    {
    }

    int isVertical()
    {
	return 0;
    }

    float knobThickness()
    {
	return 0.0;
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

    OSFont titleFont()
    {
	return null;
    }

    OSColor titleColor()
    {
	return null;
    }

    void drawBarInside_flipped(OSRect aRect, boolean flipped)
    {
    }

    void drawKnob()
    {
    }

    void drawKnob(OSRect knobRect)
    {
    }

    double altIncrementValue()
    {
	return 0.0;
    }

    void setAltIncrementValue(double incValue)
    {
    }

    static boolean prefersTrackingUntilMouseUp()
    {
	return false;
    }

    OSRect trackRect()
    {
	return null;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


