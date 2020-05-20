/*******************************************************
* Class: OpDPS4Float.
* Source File: OpDPS4Float.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.support.OperatorDPS;


public class OpDPS4Float extends OperatorDPS {
    float arg1, arg2, arg3, arg4;

    public OpDPS4Float(int anOp, float f1, float f2, float f3, float f4)
    {
    	super(anOp);
	arg1= f1;
	arg2= f2;
	arg3= f3;
	arg4= f4;
    }
}