/* Obj-C to Java:
* Class: NSConcreteTimeZoneDetail.
* Source File: NSConcreteTimeZoneDetail.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:08 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSConcreteTimeZoneDetail extends OSTimeZoneDetail {
	// Instance Variables.
    String abbreviation;
    String name;
    int offsetFromGMT;
    boolean isDST;

	// Methods.
    static Object detailFromPropertyList_name(Object propList, String name)
    {
	return null;
    }

    Object initWithAbbreviation_secondsFromGMT_isDaylightSaving_name(String anAbbreviation, int aDifference, boolean aDst, String name)
    {
	return null;
    }

    boolean isDaylightSavingTimeZone()
    {
	return false;
    }

    String timeZoneAbbreviation()
    {
	return null;
    }

    String name()
    {
	return null;
    }

    int timeZoneSecondsFromGMT()
    {
	return 0;
    }

    String description()
    {
	return null;
    }

    static int _offsetFromString(String string)
    {
	return 0;
    }


}


