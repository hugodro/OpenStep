/* Obj-C to Java:
* Class: NSWindow.
* Source File: NSWindow.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.*;

/* Notes:
  Remplace 'OSBackingStoreType' par 'int'; c'est un enum dans OStep.
  Remplace 'OSWindowDepth' par 'int', c'est un enum dans OStep.
  Remplace 'OSWindowOrderingMode' par 'int', c'est un int dans NStep.
*/

public class OSWindow extends OSResponder implements OSCoding {
    public final int NormalWindowLevel= 0;
    public final int FloatingWindowLevel= 3;
    public final int DockLevel= 5;
    public final int SubMenuLevel= 10;
    public final int MainMenuLevel= 20;


	// Instance Variables.
    OSRect _frame;		// MOD-HD.
    OSSize minimum_size;
    OSSize maximum_size;
    OSView content_view;	// MOD-HD: Object to OSView.
    OSResponder first_responder;	// MOD-HD: Object to OSResponder.
    OSResponder original_responder;	// MOD-HD: Object to OSResponder.
    Object _delegate;		// MOD-HD.
    int window_num;
    OSColor background_color;
    String represented_filename;
    String miniaturized_title;
    OSImage miniaturized_image;
    String window_title;
    OSPoint last_point;
    int backing_type;
    int style_mask;
    int window_level;
    boolean is_one_shot;
    boolean needs_display;
    boolean is_autodisplay;
    boolean optimize_drawing;
    boolean views_need_display;
    int depth_limit;
    boolean dynamic_depth_limit;
    boolean cursor_rects_enabled;
    boolean visible;
    boolean is_key;
    boolean is_main;
    boolean is_edited;
    boolean is_released_when_closed;
    boolean is_miniaturized;
    boolean disable_flush_window;
    boolean menu_exclude;
    boolean hides_on_deactivate;
    boolean accepts_mouse_moved;

	// Support for non-openstep concretization.
    VisualContext dps;


	// Class Methods.
    static OSRect contentRectForFrameRect_styleMask(OSRect aRect, int aStyle)
    {
	return null;
    }

    static OSRect frameRectForContentRect_styleMask(OSRect aRect, int aStyle)
    {
	return null;
    }

    static OSRect minFrameWidthWithTitle_styleMask(String aTitle, int aStyle)
    {
	return null;
    }

    static void removeFrameUsingName(String name)
    {
    }

    static int defaultDepthLimit()
    {
	return 8;		// Note: why 8 bits depth max ?
    }

	// Constructors.
    public OSWindow(OSRect contentRect, int aStyle, int bufferingType, boolean flag)
    {
	this(contentRect, aStyle, bufferingType, flag, null);
    }

    public OSWindow(OSRect contentRect, int aStyle, int bufferingType, boolean flag, OSScreen aScreen)
    {
	OSApplication theApp;
	OSRect screenRect;

	initDefaults();

	theApp= OSApplication.sharedApplication();
	screenRect= OSScreen.mainScreen().frame();

	backing_type = bufferingType;
	style_mask = aStyle;
	_frame= OSWindow.frameRectForContentRect_styleMask(contentRect, aStyle);
	minimum_size= OSSize.zeroSize();
	maximum_size= screenRect.size;
	setNextResponder(theApp);
	setContentView(new OSView(_frame));
	theApp.addWindowsItem_title_filename(this, window_title, false);
    }

	// Instance methods.
    OSWindow initWithContentRect_styleMask_backing_defer(OSRect contentRect, int aStyle, int bufferingType, boolean flag)
    {
	return null;
    }

    OSWindow initWithContentRect_styleMask_backing_defer_screen(OSRect contentRect, int aStyle, int bufferingType, boolean flag, Object aScreen)
    {
	return null;
    }

    OSView contentView()
    {
	return content_view;
    }

    void setContentView(OSView aView)
    {
	if (content_view != null) {
	    content_view.viewWillMoveToWindow(null);
	}
	content_view= aView;
	content_view.viewWillMoveToWindow(this);
	content_view.setNextResponder(this);
    }

    OSColor backgroundColor()
    {
	return background_color;
    }

    String representedFilename()
    {
	return represented_filename;
    }

    void setBackgroundColor(OSColor color)
    {
	background_color = color;
    }

    void setRepresentedFilename(String aString)
    {
	represented_filename = aString;
    }

    void setTitle(String aString)
    {
	window_title = aString;
    }

    void setTitleWithRepresentedFilename(String aString)
    {
	setRepresentedFilename(aString);
	setTitle(aString);
    }

    int styleMask()
    {
	return style_mask;
    }

    String title()
    {
	return window_title;
    }

    int backingType()
    {
	return backing_type;
    }

    OSDictionary deviceDescription()
    {
	return null;
    }

    int gState()
    {
	return 0;
    }

    boolean isOneShot()
    {
	return is_one_shot;
    }

    void setBackingType(int type)
    {
	backing_type = type;
    }

    void setOneShot(boolean flag)
    {
	is_one_shot = flag;
    }

    int windowNumber()
    {
	return window_num;
    }

    void setWindowNumber(int windowNum)
    {
	window_num = windowNum;
    }

    OSImage miniwindowImage()
    {
	return miniaturized_image;
    }

    String miniwindowTitle()
    {
	return miniaturized_title;
    }

    void setMiniwindowImage(OSImage image)
    {
	miniaturized_image = image;
    }

    void setMiniwindowTitle(String title)
    {
	miniaturized_title = title;
    }

    void endEditingFor(Object anObject)
    {
    }

    OSText fieldEditor_forObject(boolean createFlag, Object anObject)
    {
	return null;
    }

    void becomeKeyWindow()
    {
	is_key= true;
    }

    void becomeMainWindow()
    {
	is_main = true;
    }

    boolean canBecomeKeyWindow()
    {
	return true;
    }

    boolean canBecomeMainWindow()
    {
	return true;
    }

    boolean hidesOnDeactivate()
    {
	return hides_on_deactivate;
    }

    boolean isKeyWindow()
    {
	return is_key;
    }

    boolean isMainWindow()
    {
	return is_main;
    }

    boolean isMiniaturized()
    {
	return is_miniaturized;
    }

    boolean isVisible()
    {
	return visible;
    }

    int level()
    {
	return window_level;
    }

    void makeKeyAndOrderFront(Object sender)
    {
	makeKeyWindow();
	orderFront(sender);
    }

    void makeKeyWindow()
    {
	if (!canBecomeKeyWindow()) return;

	OSApplication theApp= OSApplication.sharedApplication();

	theApp.keyWindow().resignKeyWindow();
	becomeKeyWindow();
    }

    void makeMainWindow()
    {
	if (!canBecomeMainWindow()) return;
	OSApplication theApp= OSApplication.sharedApplication();

	theApp.keyWindow().resignMainWindow();
	becomeMainWindow();
    }

    void orderBack(Object sender)
    {
	visible = true;
    }

    void orderFront(Object sender)
    {
	visible = true;
    }

    void orderFrontRegardless()
    {
	visible = true;
    }

    void orderOut(Object sender)
    {
	visible = false;
    }

    void orderWindow_relativeTo(int place, int otherWin)
    {
    }

    void resignKeyWindow()
    {
	is_key= false;
    }

    void resignMainWindow()
    {
	is_main= false;
    }

    void setHidesOnDeactivate(boolean flag)
    {
	hides_on_deactivate = flag;
    }

    void setLevel(int newLevel)
    {
	window_level = newLevel;
    }

    OSPoint cascadeTopLeftFromPoint(OSPoint topLeftPoint)
    {
	return OSPoint.zeroPoint();
    }

    void center()
    {
	float w, h;
	// TODO: Put w and h to the size of the screen.
	// TMP:
	w= 400; h= 200;
	OSRect n= new OSRect(_frame);
	n.origin.x = (w - _frame.size.width) / 2;
	n.origin.y = (h - _frame.size.height) / 2;
	setFrame_display(n, true);
    }

    OSRect constrainFrameRect_toScreen(OSRect frameRect, Object screen)
    {
	return OSRect.zeroRect();
    }

    OSRect frame()
    {
	return _frame;
    }

    OSSize minSize()
    {
	return minimum_size;
    }

    OSSize maxSize()
    {
	return maximum_size;
    }

    void setContentSize(OSSize aSize)
    {
    }

    void setFrame_display(OSRect frameRect, boolean flag)
    {
	_frame= frameRect;
	if (!flag) return;
	display();
    }

    void setFrameOrigin(OSPoint aPoint)
    {
	_frame.origin = aPoint;
    }

    void setFrameTopLeftPoint(OSPoint aPoint)
    {
    }

    void setMinSize(OSSize aSize)
    {
	minimum_size = aSize;
    }

    void setMaxSize(OSSize aSize)
    {
	maximum_size = aSize;
    }

    OSPoint convertBaseToScreen(OSPoint aPoint)
    {
	return OSPoint.zeroPoint();
    }

    OSPoint convertScreenToBase(OSPoint aPoint)
    {
	return OSPoint.zeroPoint();
    }

    void display()
    {
	visible= true;
	first_responder.becomeFirstResponder();
	// TODO: le travail de dessinage.
	if (content_view != null) {
	    content_view.display()
	}
	needs_display= false;
	views_need_display= false;
	flushWindow();
    }

    void disableFlushWindow()
    {
	disable_flush_window= true;
    }

    void displayIfNeeded()
    {
	if (needs_display) display();
    }

    void enableFlushWindow()
    {
	disable_flush_window= false;
    }

    public void flushWindow()
    {
	dps.flush();
    }

    void flushWindowIfNeeded()
    {
	if (disable_flush_window) return;
	flushWindow();
    }

    boolean isAutodisplay()
    {
	return is_autodisplay;
    }

    boolean isFlushWindowDisabled()
    {
	return disable_flush_window;
    }

    void setAutoDisplay(boolean flag)
    {
	is_autodisplay= flag;
    }

    void setViewsNeedDisplay(boolean flag)
    {
	views_need_display = flag;
	if (views_need_display) needs_display= true;
    }

    void update()
    {
	if (is_autodisplay) {
	    displayIfNeeded();
	}
	else {
	    display();
	}
    }

    void useOptimizedDrawing(boolean flag)
    {
	optimize_drawing = flag;
    }

    boolean viewsNeedDisplay()
    {
	return views_need_display;
    }

    boolean canStoreColor()
    {
	return (depth_limit > 1);
    }

    OSScreen deepestScreen()
    {
	return OSScreen.deepestScreen();
    }

    int depthLimit()
    {
	return depth_limit;
    }

    boolean hasDynamicDepthLimit()
    {
	return dynamic_depth_limit;
    }

    OSScreen screen()
    {
	return OSScreen.mainScreen();
    }

    void setDepthLimit(int limit)
    {
	depth_limit = limit;
    }

    void setDynamicDepthLimit(boolean flag)
    {
	dynamic_depth_limit = flag;
    }

    boolean areCursorRectsEnabled()
    {
	return cursor_rects_enabled;
    }

    void disableCursorRects()
    {
	cursor_rects_enabled= false;
    }

    void discardCursorRects()
    {
	// TODO.
    }

    void enableCursorRects()
    {
	cursor_rects_enabled= true;
    }

    void invalidateCursorRectsForView(OSView aView)
    {
	// TODO.
    }

    void resetCursorRects()
    {
	// TODO.
    }

    void close()
    {
	performClose(this);
    }

    void deminiaturize(Object sender)
    {
	if (!is_miniaturized) return;
	is_miniaturized= false;
	visible= true;
    }

    boolean isDocumentEdited()
    {
	return is_edited;
    }

    boolean isReleasedWhenClosed()
    {
	return is_released_when_closed;
    }

    void miniaturize(Object sender)
    {
	performMiniaturize(this);
    }

    void performClose(Object sender)
    {
	visible= false;
    }

    void performMiniaturize(Object sender)
    {
	is_miniaturized = true;
    }

    int resizeFlags()
    {
	return 0;
    }

    void setDocumentEdited(boolean flag)
    {
	is_edited = flag;
    }

    void setReleasedWhenClosed(boolean flag)
    {
	is_released_when_closed = flag;
    }

    boolean acceptsMouseMovedEvents()
    {
	return accepts_mouse_moved;
    }

    OSEvent currentEvent()
    {
	OSApplication theApp= OSApplication.sharedApplication();
	return theApp.currentEvent();
    }

    void discardEventsMatchingMask_beforeEvent(int mask, OSEvent lastEvent)
    {
	OSApplication theApp= OSApplication.sharedApplication();
	theApp.discardEventsMatchingMask_beforeEvent(mask, lastEvent);
    }

    OSResponder firstResponder()
    {
	return first_responder;
    }

    void keyDown(OSEvent theEvent)
    {
	original_responder= first_responder;
	first_responder.keyDown(theEvent);
    }

    boolean makeFirstResponder(OSResponder aResponder)
    {
	if (first_responder == aResponder) return true;
	if (!aResponder.acceptsFirstResponder()) return false;
	if (!first_responder.resignFirstResponder()) return false;
	first_responder= aResponder;
	first_responder.becomeFirstResponder();
	return true;
    }

    OSPoint mouseLocationOutsideOfEventStream()
    {
	return OSPoint.zeroPoint();
    }

    OSEvent nextEventMatchingMask(int mask)
    {
	OSApplication theApp= OSApplication.sharedApplication();
	return theApp.nextEventMatchingMask_untilDate_inMode_dequeue(mask, null, "", true);
    }

    OSEvent nextEventMatchingMask_untilDate_inMode_dequeue(int mask, OSDate expiration, String mode, boolean deqFlag)
    {
	OSApplication theApp= OSApplication.sharedApplication();
	return theApp.nextEventMatchingMask_untilDate_inMode_dequeue(mask, expiration, mode, deqFlag);
    }

    void postEvent_atStart(OSEvent event, boolean flag)
    {
	// TODO.
    }

    void setAcceptsMouseMovedEvents(boolean flag)
    {
	accepts_mouse_moved = flag;
    }

    void sendEvent(OSEvent theEvent)
    {
	// TODO.
    }

    boolean tryToPerform_with(Object anAction, Object anObject)
    {
	return super.tryToPerform_with(anAction, anObject);
    }

    boolean worksWhenModal()
    {
	return false;
    }

    void dragImage_at_offset_event_pasteboard_source_slideBack(OSImage anImage, OSPoint baseLocation, OSSize initialOffset, OSEvent event, OSPasteboard pboard, Object sourceObject, boolean slideFlag)
    {
	// TODO.
    }

    void registerForDraggedTypes(OSArray newTypes)
    {
	// TODO.
    }

    void unregisterDraggedTypes()
    {
	// TODO.
    }

    boolean isExcludedFromWindowsMenu()
    {
	return menu_exclude;
    }

    void setExcludedFromWindowsMenu(boolean flag)
    {
	menu_exclude= flag;
    }

    Object validRequestorForSendType_returnType(String sendType, String returnType)
    {
	return null;
    }

    String frameAutosaveName()
    {
	// TODO.
	return null;
    }

    void saveFrameUsingName(String name)
    {
	// TODO.
    }

    boolean setFrameAutosaveName(String name)
    {
	// TODO.
	return false;
    }

    void setFrameFromString(String string)
    {
	// TODO.
    }

    boolean setFrameUsingName(String name)
    {
	// TODO.
	return false;
    }

    String stringWithSavedFrame()
    {
	return null;
    }

    OSData dataWithEPSInsideRect(OSRect rect)
    {
	return null;
    }

    void fax(Object sender)
    {
	// TODO.
    }

    void print(Object sender)
    {
	// TODO.
    }

    Object delegate()
    {
	return _delegate;
    }

    void setDelegate(Object anObject)
    {
	_delegate= anObject;
    }

    boolean windowShouldClose(Object sender)
    {
	// TODO.
	return true;
    }

    OSSize windowWillResize_toSize(OSWindow sender, OSSize frameSize)
    {
	// TODO.
	return frameSize;
    }

    Object windowWillReturnFieldEditor_toObject(OSWindow sender, Object client)
    {
	// TODO.
	return null;
    }

    void windowDidBecomeKey(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidBecomeMain(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidChangeScreen(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidDeminiaturize(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidExpose(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidMiniaturize(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidMove(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidResignKey(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidResignMain(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidResize(OSNotification aNotification)
    {
	// TODO.
    }

    void windowDidUpdate(OSNotification aNotification)
    {
	// TODO.
    }

    void windowWillClose(OSNotification aNotification)
    {
	// TODO.
    }

    void windowWillMiniaturize(OSNotification aNotification)
    {
	// TODO.
    }

    void windowWillMove(OSNotification aNotification)
    {
	// TODO.
    }

    void encodeWithCoder(Object aCoder)
    {
	// TODO.
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


	// Non-OpenStep methods.
    void initDefaults()
    {
	first_responder= null;
	original_responder= null;
	_delegate= null;
	window_num= 0;
	background_color= OSColor.lightGrayColor();
	represented_filename = "Window";
	miniaturized_title = "Window";
	miniaturized_image = null;
	window_title = "Window";
	last_point = OSPoint.zeroPoint();
	window_level = NormalWindowLevel;

	is_one_shot = false;
	needs_display = false;
	is_autodisplay = true;
	optimize_drawing = true;
	views_need_display = false;
	depth_limit = 8;
	dynamic_depth_limit = true;
	cursor_rects_enabled = false;
	visible = false;
	is_key = false;
	is_main = false;
	is_edited = false;
	is_released_when_closed = false;
	is_miniaturized = false;
	disable_flush_window = false;
	menu_exclude = false;
	hides_on_deactivate = false;
	accepts_mouse_moved = true;
    }

	// Support for non-openstep concretization.
    public void setVisualContext(VisualContext aContext)
    {
	dps= aContext;
    }

    public VisualContext visualContext()
    {
	return dps;
    }

}


