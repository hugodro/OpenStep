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

	public  D3Engine getD3Engine()
	{
		if (d3Engine == null) {
			d3Engine= D3Engine.getUniqueInstance();
		}
		return d3Engine;
	}


	// This method is the one that creates the sub-class that knows how to
	// deal with OS/GUI perticularities in doing windows.
    native protected static InterfaceEngine createConcreteEngine();

	// The methods that are to be implemented by the concrete subclass.
		// flushVC gets the visual context out to the "concrete world".
    abstract public void flushVC(VisualContext aContext);

		// linkToConcreteWindow create a "real" window for an OpenStep window.
    abstract protected void linkToConcreteWindow(OSWindow aWindow);

		// unlinkFromConcreteWindow destroys a "real" window associated with an OpenStep window.
    abstract protected void unlinkFromConcreteWindow(OSWindow aWindow);

		// createVisualContext returns the sub-class of VisualContext that is useful for the specific
		// kind of InterfaceEngine in use.
    abstract VisualContext createVisualContext();

		// eventLoop starts a event-management loops that ends when the app must quit.
    public abstract void eventLoop();

		// eventCatch does a one-shot event management operation.
	public abstract void eventCatch();

		// orderFront brings a window to the screen, and puts in on top (z-order) of the screen.
    public abstract void orderFront(OSWindow aWindow);

		// orderOut takes a window out of the screen.
	public abstract void orderOut(OSWindow aWindow);

		// orderBack puts a window on the bottom (z-order) of the screen.
	public abstract void orderBack(OSWindow aWindow);

		// resize changes the size of the frame of a window.
	public abstract void resize(OSWindow aWindow, OSSize aSize);

		// move changes the position of the frame of a window.
	public abstract void move(OSWindow aWindow, OSPoint aPosition);
}
