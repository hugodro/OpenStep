/* Obj-C to Java:
* Class: NSMutableArray.
* Source File: NSArray.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSMutableArray extends OSArray {

	// Class methods.
    public static OSObject allocWithZone(OSZone zone)
    {
	return new OSMutableArray(16);
    }

    static OSMutableArray arrayWithCapacity(int aNumItems)
    {
	return new OSMutableArray(aNumItems);
    }

	// Constructor.
    public OSMutableArray()
    {
	    this(16);
    }

    public OSMutableArray(int aCapacity)
    {
	theObjects= new Object[aCapacity];
    }


	// Instance methods.
	// -- Subsection: initializators.
    OSMutableArray initWithCapacity(int aNumItems)
    {
	// TODO.
	return null;
    }

    Object init()
    {
	// TODO.
	return null;
    }

	// Instance methods.
	// -- Subsection: utility.
    public void addObject(Object anObject)
    {
	if (nbrContained == theObjects.length) {
	    Object[] tmpContainer= new Object[theObjects.length + 16];
	    System.arraycopy(theObjects, 0, tmpContainer, 0, nbrContained);
	    theObjects= tmpContainer;
	}
	theObjects[nbrContained++]= anObject;
    }

    void addObjectsFromArray(OSArray anotherArray)
    {
	// TODO.
    }

    void insertObject_atIndex(Object anObject, int index)
    {
	// TODO.
    }

    void removeAllObjects()
    {
	nbrContained= 0;
    }

    void removeLastObject()
    {
	if (nbrContained > 0) nbrContained--;
    }

    public void removeObject(Object anObject)
    {
	for (int i= 0, j= nbrContained; i < j; i++) {
	    if (theObjects[i] == anObject) {
		System.arraycopy(theObjects, i+1, theObjects, i, nbrContained - i - 1);
		nbrContained--;
		return;
	    }
	}
    }

    public void removeObjectAtIndex(int index)
    {
	if (index < nbrContained) {
	    System.arraycopy(theObjects, index+1, theObjects, index, nbrContained - index - 1);
	    nbrContained--;
	}
    }

    void removeObjectIdenticalTo(Object anObject)
    {
	// TODO.
    }

    void removeObjectsFromIndices_numIndices(int indices, int count)
    {
	// TODO.
    }

    void removeObjectsInArray(OSArray otherArray)
    {
	// TODO.
    }

    void removeObject_inRange(Object anObject, OSRange aRange)
    {
	// TODO.
    }

    void removeObjectIdenticalTo_inRange(Object anObject, OSRange aRange)
    {
	// TODO.
    }

    void removeObjectsInRange(OSRange aRange)
    {
	// TODO.
    }

    void sortUsingFunction_context(Object compare, Object context)
    {
	// TODO.
    }

    void sortUsingSelector(Object comparator)
    {
	// TODO.
    }

    public void replaceObjectAtIndex_withObject(int index, Object anObject)
    {
	if (index < nbrContained) {
	    theObjects[index]= anObject;
	}
    }

    void replaceObjectsInRange_withObjectsFromArray(OSRange rRange, OSArray anArray)
    {
	// TODO.
    }

    void replaceObjectsInRange_withObjectsFromArray_range(OSRange rRange, OSArray anArray, OSRange aRange)
    {
	// TODO.
    }

    void setArray(OSArray otherArray)
    {
	// TODO.
    }


}


