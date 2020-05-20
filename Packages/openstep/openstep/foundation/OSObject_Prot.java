/* Obj-C to Java:
* Protocol: NSObject.
* Source File: NSObject.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public interface OSObject {
	// Methods.
    Class aClass()
    {
	return null;
    }

    Class superclass()
    {
	return null;
    }

    OSZone zone()
    {
	return null;
    }

    boolean isProxy()
    {
	return false;
    }

    boolean isKindOfClass(Class aClass)
    {
	return false;
    }

    boolean isMemberOfClass(Class aClass)
    {
	return false;
    }

    boolean conformsToProtocol(Protocol aProtocol)
    {
	return false;
    }

    boolean respondsToSelector(Method aSelector)
    {
	return false;
    }

    Object autorelease()
    {
	return null;
    }

    void release()
    {
    }

    Object retain()
    {
	return null;
    }

    int retainCount()
    {
	return 0;
    }

    int hash()
    {
	return 0;
    }

    boolean isEqual(Object anObject)
    {
	return false;
    }

    Object self()
    {
	return null;
    }

    Object performSelector(Method aSelector)
    {
	return null;
    }

    Object performSelector_withObject(Method aSelector, Object anObject)
    {
	return null;
    }

    Object performSelector_withObject_withObject(Method aSelector, Object anObject, Object anotherObject)
    {
	return null;
    }

    Object perform(Method aSelector)
    {
	return null;
    }

    Object perform_withObject(Method aSelector, Object anObject)
    {
	return null;
    }

    Object perform_withObject_withObject(Method aSelector, Object anObject, Object anotherObject)
    {
	return null;
    }

    String description()
    {
	return null;
    }


}


