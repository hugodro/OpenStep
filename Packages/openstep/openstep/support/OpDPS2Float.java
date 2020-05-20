/*******************************************************
* Class: OpDPS2Float.
* Source File: OpDPS2Float.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.OperatorDPS;


public class OpDPS2Float extends OperatorDPS {
    float arg1, arg2;

    public OpDPS2Float(int anOp, float f1, float f2)
    {
    	super(anOp);
	arg1= f1;
	arg2= f2;
    }
}