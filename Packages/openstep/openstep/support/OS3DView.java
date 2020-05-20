 /*******************************************************
* Class: OS3DView.
* Source File: OS3DView.java.
* Module: OpenStep : privateSupport.
* Rev: 27 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.*;


public class OS3DView extends OSView {

    public ContextOGL ogl;
	public int view_num;

	// Constructor.
    public OS3DView(OSRect frameRect)
    {
        super(frameRect);
    }

    public void set3DContext(ContextOGL aContext)
    {
	ogl= aContext;
    }

	public void lockFocus()
	{
		super.lockFocus();
		ogl.lockFocus(view_num);
	}

	public void unlockFocus()
	{
		ogl.unlockFocus(view_num);
		super.unlockFocus();
	}

    public void viewWillMoveToWindow(OSWindow newWindow)
    {
		super.viewWillMoveToWindow(newWindow);
		if ((newWindow != null) && (ogl == null)) {
			InterfaceEngine.getUniqueInstance().getD3Engine().add3DViewInWindow(this, newWindow);
		}
    }

    public void drawRect(OSRect aRect)
    {
		// Fait un renderSelf du monde.
		// Fait ensuite du code si necessaire.
    }
}