/* Obj-C to Java:
* Class: NSNotificationQueue.
* Source File: NSNotificationQueue.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSNotificationQueue extends OSObject {
	// Instance Variables.
    OSNotificationCenter center;
    _NSNotificationQueueList asapQueue;
    _NSNotificationQueueList idleQueue;
    OSZone zone;

	// Methods.
    static OSNotificationQueue defaultQueue()
    {
	return null;
    }

    Object init()
    {
	return null;
    }

    Object initWithNotificationCenter(OSNotificationCenter notificationCenter)
    {
	return null;
    }

    void dequeueNotificationsMatching_coalesceMask(OSNotification notification, int coalesceMask)
    {
    }

    void enqueueNotification_postingStyle(OSNotification notification, OSPostingStyle postingStyle)
    {
    }

    void enqueueNotification_postingStyle_coalesceMask_forModes(OSNotification notification, OSPostingStyle postingStyle, int coalesceMask, OSArray modes)
    {
    }

    static void runLoopIdle()
    {
    }

    static void runLoopASAP()
    {
    }

    void notifyIdle()
    {
    }

    void notifyASAP()
    {
    }


}


