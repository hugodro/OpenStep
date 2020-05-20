/* Obj-C to Java:
* Class: NSPosixFileDescriptor.
* Source File: NSPosixFileDescriptor.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:11 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSPosixFileDescriptor extends OSObject {
	// Instance Variables.
    int fd;
    Object delegate;
    int fileActivity;

	// Methods.
    static Object descriptorWithStandardInput()
    {
	return null;
    }

    static Object descriptorWithStandardOutput()
    {
	return null;
    }

    static Object descriptorWithStandardError()
    {
	return null;
    }

    Object initWithFileDescriptor(int fileDescriptor)
    {
	return null;
    }

    Object initWithPath(String aPath)
    {
	return null;
    }

    Object initWithPath_flags(String aPath, int flags)
    {
	return null;
    }

    Object initWithPath_flags_createMode(String aPath, int flags, int mode)
    {
	return null;
    }

    int fileDescriptor()
    {
	return 0;
    }

    OSData readEntireFile()
    {
	return null;
    }

    OSData readFileRange(OSRange aRange)
    {
	return null;
    }

    OSData readFileLength(long length)
    {
	return null;
    }

    OSData readRestOfFile()
    {
	return null;
    }

    void readBytes_range(void bytes, OSRange range)
    {
    }

    void writeData(OSData aData)
    {
    }

    void writeData_range(OSData aData, OSRange aRange)
    {
    }

    void writeString(String string)
    {
    }

    void writeString_range(String string, OSRange aRange)
    {
    }

    int fileLength()
    {
	return 0;
    }

    int filePosition()
    {
	return 0;
    }

    void seekToEnd()
    {
    }

    void seekToPosition(long aPosition)
    {
    }

    void truncateAtPosition(long aPosition)
    {
    }

    OSData mapFileRange(OSRange range)
    {
	return null;
    }

    void synchronizeFile()
    {
    }

    void monitorFileActivity(OSPosixFileActivities activity)
    {
    }

    void monitorActivity_delegate(OSPosixFileActivities activity, Object delegate)
    {
    }

    void ceaseMonitoringFileActivity()
    {
    }

    OSPosixFileActivities fileActivity()
    {
	return null;
    }

    Object delegate()
    {
	return null;
    }

    void setDelegate(Object delegate)
    {
    }


}


