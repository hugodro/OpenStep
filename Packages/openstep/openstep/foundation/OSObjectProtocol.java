/* Obj-C to Java:
* Protocol: NSObject.
* Source File: NSObject.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public interface OSObjectProtocol {
	// Methods.
    Class aClass();

    Class superclass();

    OSZone zone();

    boolean isProxy();

    boolean isKindOfClass(Class aClass);

    boolean isMemberOfClass(Class aClass);

    boolean conformsToProtocol(Object aProtocol);

    boolean respondsToSelector(Object aSelector);

    Object autorelease();

    void release();

    Object retain();

    int retainCount();

    int hash();

    boolean isEqual(Object anObject);

    Object self();

    Object performSelector(Object aSelector);

    Object performSelector_withObject(Object aSelector, Object anObject);

    Object performSelector_withObject_withObject(Object aSelector, Object anObject, Object anotherObject);

    Object perform(Object aSelector);

    Object perform_withObject(Object aSelector, Object anObject);

    Object perform_withObject_withObject(Object aSelector, Object anObject, Object anotherObject);

    String description();


}


