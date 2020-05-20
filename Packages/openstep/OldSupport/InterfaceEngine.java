/*******************************************************
* Class: InterfaceEngine.
* Source File: InterfaceEngine.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.D3Engine;


public abstract class InterfaceEngine extends Object {
	// Class variables.
    static InterfaceEngine uniqueInstance;

	// Instance variables.
    D3Engine d3Engine;			// The 3D support booster.
    OSMutableArray windows;	// The windows known by the Interface.

	// Class initialization.
    static {
	try {
	    System.loadLibrary( "ostepInterface" );
	} catch ( UnsatisfiedLinkError e) {
	    System.out.println( "InterfaceEngine: can't get the necessary native library.");
	}
    }


	// Class methods.
    public static InterfaceEngine getUniqueInstance()
    {
	if (uniqueInstance == null) {
	    uniqueInstance= createConcreteEngine();
	}
	return uniqueInstance;
    }


	// Constructor.
    InterfaceEngine()
    {
	windows= new OSMutableArray(16);
    }


	// Instance methods.
    public void addWindow(OSWindow aWindow)
    {
    	windows.addObject(aWindow);
	linkToConcreteWindow(aWindow);
	aWindow.setVisualContext(createVisualContext());
    }


    public void deleteWindow(OSWindow aWindow)
    {
	int i;

	if ((i= windows.indexOfObjectIdenticalTo(aWindow)) != -1) {
	    unlinkFromConcreteWindow(aWindow);
	    windows.removeObjectAtIndex(i);
	}
    }

	// This method is the one that creates the sub-class that knows how to
	// deal with OS/GUI perticularities in doing windows.
    native protected static InterfaceEngine createConcreteEngine();

	// The methods that are to be implemented by the concrete subclass.
    abstract public void flushVC(VisualContext aContext);
    abstract protected void linkToConcreteWindow(OSWindow aWindow);
    abstract protected void unlinkFromConcreteWindow(OSWindow aWindow);
    abstract VisualContext createVisualContext();


}
