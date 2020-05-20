/* Obj-C to Java:
* Class: NSHelpPanel.
* Source File: NSHelpPanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSHelpPanel extends OSPanel implements OSCoding {
	// Methods.
    static OSHelpPanel sharedHelpPanel()
    {
	return null;
    }

    static OSHelpPanel sharedHelpPanelWithDirectory(String helpDirectory)
    {
	return null;
    }

    static void setHelpDirectory(String helpDirectory)
    {
    }

    void addSupplement_inPath(String helpDirectory, String supplementPath)
    {
    }

    String helpDirectory()
    {
	return null;
    }

    String helpFile()
    {
	return null;
    }

    static void attachHelpFile_markerName_to(String filename, String markerName, Object anObject)
    {
    }

    static void detachHelpFrom(Object anObject)
    {
    }

    void showFile_atMarker(String filename, String markerName)
    {
    }

    boolean showHelpAttachedTo(Object anObject)
    {
	return false;
    }

    void print(Object sender)
    {
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


