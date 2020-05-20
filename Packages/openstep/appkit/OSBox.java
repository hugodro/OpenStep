/* Obj-C to Java:
* Class: NSBox.
* Source File: NSBox.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSBox extends OSView implements OSCoding {
	// Instance Variables.
    Object cell;
    Object content_view;
    OSSize offsets;
    OSRect border_rect;
    OSRect title_rect;
    OSBorderType border_type;
    OSTitlePosition title_position;

	// Methods.
    OSRect borderRect()
    {
	return null;
    }

    OSBorderType borderType()
    {
	return null;
    }

    void setBorderType(OSBorderType aType)
    {
    }

    void setTitle(String aString)
    {
    }

    void setTitleFont(OSFont fontObj)
    {
    }

    void setTitlePosition(OSTitlePosition aPosition)
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

    OSTitlePosition titlePosition()
    {
	return null;
    }

    OSRect titleRect()
    {
	return null;
    }

    Object contentView()
    {
	return null;
    }

    OSSize contentViewMargins()
    {
	return null;
    }

    void setContentView(OSView aView)
    {
    }

    void setContentViewMargins(OSSize offsetSize)
    {
    }

    void setFrameFromContentFrame(OSRect contentFrame)
    {
    }

    void sizeToFit()
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


