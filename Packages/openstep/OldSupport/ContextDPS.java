/*******************************************************
* Class: ContextDPS.
* Source File: ContextDPS.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
*******************************************************/

package openstep.support;

import openstep.foundation.*;
import openstep.support.VisualContext;
import openstep.support.OperatorDPS;


public class ContextDPS extends VisualContext {
	// Instance variables.
    OSMutableArray buffer;
    int maxBufferCapacity;

	// Constructors.
    public ContextDPS(InterfaceEngine anEngine)
    {
	this(anEngine, 100);
    }


    public ContextDPS(InterfaceEngine anEngine, int aCapacity)
    {
	super(anEngine);
	buffer= new OSMutableArray(64);
	maxBufferCapacity= aCapacity;
    }


    public boolean isDirty()
    {
	return (buffer.count() > 0);
    }

	// Instance methods.
    public void setgray(float gray)
    {
	if (buffer.count() == maxBufferCapacity) {
	    interfaceEngine.flushVC(this);
	}
	buffer.addObject(new OpDPS1Float(OperatorDPS.setgray, gray));
    }

    public void rectfill(float x, float y, float w, float h)
    {
	if (buffer.count() == maxBufferCapacity) {
	    interfaceEngine.flushVC();
	}
	buffer.addObject(new OpDPS4Float(OperatorDPS.rectfill, x, y, w, h));
    }

    public void lineto(float x, float y)
    {
	if (buffer.count() == maxBufferCapacity) {
	    interfaceEngine.flushVC();
	}
	buffer.addObject(new OpDPS2Float(OperatorDPS.lineto, x, y));
    }

    public void moveto(float x, float y)
    {
	if (buffer.count() == maxBufferCapacity) {
	    interfaceEngine.flushVC();
	}
	buffer.addObject(new OpDPS2Float(OperatorDPS.moveto, x, y));
    }

    public void show(String s)
    {
	if (buffer.count() == maxBufferCapacity) {
	    interfaceEngine.flushVC();
	}
	buffer.addObject(new OpDPS1String(OperatorDPS.show, s));
    }


}
