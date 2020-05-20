/*******************************************************
* Class: OpDPS1Float.
* Source File: OpDPS1Float.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.OperatorDPS;


public class OpDPS1Float extends OperatorDPS {
    float argument;

    public OpDPS1Float(int anOp, float aFloat)
    {
    	super(anOp);
	argument= aFloat;
    }
}
