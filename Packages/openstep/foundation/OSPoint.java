/*******************************************************
* Class: OSPoint.
* Source File: NSGeometry.h.
* Module: OpenStep : Foundation.
* Time stamp: Mon Jun 23 22:55:05 1997.
* Traducteur: HD.
*******************************************************/

package openstep.foundation;

import openstep.foundation.*;

public class OSPoint extends OSObject implements OSCoding {
    static final OSPoint theZero= new OSPoint(0, 0);

	// Instance variables.
    public float x;
    public float y;

	// Class methods.
    public static OSPoint zeroPoint()
    {
	return theZero;
    }

	// Constructor.
    public OSPoint(float anX, float anY)
    {
	x= anX;
	y= anY;
    }

    public OSPoint(OSPoint aPoint)
    {
	x= aPoint.x;
	y= aPoint.y;
    }
}