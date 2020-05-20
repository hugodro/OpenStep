/* Obj-C to Java:
* Class: TrackingRectangle.
* Source File: TrackingRectangle.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class TrackingRectangle extends OSObject implements OSCoding {
	// Instance Variables.
    OSRect rectangle;
    int _tag;
    Object owner;
    Object user_data;
    boolean inside;

        // Constructor.
    public TrackingRectangle(OSRect aRect, int aTag, Object anObject, Object theData, boolean flag)
    {
       _tag= aTag;
    }

	// Methods.
    Object initWithRect_tag_owner_userData_inside(OSRect aRect, int aTag, Object anObject, Object theData, boolean flag)
    {
    _tag= aTag;
	return null;
    }

    OSRect rectangle()
    {
	return null;
    }

    int tag()
    {
	return _tag;
    }

    Object owner()
    {
	return null;
    }

    void userData()
    {
    }

    boolean inside()
    {
	return false;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


