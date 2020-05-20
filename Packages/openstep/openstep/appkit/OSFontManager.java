/* Obj-C to Java:
* Class: NSFontManager.
* Source File: NSFontManager.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSFontManager extends OSObject {
	// Instance Variables.
    Object delegate;
    Method action;
    OSMutableArray family_list;
    OSMutableArray family_metrics;
    OSFont selected_font;
    OSMutableArray font_list;
    OSMenu font_menu;

	// Methods.
    static void setFontManagerFactory(Class classId)
    {
    }

    static void setFontPanelFactory(Class classId)
    {
    }

    static OSFontManager sharedFontManager()
    {
	return null;
    }

    void enumerateFamilies()
    {
    }

    OSFont convertFont(OSFont fontObject)
    {
	return null;
    }

    OSFont convertFont_toFamily(OSFont fontObject, String family)
    {
	return null;
    }

    OSFont convertFont_toFace(OSFont fontObject, String typeface)
    {
	return null;
    }

    OSFont convertFont_toHaveTrait(OSFont fontObject, OSFontTraitMask trait)
    {
	return null;
    }

    OSFont convertFont_toNotHaveTrait(OSFont fontObject, OSFontTraitMask trait)
    {
	return null;
    }

    OSFont convertFont_toSize(OSFont fontObject, float size)
    {
	return null;
    }

    OSFont convertWeight_ofFont(boolean upFlag, OSFont fontObject)
    {
	return null;
    }

    OSFont fontWithFamily_traits_weight_size(String family, OSFontTraitMask traits, int weight, float size)
    {
	return null;
    }

    Method action()
    {
	return null;
    }

    OSArray availableFonts()
    {
	return null;
    }

    OSArray familyMetrics()
    {
	return null;
    }

    OSMenu fontMenu(boolean create)
    {
	return null;
    }

    OSFontPanel fontPanel(boolean create)
    {
	return null;
    }

    boolean isEnabled()
    {
	return false;
    }

    boolean isMultiple()
    {
	return false;
    }

    OSFont selectedFont()
    {
	return null;
    }

    void setAction(Method aSelector)
    {
    }

    void setEnabled(boolean flag)
    {
    }

    void setFontMenu(OSMenu newMenu)
    {
    }

    void setSelectedFont_isMultiple(OSFont fontObject, boolean flag)
    {
    }

    OSFontTraitMask traitsOfFont(OSFont fontObject)
    {
	return null;
    }

    int weightOfFont(OSFont fontObject)
    {
	return 0;
    }

    boolean sendAction()
    {
	return false;
    }

    Object delegate()
    {
	return null;
    }

    void setDelegate(Object anObject)
    {
    }

    boolean fontManager_willIncludeFont(Object sender, String fontName)
    {
	return false;
    }


}


