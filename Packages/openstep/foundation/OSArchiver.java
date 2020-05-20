/* Obj-C to Java:
* Class: NSArchiver.
* Source File: NSArchiver.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSArchiver extends OSCoder {
	// Instance Variables.
    OSMutableData mdata;
    OSHashTable objects;
    OSHashTable conditionals;
    OSMapTable classes;
    OSHashTable pointers;
    Object writeIMP;
    boolean writingRoot;
    boolean findingConditionals;

	// Methods.
    Object initForWritingWithMutableData(OSMutableData mdata)
    {
	return null;
    }

    static OSData archivedDataWithRootObject(Object rootObject)
    {
	return null;
    }

    static boolean archiveRootObject_toFile(Object rootObject, String path)
    {
	return false;
    }

    void encodeConditionalObject(Object object)
    {
    }

    void encodeRootObject(Object rootObject)
    {
    }

    OSMutableData archiverData()
    {
	return null;
    }

    String classNameEncodedForTrueClassName(String trueName)
    {
	return null;
    }

    void encodeClassName_intoClassName(String trueName, String inArchiveName)
    {
    }


// Protocol OSCoding.

    public void encodeWithCoder(OSCoder aCoder)
    {
    }

    public Object initWithCoder(OSCoder aDecoder)
    {
        return null;
    }


}


