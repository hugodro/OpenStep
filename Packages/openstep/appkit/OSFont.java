/* Obj-C to Java:
* Class: NSFont.
* Source File: NSFont.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSFont extends OSObject implements OSCoding {
	// Instance Variables.
    String family_name;
    String font_name;
    String type_face;
    float point_size;
    int font_traits;
    int font_weight;
    Object be_font_reserved;

	// Methods.
    static OSFont boldSystemFontOfSize(float fontSize)
    {
	return null;
    }

    static OSFont fontWithName_matrix(String fontName, float fontMatrix)
    {
	return null;
    }

    static OSFont fontWithName_size(String fontName, float fontSize)
    {
	return null;
    }

    static OSFont systemFontOfSize(float fontSize)
    {
	return null;
    }

    static OSFont userFixedPitchFontOfSize(float fontSize)
    {
	return null;
    }

    static OSFont userFontOfSize(float fontSize)
    {
	return null;
    }

    static void setUserFixedPitchFont(OSFont aFont)
    {
    }

    static void setUserFont(OSFont aFont)
    {
    }

    static void useFont(String fontName)
    {
    }

    void set()
    {
    }

    OSDictionary afmDictionary()
    {
	return null;
    }

    String afmFileContents()
    {
	return null;
    }

    OSRect boundingRectForFont()
    {
	return null;
    }

    String displayName()
    {
	return null;
    }

    String familyName()
    {
	return null;
    }

    String fontName()
    {
	return null;
    }

    boolean isBaseFont()
    {
	return false;
    }

    float matrix()
    {
	return 0.0f;
    }

    float pointSize()
    {
	return 0.0f;
    }

    OSFont printerFont()
    {
	return null;
    }

    OSFont screenFont()
    {
	return null;
    }

    float widthOfString(String string)
    {
	return 0.0f;
    }

    float widths()
    {
	return 0.0f;
    }

    OSSize advancementForGlyph(OSGlyph aGlyph)
    {
	return null;
    }

    OSRect boundingRectForGlyph(OSGlyph aGlyph)
    {
	return null;
    }

    boolean glyphIsEncoded(OSGlyph aGlyph)
    {
	return false;
    }

    OSPoint positionOfGlyph_precededByGlyph_isNominal(OSGlyph curGlyph, OSGlyph prevGlyph, boolean nominal)
    {
	return null;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


