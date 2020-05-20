/*******************************************************
* Class: D3Engine.
* Source File: D3Engine.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.*;
import openstep.foundation.*;
import openstep.appkit.*;


public abstract class D3Engine extends OSObject {
	// Class variables.
    static D3Engine uniqueInstance;

	// Instance variables.
    InterfaceEngine iEngine;	// The Interface manager.
    OSMutableArray views;		// The 3DViews known by this engine.


	// Class methods.
    public static D3Engine getUniqueInstance()
    {
	if (uniqueInstance == null) {
	    uniqueInstance= createConcreteEngine();
	    uniqueInstance.iEngine= InterfaceEngine.getUniqueInstance();
	}
	return uniqueInstance;
    }

	// Constructor.
    D3Engine()
    {
	views= new OSMutableArray(16);
    }


    public void add3DViewInWindow(OS3DView aView, OSWindow aWindow)
    {
	views.addObject(aView);	    // Add the view in the engine list.
	aView.set3DContext(create3DContext());
	linkConcrete3DViewToWindow(aView, aWindow);
    }


    public void deleteView(OS3DView aView)
    {

    }

	// This method is the one that creates the sub-class that knows how to
	// deal with OS/GUI perticularities in doing windows.
    native protected static D3Engine createConcreteEngine();
    abstract void linkConcrete3DViewToWindow(OS3DView aView, OSWindow aWindow);
    abstract ContextOGL create3DContext();

}
