/* Obj-C to Java:
* Class: NSMenuCell.
* Source File: NSMenuCell.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSMenuCell extends OSButtonCell implements OSCoding {
	// Instance Variables.
    String key_equivalent;
    OSMenu sub_menu;
    int menu_identifier;
    Object be_mc_reserved;

	// Methods.
    int menuIdentifier()
    {
	return 0;
    }

    void setMenuIdentifier(int theID)
    {
    }

    boolean hasSubmenu()
    {
	return false;
    }

    OSMenu submenu()
    {
	return null;
    }

    void setSubmenu(OSMenu aMenu)
    {
    }

    static void setUsesUserKeyEquivalents(boolean flag)
    {
    }

    static boolean usesUserKeyEquivalents()
    {
	return false;
    }

    String userKeyEquivalent()
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


