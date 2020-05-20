/* Obj-C to Java:
* Class: NSCalendarDate.
* Source File: NSDate.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:09 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSCalendarDate extends OSDate {
	// Instance Variables.
    OSTimeInterval timeSinceRef;
    OSTimeZoneDetail timeZoneDetail;
    String formatString;

	// Methods.
    static Object calendarDate()
    {
	return null;
    }

    static Object dateWithYear_month_day_hour_minute_second_timeZone(int year, int month, int day, int hour, int minute, int second, OSTimeZone aTimeZone)
    {
	return null;
    }

    static Object dateWithString(String string)
    {
	return null;
    }

    static Object dateWithString_calendarFormat(String description, String format)
    {
	return null;
    }

    static Object dateWithString_calendarFormat_locale(String description, String format, OSDictionary locale)
    {
	return null;
    }

    Object initWithYear_month_day_hour_minute_second_timeZone(int year, int month, int day, int hour, int minute, int second, OSTimeZone aTimeZone)
    {
	return null;
    }

    Object initWithString(String description)
    {
	return null;
    }

    Object initWithString_calendarFormat(String description, String format)
    {
	return null;
    }

    Object initWithString_calendarFormat_locale(String description, String format, OSDictionary locale)
    {
	return null;
    }

    OSTimeZoneDetail timeZoneDetail()
    {
	return null;
    }

    void setTimeZone(OSTimeZone aTimeZone)
    {
    }

    String calendarFormat()
    {
	return null;
    }

    void setCalendarFormat(String format)
    {
    }

    int yearOfCommonEra()
    {
	return 0;
    }

    int monthOfYear()
    {
	return 0;
    }

    int dayOfMonth()
    {
	return 0;
    }

    int dayOfWeek()
    {
	return 0;
    }

    int dayOfYear()
    {
	return 0;
    }

    int hourOfDay()
    {
	return 0;
    }

    int minuteOfHour()
    {
	return 0;
    }

    int secondOfMinute()
    {
	return 0;
    }

    OSCalendarDate addYear_month_day_hour_minute_second(int year, int month, int day, int hour, int minute, int second)
    {
	return null;
    }

    Object dateByAddingYears_month_day_hour_minute_second(int year, int month, int day, int hour, int minute, int second)
    {
	return null;
    }

    String description()
    {
	return null;
    }

    String descriptionWithCalendarFormat(String format)
    {
	return null;
    }

    String descriptionWithCalendarFormat_timeZone(String format, OSTimeZone timeZone)
    {
	return null;
    }

    String descriptionWithCalendarFormat_locale(String format, OSDictionary locale)
    {
	return null;
    }


}


