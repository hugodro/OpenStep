/* Obj-C to Java:
* Class: NSButtonCell.
* Source File: NSButtonCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSButtonCell extends OSActionCell implements OSCoding {
	// Instance Variables.
    String alt_contents;
    OSImage alt_image;
    boolean transparent;
    Object be_bc_reserved;

	// Methods.
    String alternateTitle()
    {
	return null;
    }

    void setAlternateTitle(String aString)
    {
    }

    void setFont(OSFont fontObject)
    {
    }

    void setTitle(String aString)
    {
    }

    String title()
    {
	return null;
    }

    OSImage alternateImage()
    {
	return null;
    }

    OSCellImagePosition imagePosition()
    {
	return null;
    }

    void setAlternateImage(OSImage anImage)
    {
    }

    void setImagePosition(OSCellImagePosition aPosition)
    {
    }

    void getPeriodicDelay_interval(float delay, float interval)
    {
    }

    void setPeriodicDelay_interval(float delay, float interval)
    {
    }

    String keyEquivalent()
    {
	return null;
    }

    OSFont keyEquivalentFont()
    {
	return null;
    }

    int keyEquivalentModifierMask()
    {
	return 0;
    }

    void setKeyEquivalent(String aKeyEquivalent)
    {
    }

    void setKeyEquivalentModifierMask(int mask)
    {
    }

    void setKeyEquivalentFont(OSFont fontObj)
    {
    }

    void setKeyEquivalentFont_size(String fontName, float fontSize)
    {
    }

    boolean isOpaque()
    {
	return false;
    }

    boolean isTransparent()
    {
	return false;
    }

    void setTransparent(boolean flag)
    {
    }

    int highlightsBy()
    {
	return 0;
    }

    void setHighlightsBy(int aType)
    {
    }

    void setShowsStateBy(int aType)
    {
    }

    void setType(OSButtonType aType)
    {
    }

    int showsStateBy()
    {
	return 0;
    }

    void performClick(Object sender)
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


