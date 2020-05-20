/* Obj-C to Java:
* Class: NSFormCell.
* Source File: NSFormCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSFormCell extends OSActionCell implements OSCoding {
	// Methods.
    Object initTextCell(String aString)
    {
	return null;
    }

    OSSize cellSizeForBounds(OSRect aRect)
    {
	return null;
    }

    boolean isOpaque()
    {
	return false;
    }

    void setTitle(String aString)
    {
    }

    void setTitleAlignment(OSTextAlignment mode)
    {
    }

    void setTitleFont(OSFont fontObject)
    {
    }

    void setTitleWidth(float width)
    {
    }

    String title()
    {
	return null;
    }

    OSTextAlignment titleAlignment()
    {
	return null;
    }

    OSFont titleFont()
    {
	return null;
    }

    float titleWidth()
    {
	return 0.0;
    }

    float titleWidth(OSSize aSize)
    {
	return 0.0;
    }

    void drawInteriorWithFrame_inView(OSRect cellFrame, OSView controlView)
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


