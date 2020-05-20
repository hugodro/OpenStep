/* Obj-C to Java:
* Class: NSEvent.
* Source File: NSEvent.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;


class AkEventData {
// The event-perticular data comes here.
}


public class OSEvent extends OSObject implements OSCoding {
    int event_type;
    OSPoint location_point;
    int modifier_flags;
    double event_time;
    int window_num;
    OSDPSContext event_context;
    AkEventData _MV_event_data;

	// Methods.
    static OSEvent enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData(int type, OSPoint location, int flags, double time, int windowNum, OSDPSContext context, int eventNum, int trackingNum, Object userData)
    {
	return null;
    }

    static OSEvent keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(int type, OSPoint location, int flags, double time, int windowNum, OSDPSContext context, String keys, String ukeys, boolean repeatKey, short code)
    {
	return null;
    }

    static OSEvent mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(int type, OSPoint location, int flags, double time, int windowNum, OSDPSContext context, int eventNum, int clickNum, float pressureValue)
    {
	return null;
    }

    static OSEvent otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2(int type, OSPoint location, int flags, double time, int windowNum, OSDPSContext context, short subType, int data1, int data2)
    {
	return null;
    }

    OSDPSContext context()
    {
	return null;
    }

    OSPoint locationInWindow()
    {
	return null;
    }

    int modifierFlags()
    {
	return 0;
    }

    double timestamp()
    {
	return 0.0;
    }

    int type()
    {
	return 0;
    }

    OSWindow window()
    {
	return null;
    }

    int windowNumber()
    {
	return 0;
    }

    String characters()
    {
	return null;
    }

    String charactersIgnoringModifiers()
    {
	return null;
    }

    boolean isARepeat()
    {
	return false;
    }

    short keyCode()
    {
	return 0;
    }

    int clickCount()
    {
	return 0;
    }

    int eventNumber()
    {
	return 0;
    }

    float pressure()
    {
	return 0.0f;
    }

    int trackingNumber()
    {
	return 0;
    }

    void userData()
    {
    }

    static void startPeriodicEventsAfterDelay_withPeriod(double delaySeconds, double periodSeconds)
    {
    }

    static void stopPeriodicEvents()
    {
    }

    int data1()
    {
	return 0;
    }

    int data2()
    {
	return 0;
    }

    short subtype()
    {
	return 0;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


