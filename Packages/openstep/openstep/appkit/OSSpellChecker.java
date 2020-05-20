/* Obj-C to Java:
* Class: NSSpellChecker.
* Source File: NSSpellChecker.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSpellChecker extends OSObject {
	// Methods.
    static OSSpellChecker sharedSpellChecker()
    {
	return null;
    }

    static boolean sharedSpellCheckerExists()
    {
	return false;
    }

    OSView accessoryView()
    {
	return null;
    }

    void setAccessoryView(OSView aView)
    {
    }

    OSPanel spellingPanel()
    {
	return null;
    }

    int countWordsInString_language(String aString, String language)
    {
	return 0;
    }

    OSRange checkSpellingOfString_startingAt(String stringToCheck, int startingOffset)
    {
	return null;
    }

    OSRange checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(String stringToCheck, int startingOffset, String language, boolean wrapFlag, int tag, int wordCount)
    {
	return null;
    }

    String language()
    {
	return null;
    }

    boolean setLanguage(String aLanguage)
    {
	return false;
    }

    static int uniqueSpellDocumentTag()
    {
	return 0;
    }

    void closeSpellDocumentWithTag(int tag)
    {
    }

    void ignoreWord_inSpellDocumentWithTag(String wordToIgnore, int tag)
    {
    }

    OSArray ignoredWordsInSpellDocumentWithTag(int tag)
    {
	return null;
    }

    void setIgnoredWords_inSpellDocumentWithTag(OSArray someWords, int tag)
    {
    }

    void setWordFieldStringValue(String aString)
    {
    }

    void updateSpellingPanelWithMisspelledWord(String word)
    {
    }


}


