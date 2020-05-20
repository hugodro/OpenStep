/* Obj-C to Java:
* Class: NSBundle.
* Source File: NSBundle.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSBundle extends OSObject {
	// Instance Variables.
    String fullPath;
    OSDictionary infoDictionary;
    Class firstLoadedClass;
    OSMutableDictionary stringTables;
    boolean codeLoaded;

	// Methods.
    Object initWithPath(String path)
    {
	return null;
    }

    static OSBundle bundleForClass(Class aClass)
    {
	return null;
    }

    static OSBundle bundleWithPath(String path)
    {
	return null;
    }

    static OSBundle mainBundle()
    {
	return null;
    }

    static String libraryResourceDirectory()
    {
	return null;
    }

    Class classNamed(String className)
    {
	return null;
    }

    Class principalClass()
    {
	return null;
    }

    static String pathForResource_ofType_inDirectories(String name, String ext, OSArray directories)
    {
	return null;
    }

    String pathForResource_ofType(String name, String ext)
    {
	return null;
    }

    String pathForResource_ofType_inDirectory(String name, String ext, String bundlePath)
    {
	return null;
    }

    OSArray pathsForResourcesOfType_inDirectory(String extension, String bundlePath)
    {
	return null;
    }

    String resourcePath()
    {
	return null;
    }

    String bundlePath()
    {
	return null;
    }

    OSDictionary infoDictionary()
    {
	return null;
    }

    String localizedStringForKey_value_table(String key, String value, String tableName)
    {
	return null;
    }

    void releaseStringtableCache()
    {
    }


}


