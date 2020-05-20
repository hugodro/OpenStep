/*******************************************************
* Class: WinNTD3Engine.
* Source File: WinNTD3Engine.java.
* Module: OpenStep : privateSupport.
* Rev: 30 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.*;
import openstep.foundation.*;
import openstep.appkit.*;


public class WinNTD3Engine extends D3Engine {

    native void linkConcrete3DViewToWindow(OS3DView aView, OSWindow aWindow);

    ContextOGL create3DContext()
    {
		return new WinNTContextOGL(this);
    }
}
