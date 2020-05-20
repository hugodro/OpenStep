/* Obj-C to Java:
* Class: NSPrintInfo.
* Source File: NSPrintInfo.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPrintInfo extends OSObject implements OSCoding {
	// Methods.
    Object initWithDictionary(OSDictionary aDict)
    {
	return null;
    }

    static void setSharedPrintInfo(OSPrintInfo printInfo)
    {
    }

    static OSPrintInfo sharedPrintInfo()
    {
	return null;
    }

    static OSSize sizeForPaperName(String name)
    {
	return null;
    }

    float bottomMargin()
    {
	return 0.0;
    }

    float leftMargin()
    {
	return 0.0;
    }

    OSPrintingOrientation orientation()
    {
	return null;
    }

    String paperName()
    {
	return null;
    }

    OSSize paperSize()
    {
	return null;
    }

    float rightMargin()
    {
	return 0.0;
    }

    void setBottomMargin(float value)
    {
    }

    void setLeftMargin(float value)
    {
    }

    void setOrientation(OSPrintingOrientation mode)
    {
    }

    void setPaperName(String name)
    {
    }

    void setPaperSize(OSSize size)
    {
    }

    void setRightMargin(float value)
    {
    }

    void setTopMargin(float value)
    {
    }

    float topMargin()
    {
	return 0.0;
    }

    OSPrintingPaginationMode horizontalPagination()
    {
	return null;
    }

    void setHorizontalPagination(OSPrintingPaginationMode mode)
    {
    }

    void setVerticalPagination(OSPrintingPaginationMode mode)
    {
    }

    OSPrintingPaginationMode verticalPagination()
    {
	return null;
    }

    boolean isHorizontallyCentered()
    {
	return false;
    }

    boolean isVerticallyCentered()
    {
	return false;
    }

    void setHorizontallyCentered(boolean flag)
    {
    }

    void setVerticallyCentered(boolean flag)
    {
    }

    static OSPrinter defaultPrinter()
    {
	return null;
    }

    static void setDefaultPrinter(OSPrinter printer)
    {
    }

    OSPrinter printer()
    {
	return null;
    }

    void setPrinter(OSPrinter aPrinter)
    {
    }

    String jobDisposition()
    {
	return null;
    }

    void setJobDisposition(String disposition)
    {
    }

    void setUpPrintOperationDefaultValues()
    {
    }

    OSMutableDictionary dictionary()
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


