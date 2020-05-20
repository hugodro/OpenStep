/* Obj-C to Java:
* Class: NSTextFieldCell.
* Source File: NSTextFieldCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSTextFieldCell extends OSActionCell implements OSCoding {
	// Instance Variables.
    OSColor background_color;
    OSColor text_color;
    boolean draw_background;
    boolean pending_select;
    Object be_tfc_reserved;

	// Methods.
    OSColor backgroundColor()
    {
	return null;
    }

    boolean drawsBackground()
    {
	return false;
    }

    void setBackgroundColor(OSColor aColor)
    {
    }

    void setDrawsBackground(boolean flag)
    {
    }

    void setTextColor(OSColor aColor)
    {
    }

    Object setUpFieldEditorAttributes(Object textObject)
    {
	return null;
    }

    OSColor textColor()
    {
	return null;
    }

    void selectText(Object sender)
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


