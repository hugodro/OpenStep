/* Obj-C to Java:
* Class: NSBrowser.
* Source File: NSBrowser.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:00 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSBrowser extends OSControl implements OSCoding {
	// Methods.
    Object delegate()
    {
	return null;
    }

    void setDelegate(Object anObject)
    {
    }

    Method doubleAction()
    {
	return null;
    }

    boolean sendAction()
    {
	return false;
    }

    void setDoubleAction(Method aSelector)
    {
    }

    static Class cellClass()
    {
	return null;
    }

    Object cellPrototype()
    {
	return null;
    }

    Class matrixClass()
    {
	return null;
    }

    void setCellClass(Class classId)
    {
    }

    void setCellPrototype(OSCell aCell)
    {
    }

    void setMatrixClass(Class classId)
    {
    }

    boolean reusesColumns()
    {
	return false;
    }

    void setReusesColumns(boolean flag)
    {
    }

    void setTakesTitleFromPreviousColumn(boolean flag)
    {
    }

    boolean takesTitleFromPreviousColumn()
    {
	return false;
    }

    boolean allowsBranchSelection()
    {
	return false;
    }

    boolean allowsEmptySelection()
    {
	return false;
    }

    boolean allowsMultipleSelection()
    {
	return false;
    }

    void setAllowsBranchSelection(boolean flag)
    {
    }

    void setAllowsEmptySelection(boolean flag)
    {
    }

    void setAllowsMultipleSelection(boolean flag)
    {
    }

    boolean acceptsArrowKeys()
    {
	return false;
    }

    boolean sendsActionOnArrowKeys()
    {
	return false;
    }

    void setAcceptsArrowKeys(boolean flag)
    {
    }

    void setSendsActionOnArrowKeys(boolean flag)
    {
    }

    void setHasHorizontalScroller(boolean flag)
    {
    }

    boolean hasHorizontalScroller()
    {
	return false;
    }

    int maxVisibleColumns()
    {
	return 0;
    }

    int minColumnWidth()
    {
	return 0;
    }

    boolean separatesColumns()
    {
	return false;
    }

    void setMaxVisibleColumns(int columnCount)
    {
    }

    void setMinColumnWidth(int columnWidth)
    {
    }

    void setSeparatesColumns(boolean flag)
    {
    }

    void addColumn()
    {
    }

    int columnOfMatrix(OSMatrix matrix)
    {
	return 0;
    }

    void displayAllColumns()
    {
    }

    void displayColumn(int column)
    {
    }

    int firstVisibleColumn()
    {
	return 0;
    }

    boolean isLoaded()
    {
	return false;
    }

    int lastColumn()
    {
	return 0;
    }

    int lastVisibleColumn()
    {
	return 0;
    }

    void loadColumnZero()
    {
    }

    int numberOfVisibleColumns()
    {
	return 0;
    }

    void reloadColumn(int column)
    {
    }

    void selectAll(Object sender)
    {
    }

    int selectedColumn()
    {
	return 0;
    }

    void setLastColumn(int column)
    {
    }

    void validateVisibleColumns()
    {
    }

    void drawTitle_inRect_ofColumn(String title, OSRect aRect, int column)
    {
    }

    boolean isTitled()
    {
	return false;
    }

    void setTitled(boolean flag)
    {
    }

    void setTitle_ofColumn(String aString, int column)
    {
    }

    OSRect titleFrameOfColumn(int column)
    {
	return null;
    }

    float titleHeight()
    {
	return 0.0;
    }

    String titleOfColumn(int column)
    {
	return null;
    }

    void scrollColumnsLeftBy(int shiftAmount)
    {
    }

    void scrollColumnsRightBy(int shiftAmount)
    {
    }

    void scrollColumnToVisible(int column)
    {
    }

    void scrollViaScroller(OSScroller sender)
    {
    }

    void updateScroller()
    {
    }

    void doClick(Object sender)
    {
    }

    void doDoubleClick(Object sender)
    {
    }

    Object loadedCellAtRow_column(int row, int column)
    {
	return null;
    }

    OSMatrix matrixInColumn(int column)
    {
	return null;
    }

    Object selectedCell()
    {
	return null;
    }

    Object selectedCellInColumn(int column)
    {
	return null;
    }

    OSArray selectedCells()
    {
	return null;
    }

    OSRect frameOfColumn(int column)
    {
	return null;
    }

    OSRect frameOfInsideOfColumn(int column)
    {
	return null;
    }

    String path()
    {
	return null;
    }

    String pathSeparator()
    {
	return null;
    }

    String pathToColumn(int column)
    {
	return null;
    }

    boolean setPath(String path)
    {
	return false;
    }

    void setPathSeparator(String aString)
    {
    }

    void tile()
    {
    }

    void browser_createRowsForColumn_inMatrix(OSBrowser sender, int column, OSMatrix matrix)
    {
    }

    boolean browser_isColumnValid(OSBrowser sender, int column)
    {
	return false;
    }

    int browser_numberOfRowsInColumn(OSBrowser sender, int column)
    {
	return 0;
    }

    boolean browser_selectCell_inColumn(OSBrowser sender, String title, int column)
    {
	return false;
    }

    String browser_titleOfColumn(OSBrowser sender, int column)
    {
	return null;
    }

    void browser_willDisplayCell_atRow_column(OSBrowser sender, Object cell, int row, int column)
    {
    }

    void browserDidScroll(OSBrowser sender)
    {
    }

    void browserWillScroll(OSBrowser sender)
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


