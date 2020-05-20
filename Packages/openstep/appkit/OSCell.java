/* Obj-C to Java:
* Class: NSCell.
* Source File: NSCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSCell extends OSObject implements OSCoding {
	// Instance Variables.
    String contents;
    Object support;
    boolean cell_state;
    boolean cell_highlighted;
    boolean cell_enabled;
    boolean cell_editable;
    boolean cell_bordered;
    boolean cell_bezeled;
    boolean cell_scrollable;
    boolean cell_selectable;
    boolean cell_continuous;
    boolean cell_float_autorange;
    int cell_float_left;
    int cell_float_right;
    int image_position;
    int cell_type;
    int text_align;
    int entry_type;
    OSView control_view;
    OSSize cell_size;
    Object represented_object;

	// Methods.
    Object initImageCell(OSImage anImage)
    {
	return null;
    }

    Object initTextCell(String aString)
    {
	return null;
    }

    void calcDrawInfo(OSRect aRect)
    {
    }

    OSSize cellSize()
    {
	return null;
    }

    OSSize cellSizeForBounds(OSRect aRect)
    {
	return null;
    }

    OSRect drawingRectForBounds(OSRect theRect)
    {
	return null;
    }

    OSRect imageRectForBounds(OSRect theRect)
    {
	return null;
    }

    OSRect titleRectForBounds(OSRect theRect)
    {
	return null;
    }

    void setType(int aType)
    {
    }

    int type()
    {
	return 0;
    }

    void setState(int value)
    {
    }

    int state()
    {
	return 0;
    }

    boolean isEnabled()
    {
	return false;
    }

    void setEnabled(boolean flag)
    {
    }

    OSImage image()
    {
	return null;
    }

    void setImage(OSImage anImage)
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

    String stringValue()
    {
	return null;
    }

    void setDoubleValue(double aDouble)
    {
    }

    void setFloatValue(float aFloat)
    {
    }

    void setIntValue(int anInt)
    {
    }

    void setStringValue(String aString)
    {
    }

    void takeDoubleValueFrom(Object sender)
    {
    }

    void takeFloatValueFrom(Object sender)
    {
    }

    void takeIntValueFrom(Object sender)
    {
    }

    void takeStringValueFrom(Object sender)
    {
    }

    int alignment()
    {
	return 0;
    }

    OSFont font()
    {
	return null;
    }

    boolean isEditable()
    {
	return false;
    }

    boolean isSelectable()
    {
	return false;
    }

    boolean isScrollable()
    {
	return false;
    }

    void setAlignment(int mode)
    {
    }

    void setEditable(boolean flag)
    {
    }

    void setFont(OSFont fontObject)
    {
    }

    void setSelectable(boolean flag)
    {
    }

    void setScrollable(boolean flag)
    {
    }

    OSText setUpFieldEditorAttributes(OSText textObject)
    {
	return null;
    }

    void setWraps(boolean flag)
    {
    }

    boolean wraps()
    {
	return false;
    }

    void editWithFrame_inView_editor_delegate_event(OSRect aRect, OSView controlView, OSText textObject, Object anObject, OSEvent theEvent)
    {
    }

    void endEditing(OSText textObject)
    {
    }

    void selectWithFrame_inView_editor_delegate_start_length(OSRect aRect, OSView controlView, OSText textObject, Object anObject, int selStart, int selLength)
    {
    }

    int entryType()
    {
	return 0;
    }

    boolean isEntryAcceptable(String aString)
    {
	return false;
    }

    void setEntryType(int aType)
    {
    }

    void setFloatingPointFormat_left_right(boolean autoRange, int leftDigits, int rightDigits)
    {
    }

    boolean isBezeled()
    {
	return false;
    }

    boolean isBordered()
    {
	return false;
    }

    boolean isOpaque()
    {
	return false;
    }

    void setBezeled(boolean flag)
    {
    }

    void setBordered(boolean flag)
    {
    }

    int cellAttribute(int aParameter)
    {
	return 0;
    }

    void setCellAttribute_to(int aParameter, int value)
    {
    }

    OSView controlView()
    {
	return null;
    }

    void drawInteriorWithFrame_inView(OSRect cellFrame, OSView controlView)
    {
    }

    void drawWithFrame_inView(OSRect cellFrame, OSView controlView)
    {
    }

    void highlight_withFrame_inView(boolean lit, OSRect cellFrame, OSView controlView)
    {
    }

    boolean isHighlighted()
    {
	return false;
    }

    Object action()
    {
	return null;
    }

    boolean isContinuous()
    {
	return false;
    }

    int sendActionOn(int mask)
    {
	return 0;
    }

    void setAction(Object aSelector)
    {
    }

    void setContinuous(boolean flag)
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

    String keyEquivalent()
    {
	return null;
    }

    static boolean prefersTrackingUntilMouseUp()
    {
	return false;
    }

    boolean continueTracking_at_inView(OSPoint lastPoint, OSPoint currentPoint, OSView controlView)
    {
	return false;
    }

    int mouseDownFlags()
    {
	return 0;
    }

    void getPeriodicDelay_interval(float delay, float interval)
    {
    }

    boolean startTrackingAt_inView(OSPoint startPoint, OSView controlView)
    {
	return false;
    }

    void stopTracking_at_inView_mouseIsUp(OSPoint lastPoint, OSPoint stopPoint, OSView controlView, boolean flag)
    {
    }

    boolean trackMouse_inRect_ofView_untilMouseUp(OSEvent theEvent, OSRect cellFrame, OSView controlView, boolean flag)
    {
	return false;
    }

    void resetCursorRect_inView(OSRect cellFrame, OSView controlView)
    {
    }

    int compare(Object otherCell)
    {
	return 0;
    }

    Object representedObject()
    {
	return null;
    }

    void setRepresentedObject(Object anObject)
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


