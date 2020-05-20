/* Obj-C to Java:
* Class: NSColor.
* Source File: NSColor.h.
* Module: OpenStep : AppKit.
* Time stamp: Mon Jun 23 22:55:01 1997.
*/

package openstep.appkit;

import openstep.foundation.*;
import openstep.appkit.*;


class ColorComponents {
    float v1, v2, v3, v4;
}


public class OSColor extends OSObject implements OSCoding {
	// Class variables.
    static OSColor[] predefinitions;

	// Instance Variables.
    String colorspace_name;
    String catalog_name;
    String color_name;
    ColorComponents component;
    float white_component;
    int active_component;
    float alpha_component;
    boolean is_clear;


	// Methods.
    static OSColor colorWithCalibratedHue_saturation_brightness_alpha(float hue, float saturation, float brightness, float alpha)
    {
	return null;
    }

    static OSColor colorWithCalibratedRed_green_blue_alpha(float red, float green, float blue, float alpha)
    {
	return null;
    }

    static OSColor colorWithCalibratedWhite_alpha(float white, float alpha)
    {
	return null;
    }

    static OSColor colorWithCatalogName_colorName(String listName, String colorName)
    {
	return null;
    }

    static OSColor colorWithDeviceCyan_magenta_yellow_black_alpha(float cyan, float magenta, float yellow, float black, float alpha)
    {
	return null;
    }

    static OSColor colorWithDeviceHue_saturation_brightness_alpha(float hue, float saturation, float brightness, float alpha)
    {
	return null;
    }

    static OSColor colorWithDeviceRed_green_blue_alpha(float red, float green, float blue, float alpha)
    {
	return null;
    }

    static OSColor colorWithDeviceWhite_alpha(float white, float alpha)
    {
	return null;
    }

    static OSColor blackColor()
    {
	return null;
    }

    static OSColor blueColor()
    {
	return null;
    }

    static OSColor brownColor()
    {
	return null;
    }

    static OSColor clearColor()
    {
	return null;
    }

    static OSColor cyanColor()
    {
	return null;
    }

    static OSColor darkGrayColor()
    {
	return null;
    }

    static OSColor grayColor()
    {
	return null;
    }

    static OSColor greenColor()
    {
	return null;
    }

    static OSColor lightGrayColor()
    {
	return null;
    }

    static OSColor magentaColor()
    {
	return null;
    }

    static OSColor orangeColor()
    {
	return null;
    }

    static OSColor purpleColor()
    {
	return null;
    }

    static OSColor redColor()
    {
	return null;
    }

    static OSColor whiteColor()
    {
	return null;
    }

    static OSColor yellowColor()
    {
	return null;
    }

    static boolean ignoresAlpha()
    {
	return false;
    }

    static void setIgnoresAlpha(boolean flag)
    {
    }

    void getCyan_magenta_yellow_black_alpha(float cyan, float magenta, float yellow, float black, float alpha)
    {
    }

    void getHue_saturation_brightness_alpha(float hue, float saturation, float brightness, float alpha)
    {
    }

    void getRed_green_blue_alpha(float red, float green, float blue, float alpha)
    {
    }

    void getWhite_alpha(float white, float alpha)
    {
    }

    float alphaComponent()
    {
	return 0.0f;
    }

    float blackComponent()
    {
	return 0.0f;
    }

    float blueComponent()
    {
	return 0.0f;
    }

    float brightnessComponent()
    {
	return 0.0f;
    }

    String catalogNameComponent()
    {
	return null;
    }

    String colorNameComponent()
    {
	return null;
    }

    float cyanComponent()
    {
	return 0.0f;
    }

    float greenComponent()
    {
	return 0.0f;
    }

    float hueComponent()
    {
	return 0.0f;
    }

    String localizedCatalogNameComponent()
    {
	return null;
    }

    String localizedColorNameComponent()
    {
	return null;
    }

    float magentaComponent()
    {
	return 0.0f;
    }

    float redComponent()
    {
	return 0.0f;
    }

    float saturationComponent()
    {
	return 0.0f;
    }

    float whiteComponent()
    {
	return 0.0f;
    }

    float yellowComponent()
    {
	return 0.0f;
    }

    String colorSpaceName()
    {
	return null;
    }

    OSColor colorUsingColorSpaceName(String colorSpace)
    {
	return null;
    }

    OSColor colorUsingColorSpaceName_device(String colorSpace, OSDictionary deviceDescription)
    {
	return null;
    }

    OSColor blendedColorWithFraction_ofColor(float fraction, OSColor aColor)
    {
	return null;
    }

    OSColor colorWithAlphaComponent(float alpha)
    {
	return null;
    }

    static OSColor colorFromPasteboard(OSPasteboard pasteBoard)
    {
	return null;
    }

    void writeToPasteboard(OSPasteboard pasteBoard)
    {
    }

    void drawSwatchInRect(OSRect rect)
    {
    }

    void set()
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


