/* Obj-C to Java:
* Class: NSOpenPanel.
* Source File: NSOpenPanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSOpenPanel extends OSSavePanel implements OSCoding {
	// Instance Variables.
    OSMutableArray the_filenames;
    boolean multiple_select;
    boolean choose_dir;
    boolean choose_file;

	// Methods.
    static OSOpenPanel openPanel()
    {
	return null;
    }

    boolean allowsMultipleSelection()
    {
	return false;
    }

    boolean canChooseDirectories()
    {
	return false;
    }

    boolean canChooseFiles()
    {
	return false;
    }

    void setAllowsMultipleSelection(boolean flag)
    {
    }

    void setCanChooseDirectories(boolean flag)
    {
    }

    void setCanChooseFiles(boolean flag)
    {
    }

    OSArray filenames()
    {
	return null;
    }

    int runModalForTypes(OSArray fileTypes)
    {
	return 0;
    }

    int runModalForDirectory_file_types(String path, String filename, OSArray fileTypes)
    {
	return 0;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


