/* Obj-C to Java:
* Protocol: NSCoding.
* Source File: NSObject.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:16:05 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public interface OSCoding {
	// Methods.
    void encodeWithCoder(OSCoder aCoder);

    Object initWithCoder(OSCoder aDecoder);

}


