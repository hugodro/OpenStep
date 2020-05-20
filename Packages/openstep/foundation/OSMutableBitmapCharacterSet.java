/* Obj-C to Java:
* Class: NSMutableBitmapCharacterSet.
* Source File: NSConcreteCharacterSet.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:07 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSMutableBitmapCharacterSet extends OSMutableCharacterSet {
	// Instance Variables.
    Object data;
    char bytes;
    boolean inverted;

	// Methods.
    Object initWithBitmapRepresentation(Object data)
    {
	return null;
    }

    Object initWithBitmapRepresentation_inverted(Object data, boolean inv)
    {
	return null;
    }

    OSData bitmapRepresentation()
    {
	return null;
    }

    boolean characterIsMember(unichar aCharacter)
    {
	return false;
    }

    OSCharacterSet invertedSet()
    {
	return null;
    }

    void addCharactersInRange(OSRange aRange)
    {
    }

    void addCharactersInString(String aString)
    {
    }

    void removeCharactersInRange(OSRange aRange)
    {
    }

    void removeCharactersInString(String aString)
    {
    }

    void formIntersectionWithCharacterSet(OSCharacterSet otherSet)
    {
    }

    void formUnionWithCharacterSet(OSCharacterSet otherSet)
    {
    }

    void invert()
    {
    }


}


