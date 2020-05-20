/* Obj-C to Java:
* Class: NSMatrix.
* Source File: NSMatrix.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:03 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSMatrix extends OSControl implements OSCoding {
	// Instance Variables.
    OSMutableArray rows;
    OSMutableArray col_widths;
    OSMutableArray row_heights;
    int num_cols;
    int num_rows;
    OSCell cell_prototype;
    OSSize inter_cell;
    Class cell_class;
    boolean allows_empty_selection;
    boolean selection_by_rect;
    boolean draws_background;
    boolean draws_cell_background;
    OSMutableArray selected_cells;
    boolean autoscroll;
    boolean scrollable;
    boolean autosize;
    int mode;
    Object double_action;
    Object error_action;

	// Methods.
    static Class cellClass()
    {
	return null;
    }

    static void setCellClass(Class classId)
    {
    }

	// Constructors.
    public OSMatrix(OSRect frameRect)
    {
	super(frameRect);
    }
	

    OSView initWithFrame(OSRect frameRect)
    {
	return null;
    }

    Object initWithFrame_mode_cellClass_numberOfRows_numberOfColumns(OSRect frameRect, int aMode, Class classId, int rowsHigh, int colsWide)
    {
	return null;
    }

    Object initWithFrame_mode_prototype_numberOfRows_numberOfColumns(OSRect frameRect, int aMode, OSCell aCell, int rowsHigh, int colsWide)
    {
	return null;
    }

    int mode()
    {
	return 0;
    }

    void setMode(int aMode)
    {
    }

    boolean allowsEmptySelection()
    {
	return false;
    }

    boolean isSelectionByRect()
    {
	return false;
    }

    void setAllowsEmptySelection(boolean flag)
    {
    }

    void setSelectionByRect(boolean flag)
    {
    }

    Class ourCellClass()
    {
	return null;
    }

    Object prototype()
    {
	return null;
    }

    void ourSetCellClass(Class classId)
    {
    }

    void setPrototype(OSCell aCell)
    {
    }

    void addColumn()
    {
    }

    void addColumnWithCells(OSArray cellArray)
    {
    }

    void addRow()
    {
    }

    void addRowWithCells(OSArray cellArray)
    {
    }

    OSRect cellFrameAtRow_column(int row, int column)
    {
	return null;
    }

    OSSize cellSize()
    {
	return null;
    }

    void getNumberOfRows_columns(int rowCount, int columnCount)
    {
    }

    void insertColumn(int column)
    {
    }

    void insertColumn_withCells(int column, OSArray cellArray)
    {
    }

    void insertRow(int row)
    {
    }

    void insertRow_withCells(int row, OSArray cellArray)
    {
    }

    OSSize intercellSpacing()
    {
	return null;
    }

    OSCell makeCellAtRow_column(int row, int column)
    {
	return null;
    }

    void putCell_atRow_column(OSCell newCell, int row, int column)
    {
    }

    void removeColumn(int column)
    {
    }

    void removeRow(int row)
    {
    }

    void renewRows_columns(int newRows, int newColumns)
    {
    }

    void setCellSize(OSSize aSize)
    {
    }

    void setIntercellSpacing(OSSize aSize)
    {
    }

    void sortUsingFunction_context(Object comparator, Object context)
    {
    }

    void sortUsingSelector(Object comparator)
    {
    }

    boolean getRow_column_forPoint(int row, int column, OSPoint aPoint)
    {
	return false;
    }

    boolean getRow_column_ofCell(int row, int column, OSCell aCell)
    {
	return false;
    }

    void setState_atRow_column(int value, int row, int column)
    {
    }

    void deselectAllCells()
    {
    }

    void deselectSelectedCell()
    {
    }

    void selectAll(Object sender)
    {
    }

    void selectCellAtRow_column(int row, int column)
    {
    }

    boolean selectCellWithTag(int anInt)
    {
	return false;
    }

    Object selectedCell()
    {
	return null;
    }

    OSArray selectedCells()
    {
	return null;
    }

    int selectedColumn()
    {
	return 0;
    }

    int selectedRow()
    {
	return 0;
    }

    void setSelectionFrom_to_anchor_highlight(int startPos, int endPos, int anchorPos, boolean flag)
    {
    }

    Object cellAtRow_column(int row, int column)
    {
	return null;
    }

    Object cellWithTag(int anInt)
    {
	return null;
    }

    OSArray cells()
    {
	return null;
    }

    OSColor backgroundColor()
    {
	return null;
    }

    OSColor cellBackgroundColor()
    {
	return null;
    }

    boolean drawsBackground()
    {
	return false;
    }

    boolean drawsCellBackground()
    {
	return false;
    }

    void setBackgroundColor(OSColor aColor)
    {
    }

    void setCellBackgroundColor(OSColor aColor)
    {
    }

    void setDrawsBackground(boolean flag)
    {
    }

    void setDrawsCellBackground(boolean flag)
    {
    }

    void selectText(Object sender)
    {
    }

    Object selectTextAtRow_column(int row, int column)
    {
	return null;
    }

    void textDidBeginEditing(OSNotification notification)
    {
    }

    void textDidChange(OSNotification notification)
    {
    }

    void textDidEndEditing(OSNotification notification)
    {
    }

    boolean textShouldBeginEditing(OSText textObject)
    {
	return false;
    }

    boolean textShouldEndEditing(OSText textObject)
    {
	return false;
    }

    Object nextText()
    {
	return null;
    }

    Object previousText()
    {
	return null;
    }

    void setNextText(Object anObject)
    {
    }

    void setPreviousText(Object anObject)
    {
    }

    void setDelegate(Object anObject)
    {
    }

    Object delegate()
    {
	return null;
    }

    boolean autosizesCells()
    {
	return false;
    }

    void setAutosizesCells(boolean flag)
    {
    }

    void setValidateSize(boolean flag)
    {
    }

    void sizeToCells()
    {
    }

    boolean isAutoscroll()
    {
	return false;
    }

    void scrollCellToVisibleAtRow_column(int row, int column)
    {
    }

    void setAutoscroll(boolean flag)
    {
    }

    void setScrollable(boolean flag)
    {
    }

    void drawCellAtRow_column(int row, int column)
    {
    }

    void highlightCell_atRow_column(boolean flag, int row, int column)
    {
    }

    Object doubleAction()
    {
	return null;
    }

    void setDoubleAction(Object aSelector)
    {
    }

    Object errorAction()
    {
	return null;
    }

    boolean sendAction()
    {
	return false;
    }

    void sendAction_to_forAllCells(Object aSelector, Object anObject, boolean flag)
    {
    }

    void sendDoubleAction()
    {
    }

    void setErrorAction(Object aSelector)
    {
    }

    boolean acceptsFirstMouse(OSEvent theEvent)
    {
	return false;
    }

    void mouseDown(OSEvent theEvent)
    {
    }

    int mouseDownFlags()
    {
	return 0;
    }

    boolean performKeyEquivalent(OSEvent theEvent)
    {
	return false;
    }

    void resetCursorRects()
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


