/* Obj-C to Java:
* Class: NSColorList.
* Source File: NSColorList.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSColorList extends OSObject implements OSCoding {
	// Methods.
    Object initWithName(String name)
    {
	return null;
    }

    Object initWithName_fromFile(String name, String path)
    {
	return null;
    }

    static OSArray availableColorLists()
    {
	return null;
    }

    static OSColorList colorListNamed(String name)
    {
	return null;
    }

    String name()
    {
	return null;
    }

    OSArray allKeys()
    {
	return null;
    }

    OSColor colorWithKey(String key)
    {
	return null;
    }

    void insertColor_key_atIndex(OSColor color, String key, int location)
    {
    }

    void removeColorWithKey(String key)
    {
    }

    void setColor_forKey(OSColor aColor, String key)
    {
    }

    boolean isEditable()
    {
	return false;
    }

    boolean writeToFile(String path)
    {
	return false;
    }

    void removeFile()
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


