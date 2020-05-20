/* Obj-C to Java:
* Class: LogFile.
* Source File: LogFile.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class LogFile extends OSObject {
	// Instance Variables.
    _MB_lflags l_flags;
    FILE the_log;

	// Methods.
    Object init()
    {
	return null;
    }

    Object initStdout()
    {
	return null;
    }

    Object initStdoutWithLocking()
    {
	return null;
    }

    Object initFile(char filename)
    {
	return null;
    }

    Object initFileWithLocking(char filename)
    {
	return null;
    }

    Object writeLog(char logEntry)
    {
	return null;
    }

    Object closeLog()
    {
	return null;
    }

    boolean isDateLogging()
    {
	return false;
    }

    Object setDateLogging(boolean flag)
    {
	return null;
    }

    boolean isLocking()
    {
	return false;
    }


}


