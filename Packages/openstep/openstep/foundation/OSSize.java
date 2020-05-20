/*******************************************************
* Class: OSSize.
* Source File: NSGeometry.h.
* Module: OpenStep : Foundation.
* Time stamp: Mon Jun 23 22:55:05 1997.
* Traducteur: HD.
*******************************************************/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSize extends OSObject implements OSCoding {

	// Class variables.
    static final OSSize theZero= new OSSize(0.0f, 0.0f);

	// Instance variables.
    public float width;
    public float height;


	// Class methods.
    public static OSSize zeroSize()
    {
	return theZero;
    }

	// Constructor.
    public OSSize(float aWidth, float aHeight)
    {
	width= aWidth;
	height= aHeight;
    }

    public OSSize(OSSize aSize)
    {
	width= aSize.width;
	height= aSize.height;
    }
}