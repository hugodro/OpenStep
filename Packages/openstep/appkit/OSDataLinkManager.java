/* Obj-C to Java:
* Class: NSDataLinkManager.
* Source File: NSDataLinkManager.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:02 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSDataLinkManager extends OSObject implements OSCoding {
	// Methods.
    Object initWithDelegate(Object anObject)
    {
	return null;
    }

    Object initWithDelegate_fromFile(Object anObject, String path)
    {
	return null;
    }

    boolean addLink_at(OSDataLink link, OSSelection selection)
    {
	return false;
    }

    boolean addLinkAsMarker_at(OSDataLink link, OSSelection selection)
    {
	return false;
    }

    OSDataLink addLinkPreviouslyAt_fromPasteboard_at(OSSelection oldSelection, OSPasteboard pasteboard, OSSelection selection)
    {
	return null;
    }

    void breakAllLinks()
    {
    }

    void writeLinksToPasteboard(OSPasteboard pasteboard)
    {
    }

    void noteDocumentClosed()
    {
    }

    void noteDocumentEdited()
    {
    }

    void noteDocumentReverted()
    {
    }

    void noteDocumentSaved()
    {
    }

    void noteDocumentSavedAs(String path)
    {
    }

    void noteDocumentSavedTo(String path)
    {
    }

    Object delegate()
    {
	return null;
    }

    boolean delegateVerifiesLinks()
    {
	return false;
    }

    String filename()
    {
	return null;
    }

    boolean interactsWithUser()
    {
	return false;
    }

    boolean isEdited()
    {
	return false;
    }

    void setDelegateVerifiesLinks(boolean flag)
    {
    }

    void setInteractsWithUser(boolean flag)
    {
    }

    boolean areLinkOutlinesVisible()
    {
	return false;
    }

    OSEnumerator destinationLinkEnumerator()
    {
	return null;
    }

    OSDataLink destinationLinkWithSelection(OSSelection destSel)
    {
	return null;
    }

    void setLinkOutlinesVisible(boolean flag)
    {
    }

    OSEnumerator sourceLinkEnumerator()
    {
	return null;
    }

    boolean copyToPasteboard_at_cheapCopyAllowed(OSPasteboard pasteboard, OSSelection selection, boolean flag)
    {
	return false;
    }

    void dataLinkManager_didBreakLink(OSDataLinkManager sender, OSDataLink link)
    {
    }

    boolean dataLinkManager_isUpdateNeededForLink(OSDataLinkManager sender, OSDataLink link)
    {
	return false;
    }

    void dataLinkManager_startTrackingLink(OSDataLinkManager sender, OSDataLink link)
    {
    }

    void dataLinkManager_stopTrackingLink(OSDataLinkManager sender, OSDataLink link)
    {
    }

    void dataLinkManagerCloseDocument(OSDataLinkManager sender)
    {
    }

    void dataLinkManagerDidEditLinks(OSDataLinkManager sender)
    {
    }

    void dataLinkManagerRedrawLinkOutlines(OSDataLinkManager sender)
    {
    }

    boolean dataLinkManagerTracksLinksIndividually(OSDataLinkManager sender)
    {
	return false;
    }

    boolean importFile_at(String filename, OSSelection selection)
    {
	return false;
    }

    boolean pasteFromPasteboard_at(OSPasteboard pasteboard, OSSelection selection)
    {
	return false;
    }

    boolean showSelection(OSSelection selection)
    {
	return false;
    }

    OSWindow windowForSelection(OSSelection selection)
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


