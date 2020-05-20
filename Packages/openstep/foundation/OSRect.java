/*******************************************************
* Class: OSRect.
* Source File: NSGeometry.h.
* Module: OpenStep : Foundation.
* Time stamp: Mon Jun 23 22:55:05 1997.
* Traducteur: HD.
*******************************************************/

package openstep.foundation;

import openstep.foundation.*;

public class OSRect extends OSObject implements OSCoding {

	// Class variables.
    static final OSRect theZero= new OSRect(OSPoint.zeroPoint(), OSSize.zeroSize());

	// Instance variables.
    public OSPoint origin;
    public OSSize size;

	// Class methods.
    public static OSRect zeroRect()
    {
	return theZero;
    }

	// Constructor.
    public OSRect(OSPoint aPoint, OSSize aSize)
    {
	origin= aPoint;
	size= aSize;
    }

	// Constructor.
    public OSRect(OSRect aFrame)
    {
	origin= new OSPoint(aFrame.origin);
	size= new OSSize(aFrame.size);
    }

}