/*******************************************************
* Class: OperatorDPS.
* Source File: OperatorDPS.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;


public class OperatorDPS extends Object {
	// Constants.
    public final static int setgray= 1;
    public final static int rectfill= 2;
    public final static int lineto= 3;
    public final static int moveto= 4;
    public final static int show= 5;

	// Instance variables.
    int operation;

    OperatorDPS(int anOp)
    {
	operation= anOp;
    }
}