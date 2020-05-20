/* Obj-C to Java:
* Class: NSDictionary.
* Source File: NSDictionary.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:09 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSDictionary extends OSObject implements OSCoding, OSCopying, OSMutableCopying {
	// Methods.
    static OSObject allocWithZone(OSZone zone)
    {
	return null;
    }

    static Object dictionary()
    {
	return null;
    }

    static Object dictionaryWithContentsOfFile(String path)
    {
	return null;
    }

    static Object dictionaryWithObjects_forKeys(OSArray objects, OSArray keys)
    {
	return null;
    }

    static Object dictionaryWithObjects_forKeys_count(Object objects, Object keys, int count)
    {
	return null;
    }

    static Object dictionaryWithObjectsAndKeys(Object firstObject, Object[] ellipsis)
    {
	return null;
    }

    static Object dictionaryWithDictionary(OSDictionary aDict)
    {
	return null;
    }

    static Object dictionaryWithObject_forKey(Object object, Object key)
    {
	return null;
    }

    Object initWithContentsOfFile(String path)
    {
	return null;
    }

    Object initWithDictionary(OSDictionary dictionary)
    {
	return null;
    }

    Object initWithDictionary_copyItems(OSDictionary dictionary, boolean flag)
    {
	return null;
    }

    Object initWithObjectsAndKeys(Object firstObject, Object[] ellipsis)
    {
	return null;
    }

    Object initWithObjects_forKeys(OSArray objects, OSArray keys)
    {
	return null;
    }

    Object initWithObjects_forKeys_count(Object objects, Object keys, int count)
    {
	return null;
    }

    OSArray allKeys()
    {
	return null;
    }

    OSArray allKeysForObject(Object object)
    {
	return null;
    }

    OSArray allValues()
    {
	return null;
    }

    OSEnumerator keyEnumerator()
    {
	return null;
    }

    OSEnumerator objectEnumerator()
    {
	return null;
    }

    Object objectForKey(Object aKey)
    {
	return null;
    }

    OSArray objectsForKeys_notFoundMarker(OSArray keys, Object notFoundObj)
    {
	return null;
    }

    int count()
    {
	return 0;
    }

    boolean isEqualToDictionary(OSDictionary other)
    {
	return false;
    }

    public String description()
    {
	return null;
    }

    String descriptionInStringsFileFormat()
    {
	return null;
    }

    String descriptionWithLocale(OSDictionary localeDictionary)
    {
	return null;
    }

    String descriptionWithLocale_indent(OSDictionary localeDictionary, int level)
    {
	return null;
    }

    boolean writeToFile_atomically(String path, boolean useAuxiliaryFile)
    {
	return false;
    }

    public int hash()
    {
	return 0;
    }

    public boolean isEqual(Object anObject)
    {
	return false;
    }


// Protocol OSCopying.
    public Object copyWithZone(OSZone zone)
    {
        return null;
    }


// Protocol OSMutableCopying.
    public Object mutableCopyWithZone(OSZone zone)
    {
        return null;
    }


}


