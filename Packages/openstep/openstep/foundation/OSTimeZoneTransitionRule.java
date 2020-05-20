/* Obj-C to Java:
* Class: NSTimeZoneTransitionRule.
* Source File: NSConcreteTimeZone.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:08 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSTimeZoneTransitionRule extends OSObject {
	// Instance Variables.
    OSCalendarDate startDate;
    OSCalendarDate endDate;
    OSTimeZoneRule startRule;
    OSTimeZoneRule endRule;

	// Methods.
    static OSTimeZoneTransitionRule transitionRuleFromPropertyList_timezone(Object plist, Object tz)
    {
	return null;
    }

    Object detailForDate(OSCalendarDate date)
    {
	return null;
    }

    OSComparisonResult compare(Object tranDateOrTranRule)
    {
	return null;
    }

    OSCalendarDate startDate()
    {
	return null;
    }

    OSCalendarDate endDate()
    {
	return null;
    }

    Object detailAfterLastDate()
    {
	return null;
    }


}


