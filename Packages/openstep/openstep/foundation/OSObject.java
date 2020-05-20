/* Obj-C to Java:
* Class: NSObject.
* Source File: NSObject.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSObject extends Object implements OSObjectProtocol, OSCoding {
	// Instance Variables.
    Class isa;

	// Methods.
    static void initialize()
    {
    }

    static OSObject alloc()
    {
	return null;
    }

    static OSObject allocWithZone(OSZone zone)
    {
	return null;
    }

/* MOD-970627 [HD]: Illegal in Java.
    static Object new()
    {
	return null;
    }
*/

    void dealloc()
    {
    }

    Object init()
    {
	return null;
    }

    static boolean instancesRespondToSelector(Object aSelector)
    {
	return false;
    }


    static Object instanceMethodForSelector(Object aSelector)
    {
	return null;
    }

    Object methodForSelector(Object aSelector)
    {
	return null;
    }

    static OSMethodSignature instanceMethodSignatureForSelector(Object aSelector)
    {
	return null;
    }

    OSMethodSignature methodSignatureForSelector(Object aSelector)
    {
	return null;
    }

    static void poseAsClass(Class aClass)
    {
    }

    void doesNotRecognizeSelector(Object aSelector)
    {
    }

    static void cancelPreviousPerformRequestsWithTarget_selector_object(Object aTarget, Object aSelector, Object anObject)
    {
    }

    void performSelector_object_afterDelay(Object aSelector, Object anObject, double delay)
    {
    }

    void forwardInvocation(OSInvocation anInvocation)
    {
    }

    Object awakeAfterUsingCoder(OSCoder aDecoder)
    {
	return null;
    }

    Class classForArchiver()
    {
	return null;
    }

    Class classForCoder()
    {
	return null;
    }

    Object replacementObjectForArchiver(OSArchiver anArchiver)
    {
	return null;
    }

    Object replacementObjectForCoder(OSCoder anEncoder)
    {
	return null;
    }

    static void setVersion(int version)
    {
    }

    static int version()
    {
	return 0;
    }

    Object copy()
    {
	return null;
    }

    Object mutableCopy()
    {
	return null;
    }

    String stringRepresentation()
    {
	return null;
    }


// Protocol OSObjectProtocol
    public Class aClass()
    {
	return null;
    }

    public Class superclass()
    {
	return null;
    }

    public OSZone zone()
    {
	return null;
    }

    public boolean isProxy()
    {
	return false;
    }

    public boolean isKindOfClass(Class aClass)
    {
	return false;
    }

    public boolean isMemberOfClass(Class aClass)
    {
	return false;
    }

    public boolean conformsToProtocol(Object aProtocol)
    {
	return false;
    }

    public boolean respondsToSelector(Object aSelector)
    {
	return false;
    }

    public Object autorelease()
    {
	return null;
    }

    public void release()
    {
    }

    public Object retain()
    {
	return null;
    }

    public int retainCount()
    {
	return 0;
    }

    public int hash()
    {
	return 0;
    }

    public boolean isEqual(Object anObject)
    {
	return false;
    }

    public Object self()
    {
	return null;
    }

    public Object performSelector(Object aSelector)
    {
	return null;
    }

    public Object performSelector_withObject(Object aSelector, Object anObject)
    {
	return null;
    }

    public Object performSelector_withObject_withObject(Object aSelector, Object anObject, Object anotherObject)
    {
	return null;
    }

    public Object perform(Object aSelector)
    {
	return null;
    }

    public Object perform_withObject(Object aSelector, Object anObject)
    {
	return null;
    }

    public Object perform_withObject_withObject(Object aSelector, Object anObject, Object anotherObject)
    {
	return null;
    }

    public String description()
    {
	return null;
    }



// Protocol OSCoding.

    public void encodeWithCoder(OSCoder aCoder)
    {
    }

    public Object initWithCoder(OSCoder aDecoder)
    {
        return null;
    }

}


