/* Obj-C to Java:
* Class: NSUserDefaults.
* Source File: NSUserDefaults.h.
* Module: OpenStep : AppKit.
* Time stamp: Fri Jun 27 03:29:12 1997.
*/

package openstep.foundation;

import openstep.foundation.*;
import openstep.appkit.*;

public class OSUserDefaults extends OSObject {
	// Instance Variables.
    String directoryForSaving;
    String appDomain;
    OSMutableDictionary persistentDomains;
    OSMutableDictionary volatileDomains;
    OSMutableArray searchList;
    boolean dirty;

	// Methods.
    static OSUserDefaults standardUserDefaults()
    {
	return null;
    }

    static void sycronizeStandardUserDefaults(Object sender)
    {
    }

    OSArray arrayForKey(String defaultName)
    {
	return null;
    }

    OSDictionary dictionaryForKey(String defaultName)
    {
	return null;
    }

    OSData dataForKey(String defaultName)
    {
	return null;
    }

    OSArray stringArrayForKey(String defaultName)
    {
	return null;
    }

    String stringForKey(String defaultName)
    {
	return null;
    }

    boolean boolForKey(String defaultName)
    {
	return false;
    }

    float floatForKey(String defaultName)
    {
	return 0.0;
    }

    int integerForKey(String defaultName)
    {
	return 0;
    }

    Object objectForKey(String defaultName)
    {
	return null;
    }

    void removeObjectForKey(String defaultName)
    {
    }

    void setBool_forKey(boolean value, String defaultName)
    {
    }

    void setFloat_forKey(float value, String defaultName)
    {
    }

    void setInteger_forKey(int value, String defaultName)
    {
    }

    void setObject_forKey(Object value, String defaultName)
    {
    }

    Object init()
    {
	return null;
    }

    Object initWithUser(String userName)
    {
	return null;
    }

    Object initWithPath(String pathName)
    {
	return null;
    }

    void makeStandardDomainSearchList()
    {
    }

    OSMutableArray searchList()
    {
	return null;
    }

    OSDictionary persistentDomainForName(String domainName)
    {
	return null;
    }

    OSArray persistentDomainNames()
    {
	return null;
    }

    void removePersistentDomainForName(String domainName)
    {
    }

    void setPersistentDomain_forName(OSDictionary domain, String domainName)
    {
    }

    boolean synchronize()
    {
	return false;
    }

    void persistentDomainHasChanged(String domainName)
    {
    }

    void removeVolatileDomainForName(String domainName)
    {
    }

    void setVolatileDomain_forName(OSDictionary domain, String domainName)
    {
    }

    OSDictionary volatileDomainForName(String domainName)
    {
	return null;
    }

    OSArray volatileDomainNames()
    {
	return null;
    }

    OSDictionary dictionaryRepresentation()
    {
	return null;
    }

    void registerDefaults(OSDictionary dictionary)
    {
    }


}


