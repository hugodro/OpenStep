/* Obj-C to Java:
* Class: NSFileManager.
* Source File: NSFileManager.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:10 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSFileManager extends OSObject {
	// Methods.
    static OSFileManager defaultManager()
    {
	return null;
    }

    boolean changeCurrentDirectoryPath(String path)
    {
	return false;
    }

    boolean createDirectoryAtPath_attributes(String path, OSDictionary attributes)
    {
	return false;
    }

    String currentDirectoryPath()
    {
	return null;
    }

    boolean copyPath_toPath_handler(String source, String destination, Object handler)
    {
	return false;
    }

    boolean movePath_toPath_handler(String source, String destination, Object handler)
    {
	return false;
    }

    boolean linkPath_toPath_handler(String source, String destination, Object handler)
    {
	return false;
    }

    boolean removeFileAtPath_handler(String path, Object handler)
    {
	return false;
    }

    boolean createFileAtPath_contents_attributes(String path, OSData contents, OSDictionary attributes)
    {
	return false;
    }

    OSData contentsAtPath(String path)
    {
	return null;
    }

    boolean contentsEqualAtPath_andPath(String path1, String path2)
    {
	return false;
    }

    boolean fileExistsAtPath(String path)
    {
	return false;
    }

    boolean fileExistsAtPath_isDirectory(String path, boolean isDirectory)
    {
	return false;
    }

    boolean isReadableFileAtPath(String path)
    {
	return false;
    }

    boolean isWritableFileAtPath(String path)
    {
	return false;
    }

    boolean isExecutableFileAtPath(String path)
    {
	return false;
    }

    boolean isDeletableFileAtPath(String path)
    {
	return false;
    }

    OSDictionary fileAttributesAtPath_traverseLink(String path, boolean flag)
    {
	return null;
    }

    OSDictionary fileSystemAttributesAtPath(String path)
    {
	return null;
    }

    boolean changeFileAttributes_atPath(OSDictionary attributes, String path)
    {
	return false;
    }

    OSArray directoryContentsAtPath(String path)
    {
	return null;
    }

    OSDirectoryEnumerator enumeratorAtPath(String path)
    {
	return null;
    }

    OSArray subpathsAtPath(String path)
    {
	return null;
    }

    boolean createSymbolicLinkAtPath_pathContent(String path, String otherPath)
    {
	return false;
    }

    String pathContentOfSymbolicLinkAtPath(String path)
    {
	return null;
    }

    char fileSystemRepresentationWithPath(String path)
    {
	return '

    String stringWithFileSystemRepresentation_length(char string, int len)
    {
	return null;
    }


}


