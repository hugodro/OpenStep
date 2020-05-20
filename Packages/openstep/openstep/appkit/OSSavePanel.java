/* Obj-C to Java:
* Class: NSSavePanel.
* Source File: NSSavePanel.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:04 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSavePanel extends OSObject implements OSCoding {
	// Instance Variables.
    OSView accessory_view;
    String panel_title;
    String panel_prompt;
    String directory;
    String file_name;
    String required_type;
    boolean file_package;
    Object delegate;
    Object be_save_reserved;

	// Methods.
    static OSSavePanel savePanel()
    {
	return null;
    }

    void setDefaults()
    {
    }

    void setAccessoryView(OSView aView)
    {
    }

    OSView accessoryView()
    {
	return null;
    }

    void setTitle(String title)
    {
    }

    String title()
    {
	return null;
    }

    void setPrompt(String prompt)
    {
    }

    String prompt()
    {
	return null;
    }

    String requiredFileType()
    {
	return null;
    }

    void setDirectory(String path)
    {
    }

    void setRequiredFileType(String type)
    {
    }

    void setTreatsFilePackagesAsDirectories(boolean flag)
    {
    }

    boolean treatsFilePackagesAsDirectories()
    {
	return false;
    }

    int runModalForDirectory_file(String path, String filename)
    {
	return 0;
    }

    int runModal()
    {
	return 0;
    }

    String directory()
    {
	return null;
    }

    String filename()
    {
	return null;
    }

    void ok(Object sender)
    {
    }

    void cancel(Object sender)
    {
    }

    void selectText(Object sender)
    {
    }

    void setDelegate(Object anObject)
    {
    }

    OSComparisonResult panel_compareFilename_with_caseSensitive(Object sender, String filename1, String filename2, boolean caseSensitive)
    {
	return null;
    }

    boolean panel_shouldShowFilename(Object sender, String filename)
    {
	return false;
    }

    boolean panel_isValidFilename(Object sender, String filename)
    {
	return false;
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


