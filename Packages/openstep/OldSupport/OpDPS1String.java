/*******************************************************
* Class: OpDPS1String.
* Source File: OpDPS1String.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.OperatorDPS;


public class OpDPS1String extends OperatorDPS {
    String argument;

    public OpDPS1String(int anOp, String aString)
    {
    	super(anOp);
	argument= aString;
    }
}