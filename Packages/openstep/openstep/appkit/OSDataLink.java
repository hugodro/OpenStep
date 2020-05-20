/* Obj-C to Java:
* Class: NSDataLink.
* Source File: NSDataLink.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSDataLink extends OSObject implements OSCoding {
	// Methods.
    Object initLinkedToFile(String filename)
    {
	return null;
    }

    Object initLinkedToSourceSelection_managedBy_supportingTypes(OSSelection selection, OSDataLinkManager linkManager, OSArray newTypes)
    {
	return null;
    }

    Object initWithContentsOfFile(String filename)
    {
	return null;
    }

    Object initWithPasteboard(OSPasteboard pasteboard)
    {
	return null;
    }

    boolean saveLinkIn(String directoryName)
    {
	return false;
    }

    boolean writeToFile(String filename)
    {
	return false;
    }

    void writeToPasteboard(OSPasteboard pasteboard)
    {
    }

    OSDataLinkDisposition disposition()
    {
	return null;
    }

    OSDataLinkNumber linkNumber()
    {
	return null;
    }

    OSDataLinkManager manager()
    {
	return null;
    }

    OSDate lastUpdateTime()
    {
	return null;
    }

    boolean openSource()
    {
	return false;
    }

    String sourceApplicationName()
    {
	return null;
    }

    String sourceFilename()
    {
	return null;
    }

    OSSelection sourceSelection()
    {
	return null;
    }

    OSArray types()
    {
	return null;
    }

    String destinationApplicationName()
    {
	return null;
    }

    String destinationFilename()
    {
	return null;
    }

    OSSelection destinationSelection()
    {
	return null;
    }

    boolean break()
    {
	return false;
    }

    void noteSourceEdited()
    {
    }

    void setUpdateMode(OSDataLinkUpdateMode mode)
    {
    }

    boolean updateDestination()
    {
	return false;
    }

    OSDataLinkUpdateMode updateMode()
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


