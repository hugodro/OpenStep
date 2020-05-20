/* Obj-C to Java:
* Class: NSImage.
* Source File: NSImage.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSImage extends OSObject implements OSCoding {
	// Instance Variables.
    String name;
    OSSize _size;
    int _flags;
    OSMutableArray _reps;
    OSMutableArray _repList;
    OSColor _color;
    boolean _syncLoad;
    OSView _lockedView;
    Object delegate;

	// Methods.
    Object initByReferencingFile(String filename)
    {
	return null;
    }

    Object initWithContentsOfFile(String filename)
    {
	return null;
    }

    Object initWithData(OSData data)
    {
	return null;
    }

    Object initWithPasteboard(OSPasteboard pasteboard)
    {
	return null;
    }

    Object initWithSize(OSSize aSize)
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

    static Object imageNamed(String name)
    {
	return null;
    }

    boolean setName(String name)
    {
	return false;
    }

    String name()
    {
	return null;
    }

    void addRepresentation(OSImageRep imageRep)
    {
    }

    void addRepresentations(OSArray imageRepArray)
    {
    }

    void lockFocus()
    {
    }

    void lockFocusOnRepresentation(OSImageRep imageRep)
    {
    }

    void unlockFocus()
    {
    }

    void compositeToPoint_operation(OSPoint aPoint, int op)
    {
    }

    void compositeToPoint_fromRect_operation(OSPoint aPoint, OSRect aRect, int op)
    {
    }

    void dissolveToPoint_fraction(OSPoint aPoint, float aFloat)
    {
    }

    void dissolveToPoint_fromRect_fraction(OSPoint aPoint, OSRect aRect, float aFloat)
    {
    }

    void setPrefersColorMatch(boolean flag)
    {
    }

    boolean prefersColorMatch()
    {
	return false;
    }

    void setUsesEPSOnResolutionMismatch(boolean flag)
    {
    }

    boolean usesEPSOnResolutionMismatch()
    {
	return false;
    }

    void setMatchesOnMultipleResolution(boolean flag)
    {
    }

    boolean matchesOnMultipleResolution()
    {
	return false;
    }

    OSImageRep bestRepresentationForDevice(OSDictionary deviceDescription)
    {
	return null;
    }

    OSArray representations()
    {
	return null;
    }

    void removeRepresentation(OSImageRep imageRep)
    {
    }

    void setCachedSeparately(boolean flag)
    {
    }

    boolean isCachedSeparately()
    {
	return false;
    }

    void setDataRetained(boolean flag)
    {
    }

    boolean isDataRetained()
    {
	return false;
    }

    void setCacheDepthMatchesImageDepth(boolean flag)
    {
    }

    boolean cacheDepthMatchesImageDepth()
    {
	return false;
    }

    boolean isValid()
    {
	return false;
    }

    void setScalesWhenResized(boolean flag)
    {
    }

    boolean scalesWhenResized()
    {
	return false;
    }

    void setBackgroundColor(OSColor aColor)
    {
    }

    OSColor backgroundColor()
    {
	return null;
    }

    boolean drawRepresentation_inRect(OSImageRep imageRep, OSRect aRect)
    {
	return false;
    }

    void recache()
    {
    }

    void setDelegate(Object anObject)
    {
    }

    Object delegate()
    {
	return null;
    }

    OSData TIFFRepresentation()
    {
	return null;
    }

    OSData TIFFRepresentationUsingCompression_factor(int comp, float aFloat)
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

    OSImage imageDidNotDraw_inRect(Object sender, OSRect aRect)
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


