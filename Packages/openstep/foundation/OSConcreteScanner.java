/* Obj-C to Java:
* Class: NSConcreteScanner.
* Source File: NSConcreteScanner.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:08 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSConcreteScanner extends OSScanner {
	// Instance Variables.
    OSDictionary locale;
    String string;
    int scanLocation;
    boolean caseSensitive;
    OSCharacterSet skipSet;

	// Methods.
    Object initWithString(String string)
    {
	return null;
    }

    String string()
    {
	return null;
    }

    void setScanLocation(int index)
    {
    }

    int scanLocation()
    {
	return 0;
    }

    void setCaseSensitive(boolean flag)
    {
    }

    boolean caseSensitive()
    {
	return false;
    }

    void setCharactersToBeSkipped(OSCharacterSet skipSet)
    {
    }

    OSCharacterSet charactersToBeSkipped()
    {
	return null;
    }

    void setLocale(OSDictionary locale)
    {
    }

    OSDictionary locale()
    {
	return null;
    }


}


