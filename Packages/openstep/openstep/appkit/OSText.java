/* Obj-C to Java:
* Class: NSText.
* Source File: NSText.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSText extends OSView implements OSCoding {
	// Instance Variables.
    Object delegate;
    String text_contents;
    int alignment;
    boolean is_editable;
    boolean is_rich_text;
    boolean is_selectable;
    boolean imports_graphics;
    boolean uses_font_panel;
    boolean is_horizontally_resizable;
    boolean is_vertically_resizable;
    boolean is_ruler_visible;
    boolean is_field_editor;
    OSColor background_color;
    OSColor text_color;
    OSFont default_font;
    OSRange selected_range;
    Object be_text_reserved;

	// Constructors.
    public OSText(OSRect frameRect)
    {
	super(frameRect);
	}

	// Instance methods.
    void replaceRange_withRTF(OSRange range, OSData rtfData)
    {
    }

    void replaceRange_withRTFD(OSRange range, OSData rtfdData)
    {
    }

    OSData RTFDFromRange(OSRange range)
    {
	return null;
    }

    OSData RTFFromRange(OSRange range)
    {
	return null;
    }

    void setText(String string)
    {
    }

    void setText_range(String string, OSRange range)
    {
    }

    String text()
    {
	return null;
    }

    int alignment()
    {
	return 0;
    }

    boolean drawsBackground()
    {
	return false;
    }

    boolean importsGraphics()
    {
	return false;
    }

    boolean isEditable()
    {
	return false;
    }

    boolean isRichText()
    {
	return false;
    }

    boolean isSelectable()
    {
	return false;
    }

    void setAlignment(int mode)
    {
    }

    void setDrawsBackground(boolean flag)
    {
    }

    void setEditable(boolean flag)
    {
    }

    void setImportsGraphics(boolean flag)
    {
    }

    void setRichText(boolean flag)
    {
    }

    void setSelectable(boolean flag)
    {
    }

    OSColor backgroundColor()
    {
	return null;
    }

    void changeFont(Object sender)
    {
    }

    OSFont font()
    {
	return null;
    }

    void setBackgroundColor(OSColor color)
    {
    }

    void setColor_ofRange(OSColor color, OSRange range)
    {
    }

    void setFont(OSFont obj)
    {
    }

    void setFont_ofRange(OSFont font, OSRange range)
    {
    }

    void setTextColor(OSColor color)
    {
    }

    void setUsesFontPanel(boolean flag)
    {
    }

    OSColor textColor()
    {
	return null;
    }

    boolean usesFontPanel()
    {
	return false;
    }

    OSRange selectedRange()
    {
	return null;
    }

    void setSelectedRange(OSRange range)
    {
    }

    boolean isHorizontallyResizable()
    {
	return false;
    }

    boolean isVerticallyResizable()
    {
	return false;
    }

    OSSize maxSize()
    {
	return null;
    }

    OSSize minSize()
    {
	return null;
    }

    void setHorizontallyResizable(boolean flag)
    {
    }

    void setMaxSize(OSSize newMaxSize)
    {
    }

    void setMinSize(OSSize newMinSize)
    {
    }

    void setVerticallyResizable(boolean flag)
    {
    }

    void sizeToFit()
    {
    }

    void alignCenter(Object sender)
    {
    }

    void alignLeft(Object sender)
    {
    }

    void alignRight(Object sender)
    {
    }

    void copy(Object sender)
    {
    }

    void copyFont(Object sender)
    {
    }

    void copyRuler(Object sender)
    {
    }

    void cut(Object sender)
    {
    }

    void delete(Object sender)
    {
    }

    void paste(Object sender)
    {
    }

    void pasteFont(Object sender)
    {
    }

    void pasteRuler(Object sender)
    {
    }

    void selectAll(Object sender)
    {
    }

    void subscript(Object sender)
    {
    }

    void superscript(Object sender)
    {
    }

    void underline(Object sender)
    {
    }

    void unscript(Object sender)
    {
    }

    boolean isRulerVisible()
    {
	return false;
    }

    void toggleRuler(Object sender)
    {
    }

    void checkSpelling(Object sender)
    {
    }

    void showGuessPanel(Object sender)
    {
    }

    void scrollRangeToVisible(OSRange range)
    {
    }

    boolean readRTFDFromFile(String path)
    {
	return false;
    }

    boolean writeRTFDToFile_atomically(String path, boolean flag)
    {
	return false;
    }

    boolean isFieldEditor()
    {
	return false;
    }

    void setFieldEditor(boolean flag)
    {
    }

    Object delegate()
    {
	return null;
    }

    void setDelegate(Object anObject)
    {
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


