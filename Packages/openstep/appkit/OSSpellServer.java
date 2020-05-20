/* Obj-C to Java:
* Class: NSSpellServer.
* Source File: NSSpellServer.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:05 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSSpellServer extends OSObject {
	// Methods.
    boolean registerLanguage_byVendor(String language, String vendor)
    {
	return false;
    }

    Object delegate()
    {
	return null;
    }

    void setDelegate(Object anObject)
    {
    }

    void run()
    {
    }

    boolean isWordInUserDictionaries_caseSensitive(String word, boolean flag)
    {
	return false;
    }

    OSRange spellServer_findMisspelledWordInString_language_wordCount_countOnly(OSSpellServer sender, String stringToCheck, String language, int wordCount, boolean countOnly)
    {
	return null;
    }

    OSArray spellServer_suggestGuessesForWord_inLanguage(OSSpellServer sender, String word, String language)
    {
	return null;
    }

    void spellServer_didLearnWord_inLanguage(OSSpellServer sender, String word, String language)
    {
    }

    void spellServer_didForgetWord_inLanguage(OSSpellServer sender, String word, String language)
    {
    }


}


