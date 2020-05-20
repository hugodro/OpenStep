/* Obj-C to Java:
* Class: NSCalendarDateScanf.
* Source File: NSCalendarDateScanf.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:06 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSCalendarDateScanf extends FormatScanner {
	// Instance Variables.
    OSDictionary locale;
    OSMutableString scannedString;
    OSScanner scanner;
    OSScanner temporary;
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int second;
    OSTimeZone timeZone;
    boolean hourIsUnder12;
    boolean isPM;

	// Methods.
    boolean handleOrdinaryString(String string)
    {
	return false;
    }

    boolean handleFormatSpecifierWithContext(void context)
    {
	return false;
    }

    Object setString_withLocale(String description, OSDictionary locale)
    {
	return null;
    }

    int year()
    {
	return 0;
    }

    int month()
    {
	return 0;
    }

    int day()
    {
	return 0;
    }

    int hour()
    {
	return 0;
    }

    int minute()
    {
	return 0;
    }

    int second()
    {
	return 0;
    }

    OSTimeZone timeZone()
    {
	return null;
    }


}


