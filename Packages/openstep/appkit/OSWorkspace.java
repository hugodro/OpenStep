/* Obj-C to Java:
* Class: NSWorkspace.
* Source File: NSWorkspace.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSWorkspace extends OSObject {
	// Methods.
    static OSWorkspace sharedWorkspace()
    {
	return null;
    }

    boolean openFile(String fullPath)
    {
	return false;
    }

    boolean openFile_fromImage_at_inView(String fullPath, OSImage anImage, OSPoint point, OSView aView)
    {
	return false;
    }

    boolean openFile_withApplication(String fullPath, String appName)
    {
	return false;
    }

    boolean openFile_withApplication_andDeactivate(String fullPath, String appName, boolean flag)
    {
	return false;
    }

    boolean openTempFile(String fullPath)
    {
	return false;
    }

    boolean performFileOperation_source_destination_files_tag(String operation, String source, String destination, OSArray files, int tag)
    {
	return false;
    }

    boolean selectFile_inFileViewerRootedAtPath(String fullPath, String rootFullpath)
    {
	return false;
    }

    String fullPathForApplication(String appName)
    {
	return null;
    }

    boolean getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(String fullPath, boolean removableFlag, boolean writableFlag, boolean unmountableFlag, String description, String fileSystemType)
    {
	return false;
    }

    boolean getInfoForFile_application_type(String fullPath, String appName, String type)
    {
	return false;
    }

    OSImage iconForFile(String fullPath)
    {
	return null;
    }

    OSImage iconForFiles(OSArray pathArray)
    {
	return null;
    }

    OSImage iconForFileType(String fileType)
    {
	return null;
    }

    boolean fileSystemChanged()
    {
	return false;
    }

    void noteFileSystemChanged()
    {
    }

    void findApplications()
    {
    }

    void hideOtherApplications()
    {
    }

    boolean launchApplication(String appName)
    {
	return false;
    }

    boolean launchApplication_showIcon_autolaunch(String appName, boolean showIcon, boolean autolaunch)
    {
	return false;
    }

    boolean unmountAndEjectDeviceAtPath(String path)
    {
	return false;
    }

    void checkForRemovableMedia()
    {
    }

    OSArray mountNewRemovableMedia()
    {
	return null;
    }

    OSArray mountedRemovableMedia()
    {
	return null;
    }

    OSNotificationCenter notificationCenter()
    {
	return null;
    }

    void noteUserDefaultsChanged()
    {
    }

    boolean userDefaultsChanged()
    {
	return false;
    }

    void slideImage_from_to(OSImage image, OSPoint fromPoint, OSPoint toPoint)
    {
    }

    int extendPowerOffBy(int requested)
    {
	return 0;
    }


}


