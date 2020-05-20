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


public class D3Engine extends OSObject {
	// Class variables.
    static D3Engine uniqueInstance;

	// Instance variables.
    InterfaceEngine iEngine;	// The Interface manager.
    OSMutableArray views;		// The 3DViews known by this engine.


    private D3Engine()
    {
    }

    native D3Engine getUniqueInstance();

    public void add3DViewInWindow(OS3DView aView, OSWindow aWindow)
    {

    }

    public void deleteView(OS3DView aView)
    {

    }

}
