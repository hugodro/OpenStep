/* Obj-C to Java:
* Class: NSInvocation.
* Source File: NSInvocation.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSInvocation extends OSObject {
	// Instance Variables.
    Object selector;
    Object target;
    OSMethodSignature signature;
    Object[] frame;
    Object returnValue;
    boolean argumentsRetained;
    boolean ownsFrame;
    boolean ownsReturnValue;
    boolean isValid;
    Object returnFrame;

	// Methods.
    static OSInvocation invocationWithMethodSignature(OSMethodSignature sig)
    {
	return null;
    }

    boolean argumentsRetained()
    {
	return false;
    }

    void getArgument_atIndex(Object argumentLocation, int index)
    {
    }

    void getReturnValue(Object retLoc)
    {
    }

    OSMethodSignature methodSignature()
    {
	return null;
    }

    void retainArguments()
    {
    }

    Object selector()
    {
	return null;
    }

    void setArgument_atIndex(Object argumentLocation, int index)
    {
    }

    void setReturnValue(Object retLoc)
    {
    }

    void setSelector(Object selector)
    {
    }

    void setTarget(Object target)
    {
    }

    Object target()
    {
	return null;
    }

    void invoke()
    {
    }

    void invokeWithTarget(Object target)
    {
    }

    void invalidate()
    {
    }


}


