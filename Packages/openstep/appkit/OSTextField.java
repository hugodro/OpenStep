/* Obj-C to Java:
* Class: NSTextField.
* Source File: NSTextField.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSTextField extends OSControl implements OSCoding {
	// Instance Variables.
    Object next_text;
    Object previous_text;
    Object text_delegate;
    Method error_action;

	// Methods.
    boolean isEditable()
    {
	return false;
    }

    boolean isSelectable()
    {
	return false;
    }

    void setEditable(boolean flag)
    {
    }

    void setSelectable(boolean flag)
    {
    }

    void selectText(Object sender)
    {
    }

    Object nextText()
    {
	return null;
    }

    Object previousText()
    {
	return null;
    }

    void setNextText(Object anObject)
    {
    }

    void setPreviousText(Object anObject)
    {
    }

    void setDelegate(Object anObject)
    {
    }

    Object delegate()
    {
	return null;
    }

    OSColor backgroundColor()
    {
	return null;
    }

    boolean drawsBackground()
    {
	return false;
    }

    boolean isBezeled()
    {
	return false;
    }

    boolean isBordered()
    {
	return false;
    }

    void setBackgroundColor(OSColor aColor)
    {
    }

    void setBezeled(boolean flag)
    {
    }

    void setBordered(boolean flag)
    {
    }

    void setDrawsBackground(boolean flag)
    {
    }

    void setTextColor(OSColor aColor)
    {
    }

    OSColor textColor()
    {
	return null;
    }

    Method errorAction()
    {
	return null;
    }

    void setErrorAction(Method aSelector)
    {
    }

    boolean acceptsFirstResponder()
    {
	return false;
    }

    void textDidBeginEditing(OSNotification aNotification)
    {
    }

    void textDidChange(OSNotification aNotification)
    {
    }

    void textDidEndEditing(OSNotification aNotification)
    {
    }

    boolean textShouldBeginEditing(OSText textObject)
    {
	return false;
    }

    boolean textShouldEndEditing(OSText textObject)
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


