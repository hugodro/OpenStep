/* Obj-C to Java:
* Class: NSUnarchiver.
* Source File: NSArchiver.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;


public class OSUnarchiver extends OSCoder {
	// Instance Variables.
    OSData rdata;
    int cursor;
    Object readIMP;
    OSZone objectZone;
    int archiverVersion;
    OSMapTable objects;
    OSMapTable classes;
    OSMapTable pointers;
    OSMapTable classAlias;
    OSMapTable classVersions;

	// Methods.
    Object initForReadingWithData(OSData data)
    {
	return null;
    }

    static Object unarchiveObjectWithData(OSData data)
    {
	return null;
    }

    static Object unarchiveObjectWithFile(String path)
    {
	return null;
    }

    void decodeArrayOfObjCType_count_at(char itemType, int count, Object array)
    {
    }

    boolean isAtEnd()
    {
	return false;
    }

    OSZone objectZone()
    {
	return null;
    }

    void setObjectZone(OSZone zone)
    {
    }

    int systemVersion()
    {
	return 0;
    }

    static String classNameDecodedForArchiveClassName(String nameInArchive)
    {
	return null;
    }

    static void decodeClassName_asClassName(String nameInArchive, String trueName)
    {
    }

    String outClassNameDecodedForArchiveClassName(String nameInArchive)
    {
	return null;
    }

    void ourDecodeClassName_asClassName(String nameInArchive, String trueName)
    {
    }

    int versionForClassName(String className)
    {
	return 0;
    }


}


