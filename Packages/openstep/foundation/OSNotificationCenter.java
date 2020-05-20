/* Obj-C to Java:
* Class: NSNotificationCenter.
* Source File: NSNotification.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSNotificationCenter extends OSObject {
	// Instance Variables.
    Object nameToObjects;
    Object nullNameToObjects;
    Object lock;

	// Methods.
    static OSNotificationCenter defaultCenter()
    {
	return null;
    }

    void postNotification(OSNotification notification)
    {
    }

    void postNotificationName_object(String notificationName, Object object)
    {
    }

    void postNotificationName_object_userInfo(String notificationName, Object object, OSDictionary userInfo)
    {
    }

    void addObserver_selector_name_object(Object observer, Method selector, String name, Object object)
    {
    }

    void removeObserver_name_object(Object observer, String name, Object object)
    {
    }

    void removeObserver(Object observer)
    {
    }


}


