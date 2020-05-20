/* Obj-C to Java:
* Protocol: NSObjCTypeSerializationCallBack.
* Source File: NSSerialization.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:16:05 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public interface OSObjCTypeSerializationCallBack {
	// Methods.
    void deserializeObjectAt_ofObjCType_fromData_atCursor(Object object, char type, OSData data, int cursor);

    void serializeObjectAt_ofObjCType_intoData(Object object, char type, OSMutableData data);


}


