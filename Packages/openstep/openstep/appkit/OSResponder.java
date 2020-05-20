/* Obj-C to Java:
* Class: NSResponder.
* Source File: NSResponder.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSResponder extends OSObject implements OSCoding {
	// Instance Variables.
    OSResponder next_responder;		// MOD-HD: Changed from 'Object' to 'OSResponder.

	// Methods.
    OSResponder nextResponder()
    {
	return next_responder;
    }

    void setNextResponder(OSResponder aResponder)
    {
	next_responder= aResponder;
    }

    boolean acceptsFirstResponder()
    {
	return false;
    }

    boolean becomeFirstResponder()
    {
	return true;
    }

    boolean resignFirstResponder()
    {
	return true;
    }

    boolean performKeyEquivalent(OSEvent theEvent)
    {
	return false;
    }

    boolean tryToPerform_with(Object anAction, Object anObject)
    {
	// If it responds to the method, it returns yes,
	// else it looks up in the next_responder chain for an object that
	// can respond.  Returns false if no one can.
	return false;
    }

    void flagsChanged(OSEvent theEvent)
    {
	if (next_responder != null) next_responder.flagsChanged(theEvent);
    }

    void helpRequested(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.flagsChanged(theEvent);
	}
	else {
	    // Invoke 'Beep'.
	}
    }

    void keyDown(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.keyDown(theEvent);
	}
    }

    void keyUp(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.keyUp(theEvent);
	}
    }

    void mouseDown(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseDown(theEvent);
	}
    }

    void mouseDragged(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseDragged(theEvent);
	}
    }

    void mouseEntered(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseEntered(theEvent);
	}
    }

    void mouseExited(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseExited(theEvent);
	}
    }

    void mouseMoved(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseMoved(theEvent);
	}
    }

    void mouseUp(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.mouseUp(theEvent);
	}
    }

    void noResponderFor(Object eventSelector)
    {
	// If the event is a key, generates a beep (because no one wants to respond to
	// 	the event).
    }

    void rightMouseDown(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.rightMouseDown(theEvent);
	}
    }

    void rightMouseDragged(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.rightMouseDragged(theEvent);
	}
    }

    void rightMouseUp(OSEvent theEvent)
    {
	if (next_responder != null) {
	    next_responder.rightMouseUp(theEvent);
	}
    }

    Object validRequestorForSendType_returnType(String typeSent, String typeReturned)
    {
	return null;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


