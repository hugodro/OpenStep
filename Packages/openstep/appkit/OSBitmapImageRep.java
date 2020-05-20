/* Obj-C to Java:
* Class: NSBitmapImageRep.
* Source File: NSBitmapImageRep.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSBitmapImageRep extends OSImageRep implements OSCoding {
	// Instance Variables.
    int bytesPerRow;
    int numColors;
    int bitsPerPixel;
    short compression;
    boolean _isPlanar;
    char imagePlanes;
    OSMutableData imageData;

	// Methods.
    static Object imageRepWithData(OSData tiffData)
    {
	return null;
    }

    static OSArray imageRepsWithData(OSData tiffData)
    {
	return null;
    }

    Object initWithData(OSData tiffData)
    {
	return null;
    }

    Object initWithFocusedViewRect(OSRect rect)
    {
	return null;
    }

    Object initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel(char planes, int width, int height, int bps, int spp, boolean alpha, boolean config, String colorSpaceName, int rowBytes, int pixelBits)
    {
	return null;
    }

    int bitsPerPixel()
    {
	return 0;
    }

    int samplesPerPixel()
    {
	return 0;
    }

    boolean isPlanar()
    {
	return false;
    }

    int numberOfPlanes()
    {
	return 0;
    }

    int bytesPerPlane()
    {
	return 0;
    }

    int bytesPerRow()
    {
	return 0;
    }

    char bitmapData()
    {
	return '

    void getBitmapDataPlanes(char data)
    {
    }

    static OSData TIFFRepresentationOfImageRepsInArray(OSArray anArray)
    {
	return null;
    }

    static OSData TIFFRepresentationOfImageRepsInArray_usingCompression_factor(OSArray anArray, OSTIFFCompression compressionType, float factor)
    {
	return null;
    }

    OSData TIFFRepresentation()
    {
	return null;
    }

    OSData TIFFRepresentationUsingCompression_factor(OSTIFFCompression compressionType, float factor)
    {
	return null;
    }

    static void getTIFFCompressionTypes_count(OSTIFFCompression list, int numTypes)
    {
    }

    static String localizedNameForTIFFCompressionType(OSTIFFCompression compression)
    {
	return null;
    }

    boolean canBeCompressedUsing(OSTIFFCompression compression)
    {
	return false;
    }

    void getCompression_factor(OSTIFFCompression compression, float factor)
    {
    }

    void setCompression_factor(OSTIFFCompression compression, float factor)
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


