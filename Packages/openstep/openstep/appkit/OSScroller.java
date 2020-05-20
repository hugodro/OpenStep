/* Obj-C to Java:
* Class: NSScroller.
* Source File: NSScroller.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSScroller extends OSControl implements OSCoding {
	// Instance Variables.
    boolean is_horizontal;
    Method action;
    Object target;
    float percent;
    float cur_value;
    Object be_scroll_reserved;

	// Methods.
    static float scrollerWidth()
    {
	return 0.0;
    }

    OSScrollArrowPosition arrowsPosition()
    {
	return null;
    }

    void checkSpaceForParts()
    {
    }

    OSRect rectForPart(OSScrollerPart partCode)
    {
	return null;
    }

    void setArrowsPosition(OSScrollArrowPosition where)
    {
    }

    OSUsableScrollerParts usableParts()
    {
	return null;
    }

    float knobProportion()
    {
	return 0.0;
    }

    void setFloatValue_knobProportion(float aFloat, float ratio)
    {
    }

    void drawArrow_highlight(OSScrollerArrow whichButton, boolean flag)
    {
    }

    void drawKnob()
    {
    }

    void drawParts()
    {
    }

    void highlight(boolean flag)
    {
    }

    OSScrollerPart hitPart()
    {
	return null;
    }

    OSScrollerPart testPart(OSPoint thePoint)
    {
	return null;
    }

    void trackKnob(OSEvent theEvent)
    {
    }

    void trackScrollButtons(OSEvent theEvent)
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


