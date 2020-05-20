/* Obj-C to Java:
* Class: NSPasteboard.
* Source File: NSPasteboard.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPasteboard extends OSObject {
	// Methods.
    static OSPasteboard generalPasteboard()
    {
	return null;
    }

    static OSPasteboard pasteboardWithName(String name)
    {
	return null;
    }

    static OSPasteboard pasteboardWithUniqueName()
    {
	return null;
    }

    void releaseGlobally()
    {
    }

    static OSPasteboard pasteboardByFilteringData_ofType(OSData data, String type)
    {
	return null;
    }

    static OSPasteboard pasteboardByFilteringFile(String filename)
    {
	return null;
    }

    static OSPasteboard pasteboardByFilteringTypesInPasteboard(OSPasteboard pboard)
    {
	return null;
    }

    static OSArray typesFilterableTo(String type)
    {
	return null;
    }

    String name()
    {
	return null;
    }

    int addTypes_owner(OSArray newTypes, Object newOwner)
    {
	return 0;
    }

    int declareTypes_owner(OSArray newTypes, Object newOwner)
    {
	return 0;
    }

    boolean setData_forType(OSData data, String dataType)
    {
	return false;
    }

    boolean setPropertyList_forType(Object propertyList, String dataType)
    {
	return false;
    }

    boolean setString_forType(String string, String dataType)
    {
	return false;
    }

    boolean writeFileContents(String filename)
    {
	return false;
    }

    String availableTypeFromArray(OSArray types)
    {
	return null;
    }

    OSArray types()
    {
	return null;
    }

    int changeCount()
    {
	return 0;
    }

    OSData dataForType(String dataType)
    {
	return null;
    }

    Object propertyListForType(String dataType)
    {
	return null;
    }

    String readFileContentsType_toFile(String type, String filename)
    {
	return null;
    }

    String stringForType(String dataType)
    {
	return null;
    }

    void pasteboard_provideDataForType(OSPasteboard sender, String type)
    {
    }

    void pasteboardChangedOwner(OSPasteboard sender)
    {
    }


}


