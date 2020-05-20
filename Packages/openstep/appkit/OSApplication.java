/* Obj-C to Java:
* Class: NSApplication.
* Source File: NSApplication.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.*;

public class OSApplication extends OSResponder implements OSCoding {
	// Instance Variables.
    OSMutableArray window_list;
    Queue event_queue;
    OSEvent current_event;
    Object key_window;
    Object main_window;
    Object _delegate;
    int window_count;
    OSMenu main_menu;
    OSMenuCell windows_menu;
    int current_mod;
    boolean app_is_running;
    boolean app_should_quit;
    boolean app_is_active;
    boolean app_is_hidden;
    OSImage app_icon;

    static OSApplication uniqueInstance;


	// Support for non-openstep concretization.
    InterfaceEngine interfaceEngine;


	// Class Methods.
    public static OSApplication sharedApplication()
    {
	return sharedApplication(0);
    }

    public static OSApplication sharedApplication(int limitFlag)
    {
	if (uniqueInstance == null) {
	    uniqueInstance= new OSApplication(limitFlag);
	}
	return uniqueInstance;
    }


	// Constructor.
    private OSApplication()
    {
	this(0);
    }

    private OSApplication(int limitFlag)
    {
	// The limit flag says what to keep off, for embedded use.

	window_list= new OSMutableArray(16);
	event_queue= new Queue();
	interfaceEngine= InterfaceEngine.getUniqueInstance();
    }

	// Instance methods.
    void finishLaunching()
    {
    }

    void activateIgnoringOtherApps(boolean flag)
    {
    }

    void deactivate()
    {
    }

    boolean isActive()
    {
	return app_is_active;
    }

    void abortModal()
    {
    }

    OSModalSession beginModalSessionForWindow(OSWindow theWindow)
    {
	return null;
    }

    void endModalSession(OSModalSession theSession)
    {
    }

    boolean isRunning()
    {
	return app_is_running;
    }

    void run()
    {
    }

    int runModalForWindow(OSWindow theWindow)
    {
	return 0;
    }

    int runModalSession(OSModalSession theSession)
    {
	return 0;
    }

    void sendEvent(OSEvent theEvent)
    {
    }

    void stop(Object sender)
    {
    }

    void stopModal()
    {
    }

    void stopModalWithCode(int returnCode)
    {
    }

    OSEvent currentEvent()
    {
	return null;
    }

    void discardEventsMatchingMask_beforeEvent(int mask, OSEvent lastEvent)
    {
    }

    OSEvent nextEventMatchingMask_untilDate_inMode_dequeue(int mask, OSDate expiration, String mode, boolean flag)
    {
	return null;
    }

    void postEvent_atStart(OSEvent event, boolean flag)
    {
    }

    boolean sendAction_to_from(Object aSelector, Object aTarget, Object sender)
    {
	return false;
    }

    Object targetForAction(Object aSelector)
    {
	return null;
    }

    boolean tryToPerform_with(Object aSelector, Object anObject)
    {
	return false;
    }

    void setApplicationIconImage(OSImage anImage)
    {
    }

    OSImage applicationIconImage()
    {
	return null;
    }

    void hide(Object sender)
    {
    }

    boolean isHidden()
    {
	return false;
    }

    void unhide(Object sender)
    {
    }

    void unhideWithoutActivation()
    {
    }

    OSWindow keyWindow()
    {
	return null;
    }

    OSWindow mainWindow()
    {
	return null;
    }

    OSWindow makeWindowsPerform_inOrder(Object aSelector, boolean flag)
    {
	return null;
    }

    void miniaturizeAll(Object sender)
    {
    }

    void preventWindowOrdering()
    {
    }

    void setWindowsNeedUpdate(boolean flag)
    {
    }

    void updateWindows()
    {
    }

    OSArray windows()
    {
	return null;
    }

    OSWindow windowWithWindowNumber(int windowNum)
    {
	return null;
    }

    void orderFrontColorPanel(Object sender)
    {
    }

    void orderFrontDataLinkPanel(Object sender)
    {
    }

    void orderFrontHelpPanel(Object sender)
    {
    }

    void runPageLayout(Object sender)
    {
    }

    OSMenu mainMenu()
    {
	return null;
    }

    void setMainMenu(OSMenu aMenu)
    {
    }

    void addWindowsItem_title_filename(Object aWindow, String aString, boolean isFilename)
    {
	window_list.addObject(aWindow);
	interfaceEngine.addWindow(aWindow);
    }

    void arrangeInFront(Object sender)
    {
    }

    void changeWindowsItem_title_filename(Object aWindow, String aString, boolean isFilename)
    {
    }

    void removeWindowsItem(Object aWindow)
    {
    }

    void setWindowsMenu(Object aMenu)
    {
    }

    void updateWindowsItem(Object aWindow)
    {
    }

    OSMenu windowsMenu()
    {
	return null;
    }

    void registerServicesMenuSendTypes_returnTypes(OSArray sendTypes, OSArray returnTypes)
    {
    }

    OSMenu servicesMenu()
    {
	return null;
    }

    void setServicesMenu(OSMenu aMenu)
    {
    }

    Object validRequestorForSendType_returnType(String sendType, String returnType)
    {
	return null;
    }

    OSDPSContext context()
    {
	return null;
    }

    void reportException(OSException anException)
    {
    }

    void terminate(Object sender)
    {
    }

    Object delegate()
    {
	return null;
    }

    void setDelegate(Object anObject)
    {
    }

    boolean application_openFileWithoutUI(Object sender, String filename)
    {
	return false;
    }

    boolean application_openFile(OSApplication app, String filename)
    {
	return false;
    }

    boolean application_openTempFile(OSApplication app, String filename)
    {
	return false;
    }

    void applicationDidBecomeActive(OSNotification aNotification)
    {
    }

    void applicationDidFinishLaunching(OSNotification aNotification)
    {
    }

    void applicationDidHide(OSNotification aNotification)
    {
    }

    void applicationDidResignActive(OSNotification aNotification)
    {
    }

    void applicationDidUnhide(OSNotification aNotification)
    {
    }

    void applicationDidUpdate(OSNotification aNotification)
    {
    }

    boolean applicationOpenUntitledFile(OSApplication app)
    {
	return false;
    }

    boolean applicationShouldTerminate(Object sender)
    {
	return false;
    }

    void applicationWillBecomeActive(OSNotification aNotification)
    {
    }

    void applicationWillFinishLaunching(OSNotification aNotification)
    {
    }

    void applicationWillHide(OSNotification aNotification)
    {
    }

    void applicationWillResignActive(OSNotification aNotification)
    {
    }

    void applicationWillUnhide(OSNotification aNotification)
    {
    }

    void applicationWillUpdate(OSNotification aNotification)
    {
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


}


