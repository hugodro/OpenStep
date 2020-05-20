/*******************************************************
* Class: WinNTInterfEngine.
* Source File: WinNTInterfEngine.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.appkit.*;

public class WinNTInterfEngine extends InterfaceEngine {

    VisualContext createVisualContext()
    {
	return new ContextDPS(this);
    }

	// Does the low-level work to get the context on the screen.
    public void flushVC(VisualContext aContext) {
	if (aContext instanceof ContextDPS) {
	    ContextDPS dps= (ContextDPS)aContext;
	    if (dps.isDirty()) {
		OSMutableArray operBuffer= dps.getBuffer();
		OperatorDPS anOp;

		    // ATTN: This is going to be slow.  An native should scan the loop.
		for (int i= 0, j= buffer.count(); i < j; i++) {
		    anOp= (OperatorDPS)buffer.objectAt(i);
		    execOpDPS(anOp);
		}
	    }
	}
    }


    native protected void linkToConcreteWindow(OSWindow aWindow);
    native protected void unlinkFromConcreteWindow(OSWindow aWindow);
    native protected void execOpDPS(OperatorDPS anOp);

}