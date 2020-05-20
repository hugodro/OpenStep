/* Obj-C to Java:
* Class: NSControl.
* Source File: NSControl.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSControl extends OSView implements OSCoding {
	// Instance Variables.
    int tag;
    Object cell;

	// Constructors.
    public OSControl(OSRect frameRect)
    {
	super(frameRect);
    }
	
	// Methods.
    OSView initWithFrame(OSRect frameRect)
    {
	return null;
    }

    static Class cellClass()
    {
	return null;
    }

    static void setCellClass(Class factoryId)
    {
    }

    Object cell()
    {
	return null;
    }

    void setCell(OSCell aCell)
    {
    }

    boolean isEnabled()
    {
	return false;
    }

    void setEnabled(boolean flag)
    {
    }

    Object selectedCell()
    {
	return null;
    }

    int selectedTag()
    {
	return 0;
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

    void setDoubleValue(double aDouble)
    {
    }

    void setFloatValue(float aFloat)
    {
    }

    void setIntValue(int anInt)
    {
    }

    void setNeedsDisplay()
    {
    }

    void setStringValue(String aString)
    {
    }

    String stringValue()
    {
	return null;
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

    void setAlignment(int mode)
    {
    }

    void setFont(OSFont fontObject)
    {
    }

    void setFloatingPointFormat_left_right(boolean autoRange, int leftDigits, int rightDigits)
    {
    }

    boolean abortEditing()
    {
	return false;
    }

    OSText currentEditor()
    {
	return null;
    }

    void validateEditing()
    {
    }

    void calcSize()
    {
    }

    void sizeToFit()
    {
    }

    void drawCell(OSCell aCell)
    {
    }

    void drawCellInside(OSCell aCell)
    {
    }

    void selectCell(OSCell aCell)
    {
    }

    void updateCell(OSCell aCell)
    {
    }

    void updateCellInside(OSCell aCell)
    {
    }

    Object action()
    {
	return null;
    }

    boolean isContinuous()
    {
	return false;
    }

    boolean sendAction_to(Object theAction, Object theTarget)
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

    void mouseDown(OSEvent theEvent)
    {
    }

    boolean ignoresMultiClick()
    {
	return false;
    }

    void setIgnoresMultiClick(boolean flag)
    {
    }

    boolean control_textShouldBeginEditing(OSControl control, OSText fieldEditor)
    {
	return false;
    }

    boolean control_textShouldEndEditing(OSControl control, OSText fieldEditor)
    {
	return false;
    }

    void controlTextDidBeginEditing(OSNotification aNotification)
    {
    }

    void controlTextDidEndEditing(OSNotification aNotification)
    {
    }

    void controlTextDidChange(OSNotification aNotification)
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


