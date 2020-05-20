/* Obj-C to Java:
* Class: NSScrollView.
* Source File: NSScrollView.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSScrollView extends OSView implements OSCoding {
	// Methods.
    OSSize contentSize()
    {
	return null;
    }

    OSRect documentVisibleRect()
    {
	return null;
    }

    static OSSize contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType(OSSize size, boolean horizFlag, boolean vertFlag, OSBorderType aType)
    {
	return null;
    }

    static OSSize frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType(OSSize size, boolean horizFlag, boolean vertFlag, OSBorderType aType)
    {
	return null;
    }

    void setHasHorizontalScroller(boolean flag)
    {
    }

    boolean hasHorizontalScroller()
    {
	return false;
    }

    void setHasVerticalScroller(boolean flag)
    {
    }

    boolean hasVerticalScroller()
    {
	return false;
    }

    void tile()
    {
    }

    void toggleRuler(Object sender)
    {
    }

    boolean isRulerVisible()
    {
	return false;
    }

    void setDocumentView(OSView aView)
    {
    }

    Object documentView()
    {
	return null;
    }

    void setHorizontalScroller(OSScroller anObject)
    {
    }

    OSScroller horizontalScroller()
    {
	return null;
    }

    void setVerticalScroller(OSScroller anObject)
    {
    }

    OSScroller verticalScroller()
    {
	return null;
    }

    void reflectScrolledClipView(OSClipView cView)
    {
    }

    void setBorderType(OSBorderType aType)
    {
    }

    OSBorderType borderType()
    {
	return null;
    }

    void setBackgroundColor(OSColor color)
    {
    }

    OSColor backgroundColor()
    {
	return null;
    }

    float lineScroll()
    {
	return 0.0;
    }

    float pageScroll()
    {
	return 0.0;
    }

    void setScrollsDynamically(boolean flag)
    {
    }

    boolean scrollsDynamically()
    {
	return false;
    }

    void setLineScroll(float value)
    {
    }

    void setPageScroll(float value)
    {
    }

    void setDocumentCursor(OSCursor anObject)
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


