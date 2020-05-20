/* Obj-C to Java:
* Class: NSScanner.
* Source File: NSScanner.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSScanner extends OSObject {
	// Methods.
    static Object scannerWithString(String string)
    {
	return null;
    }

    static Object localizedScannerWithString(String string)
    {
	return null;
    }

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

    boolean scanCharactersFromSet_intoString(OSCharacterSet scanSet, String value)
    {
	return false;
    }

    boolean scanUpToCharactersFromSet_intoString(OSCharacterSet stopSet, String value)
    {
	return false;
    }

    boolean scanDouble(double value)
    {
	return false;
    }

    boolean scanFloat(float value)
    {
	return false;
    }

    boolean scanInt(int value)
    {
	return false;
    }

    boolean scanLongLong(long value)
    {
	return false;
    }

    boolean scanString_intoString(String string, String value)
    {
	return false;
    }

    boolean scanUpToString_intoString(String stopString, String value)
    {
	return false;
    }

    boolean isAtEnd()
    {
	return false;
    }


}


