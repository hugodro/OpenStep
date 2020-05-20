/* Obj-C to Java:
* Class: NSImageRep.
* Source File: NSImageRep.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSImageRep extends OSObject implements OSCoding {
	// Instance Variables.
    String _colorSpace;
    OSSize size;
    boolean hasAlpha;
    boolean isOpaque;
    int bitsPerSample;
    int _pixelsWide;
    int _pixelsHigh;

	// Methods.
    static Object imageRepWithContentsOfFile(String filename)
    {
	return null;
    }

    static OSArray imageRepsWithContentsOfFile(String filename)
    {
	return null;
    }

    static Object imageRepWithPasteboard(OSPasteboard pasteboard)
    {
	return null;
    }

    static OSArray imageRepsWithPasteboard(OSPasteboard pasteboard)
    {
	return null;
    }

    static boolean canInitWithData(OSData data)
    {
	return false;
    }

    static boolean canInitWithPasteboard(OSPasteboard pasteboard)
    {
	return false;
    }

    static OSArray imageFileTypes()
    {
	return null;
    }

    static OSArray imagePasteboardTypes()
    {
	return null;
    }

    static OSArray imageUnfilteredFileTypes()
    {
	return null;
    }

    static OSArray imageUnfilteredPasteboardTypes()
    {
	return null;
    }

    void setSize(OSSize aSize)
    {
    }

    OSSize size()
    {
	return null;
    }

    int bitsPerSample()
    {
	return 0;
    }

    String colorSpaceName()
    {
	return null;
    }

    boolean hasAlpha()
    {
	return false;
    }

    boolean isOpaque()
    {
	return false;
    }

    int pixelsHigh()
    {
	return 0;
    }

    int pixelsWide()
    {
	return 0;
    }

    void setAlpha(boolean flag)
    {
    }

    void setBitsPerSample(int anInt)
    {
    }

    void setColorSpaceName(String aString)
    {
    }

    void setOpaque(boolean flag)
    {
    }

    void setPixelsHigh(int anInt)
    {
    }

    void setPixelsWide(int anInt)
    {
    }

    boolean draw()
    {
	return false;
    }

    boolean drawAtPoint(OSPoint aPoint)
    {
	return false;
    }

    boolean drawInRect(OSRect aRect)
    {
	return false;
    }

    static Class imageRepClassForData(OSData data)
    {
	return null;
    }

    static Class imageRepClassForFileType(String type)
    {
	return null;
    }

    static Class imageRepClassForPasteboardType(String type)
    {
	return null;
    }

    static void registerImageRepClass(Class imageRepClass)
    {
    }

    static OSArray registeredImageRepClasses()
    {
	return null;
    }

    static void unregisterImageRepClass(Class imageRepClass)
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


