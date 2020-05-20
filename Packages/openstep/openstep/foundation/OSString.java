/* Obj-C to Java:
* Class: NSString.
* Source File: NSString.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;


public class OSString extends OSObject implements OSCoding, OSCopying, OSMutableCopying {
	// Methods.
    int length()
    {
	return 0;
    }

    int characterAtIndex(int index)
    {
	return 0;
    }

    void getCharacters(int buffer)
    {
    }

    void getCharacters_range(int buffer, OSRange aRange)
    {
    }

    String stringByAppendingString(String aString)
    {
	return null;
    }

    String stringByAppendingFormat(String format, Object[] ellipsis)
    {
	return null;
    }

    String stringByAppendingFormat_arguments(String format, Object[] argList)
    {
	return null;
    }

    String stringByPrependingString(String aString)
    {
	return null;
    }

    String stringByPrependingFormat(String format, Object[] ellipsis)
    {
	return null;
    }

    String stringByPrependingFormat_arguments(String format, Object[] argList)
    {
	return null;
    }

    OSArray componentsSeparatedByString(String separator)
    {
	return null;
    }

    String substringFromIndex(int index)
    {
	return null;
    }

    String substringWithRange(OSRange aRange)
    {
	return null;
    }

    String substringFromRange(OSRange aRange)
    {
	return null;
    }

    String substringToIndex(int index)
    {
	return null;
    }

    OSRange rangeOfCharacterFromSet(OSCharacterSet aSet)
    {
	return null;
    }

    OSRange rangeOfCharacterFromSet_options(OSCharacterSet aSet, int mask)
    {
	return null;
    }

    OSRange rangeOfCharacterFromSet_options_range(OSCharacterSet aSet, int mask, OSRange aRange)
    {
	return null;
    }

    OSRange rangeOfString(String string)
    {
	return null;
    }

    OSRange rangeOfString_options(String string, int mask)
    {
	return null;
    }

    OSRange rangeOfString_options_range(String aString, int mask, OSRange aRange)
    {
	return null;
    }

    int indexOfString(String substring)
    {
	return 0;
    }

    int indexOfString_fromIndex(String substring, int index)
    {
	return 0;
    }

    int indexOfString_range(String substring, OSRange aRange)
    {
	return 0;
    }

    OSRange rangeOfComposedCharacterSequenceAtIndex(int anIndex)
    {
	return null;
    }

    Object propertyList()
    {
	return null;
    }

    OSMutableDictionary propertyListFromStringsFileFormat()
    {
	return null;
    }

    int caseInsensitiveCompare(String aString)
    {
	return 0;
    }

    int compare(Object aString)
    {
	return 0;
    }

    int compare_options(String aString, int mask)
    {
	return 0;
    }

    int compare_options_range(String aString, int mask, OSRange aRange)
    {
	return 0;
    }

    boolean hasPrefix(String aString)
    {
	return false;
    }

    boolean hasSuffix(String aString)
    {
	return false;
    }

    public boolean isEqual(Object anObject)
    {
	return false;
    }

    boolean isEqualToString(String aString)
    {
	return false;
    }

    public int hash()
    {
	return 0;
    }

    String commonPrefixWithString_options(String aString, int mask)
    {
	return null;
    }

    String capitalizedString()
    {
	return null;
    }

    String lowercaseString()
    {
	return null;
    }

    String uppercaseString()
    {
	return null;
    }

    char cString()
    {
	return 0;
	}

    int cStringLength()
    {
	return 0;
    }

    void getCString(char buffer)
    {
    }

    void getCString_maxLength(char buffer, int maxLength)
    {
    }

    void getCString_maxLength_range_remainingRange(char buffer, int maxLength, OSRange aRange, OSRange leftoverRange)
    {
    }

    double doubleValue()
    {
	return 0.0;
    }

    float floatValue()
    {
	return 0.0f;
    }

    int intValue()
    {
	return 0;
    }

    static int availableStringEncodings()
    {
	return 0;
    }

    static int defaultCStringEncoding()
    {
	return 0;
    }

    static String localizedNameOfStringEncoding(int encoding)
    {
	return null;
    }

    boolean canBeConvertedToEncoding(int encoding)
    {
	return false;
    }

    OSData dataUsingEncoding(int encoding)
    {
	return null;
    }

    OSData dataUsingEncoding_allowLossyConversion(int encoding, boolean flag)
    {
	return null;
    }

    int fastestEncoding()
    {
	return 0;
    }

    int smallestEncoding()
    {
	return 0;
    }

    boolean getBytes_maxLength_inEncoding_allowLossesInConversion_fromRange_usedRange_remainingRange(
            Object bytes, int maxLength, int encoding, boolean allowLossesInConversion, OSRange fromRange, OSRange usedRange, OSRange remainingRange)
    {
	return false;
    }

    boolean writeToFile_atomically(String path, boolean flag)
    {
	return false;
    }

// Protocol OSCopying.
    public Object copyWithZone(OSZone zone)
    {
        return null;
    }


// Protocol OSMutableCopying.
    public Object mutableCopyWithZone(OSZone zone)
    {
        return null;
    }


}


