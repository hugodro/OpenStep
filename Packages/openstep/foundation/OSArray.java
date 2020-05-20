/* Obj-C to Java:
* Class: NSArray.
* Source File: NSArray.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;

class OSArrayEnumerator extends OSEnumerator {
	// Instance variables.
    OSArray ourArray;
    int cursorIndex;
    int increment;

	// Constructor.
    OSArrayEnumerator(OSArray anArray, boolean direction)
    {
	ourArray= anArray;
	if (direction) {
	    cursorIndex= 0;
	    increment= 1;
	}
	else {
	    cursorIndex= ourArray.count();
	    increment= -1;
	}
    }


	// Instance methods.
    public Object nextObject()
    {
	if ((cursorIndex >= 0) && (cursorIndex < ourArray.count())) {
	    cursorIndex+= increment;
	    return ourArray.objectAtIndex(cursorIndex - increment);
	}
	return null;
    }
}


public class OSArray extends OSObject implements OSCoding, OSCopying, OSMutableCopying {

	// Instance variables.
    Object[] theObjects;
    int nbrContained;


	// Class methods.
    public static OSObject allocWithZone(OSZone zone)
    {
	return new OSArray();
    }

    public static OSArray array()
    {
	return (OSArray)allocWithZone(OSZone.defaultZone());
    }

    public static OSArray arrayWithObject(Object anObject)
    {
	if (anObject != null) return new OSArray(anObject);
	return null;	//	Should throw an NSInvalidArgumentException.
    }

    public static OSArray arrayWithObjects(Object firstObj, Object[] ellipsis)
    {
	// TODO.
	return null;
    }

    public static OSArray arrayWithArray(OSArray anotherArray)
    {
	return new OSArray(anotherArray);
    }

    public static OSArray arrayWithContentsOfFile(String fileName)
    {
	// TODO.
	return null;
    }

    public static OSArray arrayWithObjects_count(Object objects, int count)
    {
	// TODO.
	return null;
    }


	// Constructor.
    public OSArray()
    {
	nbrContained= 0;
    }

    public OSArray(Object anObject)
    {
	theObjects= new Object[1];		// Start with a 16 slot container.
	theObjects[0]= anObject;
	nbrContained= 1;
    }

    public OSArray(OSArray anArray)
    {
	theObjects= new Object[anArray.count()];
	System.arraycopy(anArray, 0, theObjects, 0, anArray.count());
	nbrContained= anArray.count();
    }


	// Instance methods.
	// -- Subsection: initializators.
    OSArray arrayByAddingObject(Object anObject)
    {
	// TODO.
	return null;
    }

    OSArray arrayByAddingObjectsFromArray(OSArray anotherArray)
    {
	// TODO.
	return null;
    }

    public OSArray initWithArray(OSArray anotherArray)
    {
	// TODO.
	return null;
    }

    public Object initWithArray_copyItems(OSArray anotherArray, boolean flag)
    {
	// TODO.
	return null;
    }

    public Object initWithObjects(Object firstObj, Object[] ellipsis)
    {
	// TODO.
	return null;
    }

    public Object initWithObjects_count(Object objects, int count)
    {
	// TODO.
	return null;
    }

    public Object initWithContentsOfFile(String fileName)
    {
	// TODO.
	return null;
    }

	// Instance methods.
	// -- Subsection: utility.
    boolean containsObject(Object anObject)
    {
	for (int i= 0, j= nbrContained; i < j; i++) {
	    if (theObjects[i] == anObject) return true;
	}
	return false;
    }

    public int count()
    {
	return nbrContained;
    }

    int indexOfObject(Object anObject)
    {
	for (int i= 0, j= nbrContained; i < j; i++) {
	    if (theObjects[i] == anObject) return i;	// Should be using 'isEqual'.
	}
	return -1;
    }

    public int indexOfObjectIdenticalTo(Object anObject)
    {
	for (int i= 0, j= nbrContained; i < j; i++) {
	    if (theObjects[i] == anObject) return i;
	}
	return -1;
    }

    int indexOfObject_inRange(Object anObject, OSRange aRange)
    {
	// TODO.
	return 0;
    }

    int indexOfObjectIdenticalTo_inRange(Object anObject, OSRange aRange)
    {
	// TODO.
	return 0;
    }

    Object lastObject()
    {
	if (nbrContained > 0) {
	    return theObjects[nbrContained-1];
	}
	return null;
    }

    public Object objectAtIndex(int index)
    {
	if ((index >= 0) && (index < nbrContained)) {
	    return theObjects[index];
	}
	return null;
    }

    public OSEnumerator objectEnumerator()
    {
	return new OSArrayEnumerator(this, true);
    }

    OSEnumerator reverseObjectEnumerator()
    {
	return new OSArrayEnumerator(this, false);
    }

    void makeObjectsPerform(Object aSelector)
    {
	// TODO.
    }

    void makeObjectsPerform_withObject(Object aSelector, Object anObject)
    {
	// TODO.
    }

    Object firstObjectCommonWithArray(OSArray otherArray)
    {
	// TODO.
	return null;
    }

    boolean isEqualToArray(OSArray otherArray)
    {
	// TODO.
	return false;
    }

    OSArray sortedArrayUsingFunction_context(Object comparator, Object context)
    {
	// TODO.
	return null;
    }

    OSArray sortedArrayUsingSelector(Object comparator)
    {
	// TODO.
	return null;
    }

    OSArray subarrayWithRange(OSRange range)
    {
	// TODO.
	return null;
    }

    String componentsJoinedByString(String separator)
    {
	// TODO.
	return null;
    }

    public String description()
    {
	// TODO.
	return null;
    }

    String stringRepresentation()
    {
	// TODO.
	return null;
    }

    String descriptionWithLocale(OSDictionary locale)
    {
	// TODO.
	return null;
    }

    String descriptionWithLocale_indent(OSDictionary locale, int level)
    {
	// TODO.
	return null;
    }

    boolean writeToFile_atomically(String fileName, boolean flag)
    {
	// TODO.
	return false;
    }

    public int hash()
    {
	// TODO.
	return 0;
    }

    public boolean isEqual(Object anObject)
    {
	// ATTN-970627 [HD]: What is the meaning of equality for arrays ?
	return (this == anObject);
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


