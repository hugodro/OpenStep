/* Obj-C to Java:
* Class: NSClipView.
* Source File: NSClipView.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSClipView extends OSView implements OSCoding {

	// Constructor.
    OSClipView(OSRect frameRect)
    {
        super(frameRect);
    }

	// Methods.
    OSRect documentRect()
    {
	return null;
    }

    Object documentView()
    {
	return null;
    }

    OSRect documentVisibleRect()
    {
	return null;
    }

    void setDocumentView(OSView aView)
    {
    }

    OSCursor documentCursor()
    {
	return null;
    }

    void setDocumentCursor(OSCursor anObject)
    {
    }

    OSColor backgroundColor()
    {
	return null;
    }

    void setBackgroundColor(OSColor color)
    {
    }

    boolean autoscroll(OSEvent theEvent)
    {
	return false;
    }

    OSPoint constrainScrollPoint(OSPoint newOrigin)
    {
	return null;
    }

    boolean copiesOnScroll()
    {
	return false;
    }

    void scrollToPoint(OSPoint newOrigin)
    {
    }

    void setCopiesOnScroll(boolean flag)
    {
    }

    void viewFrameChanged(OSNotification notification)
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


