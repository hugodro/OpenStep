/*******************************************************
* Class: ContextOGL.
* Source File: ContextOGL.java.
* Module: OpenStep : privateSupport.
* Rev: 30 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.*;


public class ContextOGL extends OSObject {
    D3Engine engine;

    ContextOGL(D3Engine anEngine)
    {
	engine= anEngine;
    }

    public void lockFocus(int viewID)
    {
    }

    public void unlockFocus(int viewID)
    {
    }

				// TMPTMP: test.
	public void drawDemo(int viewID)
	{
	}

}