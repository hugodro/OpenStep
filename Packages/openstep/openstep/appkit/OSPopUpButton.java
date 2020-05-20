/* Obj-C to Java:
* Class: NSPopUpButton.
* Source File: NSPopUpButton.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPopUpButton extends OSView implements OSCoding {
	// Instance Variables.
    OSMutableArray list_items;
    OSRect list_rect;
    int selected_item;
    Object pub_target;
    Method pub_action;
    boolean is_up;
    boolean pulls_down;
    Object be_pub_reserved;

	// Methods.
    Object initWithFrame_pullsDown(OSRect frameRect, boolean flag)
    {
	return null;
    }

    Method action()
    {
	return null;
    }

    void setAction(Method aSelector)
    {
    }

    Object target()
    {
	return null;
    }

    void setTarget(Object anObject)
    {
    }

    void addItemWithTitle(String title)
    {
    }

    void addItemsWithTitles(OSArray itemTitles)
    {
    }

    void insertItemWithTitle_atIndex(String title, int index)
    {
    }

    void removeAllItems()
    {
    }

    void removeItemWithTitle(String title)
    {
    }

    void removeItemAtIndex(int index)
    {
    }

    int indexOfItemWithTitle(String title)
    {
	return 0;
    }

    int indexOfSelectedItem()
    {
	return 0;
    }

    int numberOfItems()
    {
	return 0;
    }

    OSMenuCell itemAtIndex(int index)
    {
	return null;
    }

    OSMatrix itemMatrix()
    {
	return null;
    }

    String itemTitleAtIndex(int index)
    {
	return null;
    }

    OSArray itemTitles()
    {
	return null;
    }

    OSMenuCell itemWithTitle(String title)
    {
	return null;
    }

    OSMenuCell lastItem()
    {
	return null;
    }

    OSMenuCell selectedItem()
    {
	return null;
    }

    String titleOfSelectedItem()
    {
	return null;
    }

    OSFont font()
    {
	return null;
    }

    boolean pullsDown()
    {
	return false;
    }

    void selectItemAtIndex(int index)
    {
    }

    void selectItemWithTitle(String title)
    {
    }

    void setFont(OSFont fontObject)
    {
    }

    void setPullsDown(boolean flag)
    {
    }

    void setTitle(String aString)
    {
    }

    String stringValue()
    {
	return null;
    }

    void synchronizeTitleAndSelectedItem()
    {
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


