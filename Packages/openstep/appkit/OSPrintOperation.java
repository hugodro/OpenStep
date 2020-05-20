/* Obj-C to Java:
* Class: NSPrintOperation.
* Source File: NSPrintOperation.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPrintOperation extends OSObject {
	// Methods.
    static OSPrintOperation EPSOperationWithView_insideRect_toData(OSView aView, OSRect rect, OSMutableData data)
    {
	return null;
    }

    static OSPrintOperation EPSOperationWithView_insideRect_toData_printInfo(OSView aView, OSRect rect, OSMutableData data, OSPrintInfo aPrintInfo)
    {
	return null;
    }

    static OSPrintOperation EPSOperationWithView_insideRect_toPath_printInfo(OSView aView, OSRect rect, String path, OSPrintInfo aPrintInfo)
    {
	return null;
    }

    static OSPrintOperation printOperationWithView(OSView aView)
    {
	return null;
    }

    static OSPrintOperation printOperationWithView_printInfo(OSView aView, OSPrintInfo aPrintInfo)
    {
	return null;
    }

    Object initEPSOperationWithView_insideRect_toData_printInfo(OSView aView, OSRect rect, OSMutableData data, OSPrintInfo aPrintInfo)
    {
	return null;
    }

    Object initWithView_printInfo(OSView aView, OSPrintInfo aPrintInfo)
    {
	return null;
    }

    static OSPrintOperation currentOperation()
    {
	return null;
    }

    static void setCurrentOperation(OSPrintOperation operation)
    {
    }

    boolean isEPSOperation()
    {
	return false;
    }

    OSPrintPanel printPanel()
    {
	return null;
    }

    boolean showPanels()
    {
	return false;
    }

    void setPrintPanel(OSPrintPanel panel)
    {
    }

    void setShowPanels(boolean flag)
    {
    }

    OSDPSContext createContext()
    {
	return null;
    }

    OSDPSContext context()
    {
	return null;
    }

    void destroyContext()
    {
    }

    int currentPage()
    {
	return 0;
    }

    OSPrintingPageOrder pageOrder()
    {
	return null;
    }

    void setPageOrder(OSPrintingPageOrder order)
    {
    }

    void cleanUpOperation()
    {
    }

    boolean deliverResult()
    {
	return false;
    }

    boolean runOperation()
    {
	return false;
    }

    OSPrintInfo printInfo()
    {
	return null;
    }

    void setPrintInfo(OSPrintInfo aPrintInfo)
    {
    }

    OSView view()
    {
	return null;
    }


}


