/*******************************************************
* Class: WinNTInterfEngine.
* Source File: WinNTInterfEngine.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.appkit.*;
import openstep.foundation.OSPoint;
import openstep.foundation.OSSize;
import openstep.foundation.OSMutableArray;


public class WinNTInterfEngine extends InterfaceEngine {

    VisualContext createVisualContext()
    {
	return new ContextDPS(this);
    }

    public void addWindow(OSWindow aWindow)
	{
		super.addWindow(aWindow);
		registerWindowVC(aWindow);
	}


	// Does the low-level work to get the context on the screen.
    public void flushVC(VisualContext aContext) {
	if (aContext instanceof ContextDPS) {
	    ContextDPS dps= (ContextDPS)aContext;
	    if (dps.isDirty()) {
			OSMutableArray operBuffer= dps.getBuffer();
			if (operBuffer.count() > 0) {
				execOpDPS(dps);
			}
	    }
	}
    }


    native protected void linkToConcreteWindow(OSWindow aWindow);
    native protected void unlinkFromConcreteWindow(OSWindow aWindow);
	native protected void registerWindowVC(OSWindow aWindow);
    native protected void execOpDPS(ContextDPS aContext);
    native public void eventLoop();
    native public void eventCatch();
    native public void orderFront(OSWindow aWindow);
	native public void orderOut(OSWindow aWindow);
	native public void orderBack(OSWindow aWindow);
	native public void resize(OSWindow aWindow, OSSize aSize);
	native public void move(OSWindow aWindow, OSPoint aPosition);

}