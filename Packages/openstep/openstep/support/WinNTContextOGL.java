/*******************************************************
* Class: WinNTContextOGL.
* Source File: WinNTContextOGL.java.
* Module: OpenStep : privateSupport.
* Rev: 30 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

public class WinNTContextOGL extends ContextOGL {

    WinNTContextOGL(D3Engine anEngine)
    {
	super(anEngine);
    }

		// In NT, it is necessary to lock on a 3D context before drawing in it.
    public native void lockFocus(int viewID);
    public native void unlockFocus(int viewID);
	public native void drawDemo(int viewID);		// TMPTMP: test.
}