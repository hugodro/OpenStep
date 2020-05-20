/* Obj-C to Java:
* Class: NSDirectoryEnumerator.
* Source File: NSFileManager.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSDirectoryEnumerator extends OSEnumerator {
	// Instance Variables.
    OSMutableArray enumStack;
    OSMutableArray pathStack;
    String currentFileName;
    String currentFilePath;
    String topPath;
    NONAME flags;

	// Methods.
    Object initWithDirectoryPath_recurseIntoSubdirectories_followSymlinks_prefixFiles(String path, boolean recurse, boolean follow, boolean prefix)
    {
	return null;
    }

    OSDictionary directoryAttributes()
    {
	return null;
    }

    OSDictionary fileAttributes()
    {
	return null;
    }

    void skipDescendents()
    {
    }


}


