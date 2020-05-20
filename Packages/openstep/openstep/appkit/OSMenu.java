/* Obj-C to Java:
* Class: NSMenu.
* Source File: NSMenu.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSMenu extends OSWindow implements OSCoding {
	// Instance Variables.
    OSMutableArray menu_items;
    OSMenu super_menu;
    boolean autoenables_items;
    OSMatrix menu_matrix;
    boolean is_torn_off;
    Object be_menu_reserved;

	// Methods.
    static OSZone menuZone()
    {
	return null;
    }

    static void setMenuZone(OSZone zone)
    {
    }

	// Constructor.
    public OSMenu(OSRect contentRect, int aStyle, int bufferingType, boolean flag)
    {
        super(contentRect, aStyle, bufferingType, flag);
    }


    Object initWithTitle(String aTitle)
    {
	return null;
    }

    Object addItemWithTitle_action_keyEquivalent(String aString, Object aSelector, String charCode)
    {
	return null;
    }

    Object insertItemWithTitle_action_keyEquivalent_atIndex(String aString, Object aSelector, String charCode, int index)
    {
	return null;
    }

    OSArray itemArray()
    {
	return null;
    }

    OSMatrix itemMatrix()
    {
	return null;
    }

    void setItemMatrix(OSMatrix aMatrix)
    {
    }

    Object cellWithTag(int aTag)
    {
	return null;
    }

    OSMenuCell setSubmenu_forItem(OSMenu aMenu, OSMenuCell aCell)
    {
	return null;
    }

    void submenuAction(Object sender)
    {
    }

    OSMenu attachedMenu()
    {
	return null;
    }

    boolean isAttached()
    {
	return false;
    }

    boolean isTornOff()
    {
	return false;
    }

    OSPoint locationForSubmenu(OSMenu aSubmenu)
    {
	return null;
    }

    void sizeToFit()
    {
    }

    OSMenu supermenu()
    {
	return null;
    }

    boolean autoenablesItems()
    {
	return false;
    }

    void setAutoenablesItems(boolean flag)
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


