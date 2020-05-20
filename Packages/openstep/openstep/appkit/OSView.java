/* Obj-C to Java:
* Class: NSView.
* Source File: NSView.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;
import openstep.support.*;


public class OSView extends OSResponder implements OSCoding {
	// Instance Variables.
    OSRect _frame;		// MOD-HD.
    OSRect _bounds;		// MOD-HD.
    float frame_rotation;
    OSView super_view;
    public OSMutableArray sub_views;
    public OSWindow _window;		// MOD-HD.
    OSMutableArray tracking_rects;
    boolean is_flipped;
    boolean is_rotated_from_base;
    boolean is_rotated_or_scaled_from_base;
    boolean opaque;
    boolean needs_display;
    boolean disable_autodisplay;
    boolean post_frame_changes;
    boolean autoresize_subviews;

    public VisualContext dps;


	// Constructors.
    public OSView(OSRect frameRect)
    {
	_frame= frameRect;
	_bounds= new OSRect();
	_bounds.origin= OSPoint.zeroPoint();
	_bounds.size= _frame.size;

	sub_views= new OSMutableArray();
	tracking_rects= new OSMutableArray();

	super_view = null;
	_window = null;
	is_flipped = false;
	is_rotated_from_base = false;
	is_rotated_or_scaled_from_base = false;
	opaque = false;
	disable_autodisplay = false;
	needs_display = true;
	post_frame_changes = false;
	autoresize_subviews = true;
    }

	// Instance methods.
    OSView initWithFrame(OSRect frameRect)
    {
	return null;
    }

    public void addSubview(OSView aView)
    {
	sub_views.addObject(aView);
	aView.setSuperview(this);
	aView.setNextResponder(this);
	aView.viewWillMoveToWindow(_window);
    }

    void addSubview_positioned_relativeTo(OSView aView, int place, OSView otherView)
    {
    }

    OSView ancestorSharedWithView(OSView aView)
    {
	return null;
    }

    boolean isDescendantOf(OSView aView)
    {
	if (aView == this) return true;
	else if (super_view == null) return false;
	else if (super_view == aView) return true;
	else return super_view.isDescendantOf(aView);
    }

    OSView opaqueAncestor()
    {
	return null;
    }

    void removeFromSuperview()
    {
	OSMutableArray someViews;
	int i, j;

	if (super_view == null) return;

	someViews= super_view.subviews();
	j= someViews.count();
	for (i= 0; i < j; i++) {
	    if (someViews.objectAtIndex(i) == this) {
		someViews.removeObjectAtIndex(i);
	    }
	}
    }

    void replaceSubview_with(OSView oldView, OSView newView)
    {
	OSView aView;
	int i, j;

	j= sub_views.count();
	for (i= 0; i < j; i++) {
	    aView= (OSView)sub_views.objectAtIndex(i);
	    if (aView == oldView) {
		sub_views.replaceObjectAtIndex_withObject(i, newView);
	    }
	    else {
		aView.replaceSubview_with(oldView, newView);
	    }
	}
    }

    void sortSubviewsUsingFunction_context(Object compare, Object context)
    {
    }

    OSMutableArray subviews()
    {
	return sub_views;
    }

    OSView superview()
    {
	return super_view;
    }

    void setSuperview(OSView superview)
    {
	super_view= superview;
    }

    OSWindow window()
    {
	return _window;
    }

    public void viewWillMoveToWindow(OSWindow newWindow)
    {
		_window= newWindow;
		if (_window != null) {
			dps= _window.visualContext();
			for (int i= 0, j= sub_views.count(); i < j; i++) {
				((OSView)sub_views.objectAtIndex(i)).viewWillMoveToWindow(newWindow);
			}
		}
    }

    float frameRotation()
    {
	return 0.0f;
    }

    OSRect frame()
    {
	return _frame;
    }

    void rotateByAngle(float angle)
    {
    }

    void setFrame(OSRect frameRect)
    {
	OSSize oldSize= _bounds.size;

	_frame= frameRect;
	_bounds.size= frameRect.size;
	resizeSubviewsWithOldSize(oldSize);
    }

    void setFrameOrigin(OSPoint newOrigin)
    {
	_frame.origin= newOrigin;
    }

    void setFrameRotation(float angle)
    {
    }

    void setFrameSize(OSSize newSize)
    {
	OSSize oldSize= _bounds.size;

	_frame.size= newSize;
	_bounds.size= newSize;
	resizeSubviewsWithOldSize(oldSize);
    }

    float boundsRotation()
    {
	return 0.0f;
    }

    OSRect bounds()
    {
	return _bounds;
    }

    boolean isFlipped()
    {
	return is_flipped;
    }

    boolean isRotatedFromBase()
    {
	return is_rotated_from_base;
    }

    boolean isRotatedOrScaledFromBase()
    {
	return is_rotated_or_scaled_from_base;
    }

    void scaleUnitSquareToSize(OSSize newSize)
    {
    }

    void setBounds(OSRect aRect)
    {
	_bounds = aRect;
    }

    void setBoundsOrigin(OSPoint newOrigin)
    {
	_bounds.origin= newOrigin;
    }

    void setBoundsRotation(float angle)
    {
    }

    void setBoundsSize(OSSize newSize)
    {
	_bounds.size= newSize;
    }

    void translateOriginToPoint(OSPoint point)
    {
    }

    OSRect centerScanRect(OSRect aRect)
    {
	return OSRect.zeroRect();
    }

    OSPoint convertPoint_fromView(OSPoint aPoint, OSView aView)
    {
	OSPoint p1, p2;

	if (aView == null) {
	    return convertPoint_fromView(aPoint, _window.contentView());
	}
	p1= aView.convertPointToWindow(aPoint);
	p2= convertPointToWindow(_bounds.origin);

	p1.x-= p2.x;
	p1.y-= p2.y;

	return p1;
    }


    OSPoint convertPoint_toView(OSPoint aPoint, OSView aView)
    {
	OSPoint p1, p2;
	OSRect aRect;

	if (aView == null) {
	    return convertPointToWindow(aPoint);
	}
	p1= convertPointToWindow(aPoint);
	aRect= aView.bounds();
	p2= aView.convertPointToWindow(aRect.origin);

	p1.x-= p2.x;
	p1.y-= p2.y;

	return p1;
    }

    OSRect convertRect_fromView(OSRect aRect, OSView aView)
    {
	OSRect tmpRect;
	tmpRect= aRect;
	tmpRect.origin= convertPoint_fromView(tmpRect.origin, aView);
	tmpRect.size= convertSize_fromView(tmpRect.size, aView);
	return tmpRect;
    }

    OSRect convertRect_toView(OSRect aRect, OSView aView)
    {
	OSRect tmpRect;
	tmpRect= aRect;
	tmpRect.origin= convertPoint_toView(tmpRect.origin, aView);
	tmpRect.size= convertSize_toView(tmpRect.size, aView);
	return tmpRect;
    }

    OSSize convertSize_fromView(OSSize aSize, OSView aView)
    {
	return aSize;
    }

    OSSize convertSize_toView(OSSize aSize, OSView aView)
    {
	return aSize;
    }

    boolean postsFrameChangedNotifications()
    {
	return post_frame_changes;
    }

    void setPostsFrameChangedNotifications(boolean flag)
    {
	post_frame_changes = flag;
    }

    void resizeSubviewsWithOldSize(OSSize oldSize)
    {
	OSEnumerator enumerator;
	OSView aView;

	enumerator= sub_views.objectEnumerator();
	aView= (OSView)enumerator.nextObject();
	while (aView != null) {
	    OSRect tmpBounds= aView.bounds();
	    OSSize tmpSize= tmpBounds.size;
	    aView.resizeWithOldSuperviewSize(oldSize);
	    aView.resizeSubviewsWithOldSize(tmpSize);
	    aView= (OSView)enumerator.nextObject();
	}
    }

    void setAutoresizesSubviews(boolean flag)
    {
	  autoresize_subviews = flag;
    }

    boolean autoresizesSubviews()
    {
	return autoresize_subviews;
    }

    void setAutoresizingMask(int mask)
    {
    }

    int autoresizingMask()
    {
	return 0;
    }

    void resizeWithOldSuperviewSize(OSSize oldSize)
    {
    }

    void allocateGState()
    {
    }

    void releaseGState()
    {
    }

    int gState()
    {
	return 0;
    }

    void renewGState()
    {
    }

    void setUpGState()
    {
    }

    static OSView focusView()
    {
	return null;
    }

    public void lockFocus()
    {
	// TODO.
    }

    public void unlockFocus()
    {
	// TODO.
    }

    boolean canDraw()
    {
	return true;
    }

    void display()
    {
	lockFocus();
	drawRect(_bounds);
	unlockFocus();
	for (int i= 0, j= sub_views.count(); i < j; i++) {
	    ((OSView)sub_views.objectAtIndex(i)).display();
	}
    }

    void displayIfNeeded()
    {
	if (needs_display && opaque) {
	    display();
	}
    }

    void displayIfNeededIgnoringOpacity()
    {
	if (needs_display) {
	    display();
	}
    }

    void displayRect(OSRect aRect)
    {
    }

    void displayRectIgnoringOpacity(OSRect aRect)
    {
    }

    void drawRect(OSRect rect)
    {
    }

    OSRect visibleRect()
    {
	return _bounds;
    }

    boolean isOpaque()
    {
	return opaque;
    }

    boolean needsDisplay()
    {
	return needs_display;
    }

    void setNeedsDisplay(boolean flag)
    {
	needs_display= flag;
	if (needs_display) _window.setViewsNeedDisplay(true);
    }

    void setNeedsDisplayInRect(OSRect invalidRect)
    {
	needs_display= true;
    }

    boolean shouldDrawColor()
    {
	return true;
    }

    OSRect adjustScroll(OSRect newVisible)
    {
	return OSRect.zeroRect();
    }

    boolean autoscroll(OSEvent theEvent)
    {
	return false;
    }

    void reflectScrolledClipView(OSClipView aClipView)
    {
    }

    void scrollClipView_toPoint(OSClipView aClipView, OSPoint aPoint)
    {
    }

    void scrollPoint(OSPoint aPoint)
    {
    }

    void scrollRect_by(OSRect aRect, OSSize delta)
    {
    }

    boolean scrollRectToVisible(OSRect aRect)
    {
	return false;
    }

    void addCursorRect_cursor(OSRect aRect, OSCursor anObject)
    {
    }

    void discardCursorRects()
    {
    }

    void removeCursorRect_cursor(OSRect aRect, OSCursor anObject)
    {
    }

    void resetCursorRects()
    {
    }

    int tag()
    {
	return -1;
    }

    OSView viewWithTag(int aTag)
    {
	for (int i= 0, j= sub_views.count(); i < j; i++) {
	    if (((OSView)sub_views.objectAtIndex(i)).tag() == aTag) {
		return (OSView)sub_views.objectAtIndex(i);
	    }
	}
	return null;
    }

    boolean acceptsFirstMouse(OSEvent theEvent)
    {
	return false;
    }

    OSView hitTest(OSPoint aPoint)
    {
	OSPoint p1;
	OSView v1, v2;

	v1= null;
	for (int i= 0, j= sub_views.count(); i < j; i++) {
	    v2= (OSView)sub_views.objectAtIndex(i);
	    p1= convertPoint_toView(aPoint, v2);
	    v1= v2.hitTest(p1);
	    if (v1 != null) break;
	}
	if (v1 == null) v1= this;
	return v1;
    }

    boolean mouse_inRect(OSPoint aPoint, OSRect aRect)
    {
	if (aPoint.x < aRect.origin.x)
	    return false;
	else if (aPoint.y < aRect.origin.y)
	    return false;
	else if (aPoint.x > (aRect.origin.x + aRect.size.width))
	    return false;
	else if (aPoint.y > (aRect.origin.y + aRect.size.height))
	    return false;

	return true;
    }

    boolean performKeyEquivalent(OSEvent theEvent)
    {
	return false;
    }

    void removeTrackingRect(int tag)
    {
	TrackingRectangle aTracker;

	for (int i= 0, j= tracking_rects.count(); i < j; i++) {
	    aTracker= (TrackingRectangle)tracking_rects.objectAtIndex(i);
	    if (aTracker.tag() == tag) {
		tracking_rects.removeObjectAtIndex(i);
		return;
	    }
	}
    }

    boolean shouldDelayWindowOrderingForEvent(OSEvent anEvent)
    {
	return false;
    }

    int addTrackingRect_owner_userData_assumeInside(OSRect aRect, Object anObject, Object data, boolean flag)
    {
	int trackerTag;
	TrackingRectangle aTracker;

	trackerTag= 0;
	for (int i= 0, j= tracking_rects.count(); i < j; i++) {
	    aTracker= (TrackingRectangle)tracking_rects.objectAtIndex(i);
	    if (aTracker.tag() > trackerTag) {
		trackerTag= aTracker.tag();
	    }
	}
	trackerTag++;

	aTracker= new TrackingRectangle(aRect, trackerTag, anObject, data, flag);
	tracking_rects.addObject(aTracker);
	return trackerTag;
    }

    OSArray trackingRectangles()
    {
	return tracking_rects;
    }

    boolean dragFile_fromRect_slideBack_event(String filename, OSRect rect, boolean slideFlag, OSEvent event)
    {
	return false;
    }

    void dragImage_at_offset_event_pasteboard_source_slideBack(OSImage anImage, OSPoint viewLocation, OSSize initialOffset, OSEvent event, OSPasteboard pboard, Object sourceObject, boolean slideFlag)
    {
    }

    void registerForDraggedTypes(OSArray newTypes)
    {
    }

    void unregisterDraggedTypes()
    {
    }

    OSData dataWithEPSInsideRect(OSRect aRect)
    {
	return null;
    }

    void fax(Object sender)
    {
    }

    void print(Object sender)
    {
    }

    void writeEPSInsideRect_toPasteboard(OSRect rect, OSPasteboard pasteboard)
    {
    }

    void adjustPageHeightNew_top_bottom_limit(float newBottom, float oldTop, float oldBottom, float bottomLimit)
    {
    }

    void adjustPageWidthNew_left_right_limit(float newRight, float oldLeft, float oldRight, float rightLimit)
    {
    }

    float heightAdjustLimit()
    {
	return 0.0f;
    }

    boolean knowsPagesFirst_last(int firstPageNum, int lastPageNum)
    {
	return false;
    }

    OSPoint locationOfPrintRect(OSRect aRect)
    {
	return OSPoint.zeroPoint();
    }

    OSRect rectForPage(int page)
    {
	return OSRect.zeroRect();
    }

    float widthAdjustLimit()
    {
	return 0.0f;
    }

    void addToPageSetup()
    {
    }

    void beginPage_label_bBox_fonts(int ordinalNum, String aString, OSRect pageRect, String fontNames)
    {
    }

    void beginPageSetupRect_placement(OSRect aRect, OSPoint location)
    {
    }

    void beginPrologueBBox_creationDate_createdBy_fonts_forWhom_pages_title(OSRect boundingBox, String dateCreated, String anApplication, String fontNames, String user, int numPages, String aTitle)
    {
    }

    void beginSetup()
    {
    }

    void beginTrailer()
    {
    }

    void drawPageBorderWithSize(OSSize borderSize)
    {
    }

    void drawSheetBorderWithSize(OSSize borderSize)
    {
    }

    void endHeaderComments()
    {
    }

    void endPrologue()
    {
    }

    void endSetup()
    {
    }

    void endPageSetup()
    {
    }

    void endPage()
    {
    }

    void endTrailer()
    {
    }

    void encodeWithCoder(Object aCoder)
    {
    }

    Object initWithCoder(Object aDecoder)
    {
	return null;
    }


// Utility fonctions.
    OSPoint convertPointToWindow(OSPoint aPoint)
    {
        return OSPoint.zeroPoint();
    }
}


