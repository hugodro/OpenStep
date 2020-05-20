/* Obj-C to Java:
* Protocol: NSObjCTypeSerializationCallBack.
* Source File: NSSerialization.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public interface OSObjCTypeSerializationCallBackProt {
	// Methods.
    void deserializeObjectAt_ofObjCType_fromData_atCursor(Object object, char type, OSData data, int cursor)
    {
    }

    void serializeObjectAt_ofObjCType_intoData(Object object, char type, OSMutableData data)
    {
    }


}


