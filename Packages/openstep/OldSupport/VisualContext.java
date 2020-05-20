/*******************************************************
* Class: VisualContext.
* Source File: VisualContext.java.
* Module: OpenStep : privateSupport.
* Rev: 25 juin 1997 : REV 0 : Hugo DesRosiers : Creation
********************************************************************************************/

package openstep.support;

import openstep.appkit.OSWindow;


public class VisualContext extends Object {

	// Instance variables.
    OSWindow attachedWindow;
    InterfaceEngine engine;

	// Constructor.
    public VisualContext(InterfaceEngine anEngine)
    {
        engine= anEngine;
    }

    public void flush()
    {
	engine.flushVC(this);
    }

	// Instance methods.
	// -- Section: Color Ops:
    public void colorimage()
    {
    }

    public void currentblackgeneration()
    {
    }

    public void currentcolorscreen()
    {
    }

    public void currentcolortransfer()
    {
    }

    public void currentundercolorremoval()
    {
    }

    public void setblackgeneration()
    {
    }

    public void setcmykcolor(float c, float m, float y, float k)
    {
    }

    public void setcolorscreen()
    {
    }

    public void setcolortransfer()
    {
    }

    public void setundercolorremoval()
    {
    }


/********************************************************
 These methods are returning values.
        public void currentcmykcolor(float *c, float *m, float *y, float *k);
********************************************************/


	// -- Section: Control Ops:

    public void eq()
    {
    }

    public void exit()
    {
    }

    public void falseDPS()
    {
    }

    public void forDPS()
    {
    }

    public void forall()
    {
    }

    public void ge()
    {
    }

    public void gt()
    {
    }

    public void ifDPS()
    {
    }

    public void ifelse()
    {
    }

    public void le()
    {
    }

    public void loop()
    {
    }

    public void lt()
    {
    }

    public void ne()
    {
    }

    public void not()
    {
    }

    public void or()
    {
    }

    public void repeat()
    {
    }

    public void stop()
    {
    }

    public void stopped()
    {
    }

    public void trueDPS()
    {
    }


    // --  Section: Context.

    public void condition()
    {
    }

    public void defineusername(int i, String username)
    {
    }

    public void defineuserobject()
    {
    }

    public void detach()
    {
    }

    public void execuserobject(int index)
    {
    }

    public void fork()
    {
    }

    public void join()
    {
    }

    public void lock()
    {
    }

    public void monitor()
    {
    }

    public void notifyDPS()
    {
    }

    public void setobjectformat(int code)
    {
    }

    public void setvmthreshold(int i)
    {
    }

    public void undefineuserobject(int index)
    {
    }

    public void userobject()
    {
    }

    public void waitDPS()
    {
    }

    public void yield()
    {
    }

/********************************************************
 These methods are returning values.
    public void currentcontext(int *cid)
    {
    }

    public void currentobjectformat(int *code)
    {
    }
********************************************************/


	// -- Section: Data.

    public void aload()
    {
    }

    public void array(int len)
    {
    }

    public void astore()
    {
    }

    public void begin()
    {
    }

    public void clear()
    {
    }

    public void cleartomark()
    {
    }

    public void copy(int n)
    {
    }

    public void cvi()
    {
    }

    public void cvlit()
    {
    }

    public void cvn()
    {
    }

    public void cvr()
    {
    }

    public void cvrs()
    {
    }

    public void cvs()
    {
    }

    public void cvx()
    {
    }

    public void def()
    {
    }

    public void dict(int len)
    {
    }

    public void dictstack()
    {
    }

    public void dup()
    {
    }

    public void end()
    {
    }

    public void exch()
    {
    }

    public void execstack()
    {
    }

    public void executeonly()
    {
    }

    public void get()
    {
    }

    public void getinterval()
    {
    }

    public void index(int i)
    {
    }

    public void load()
    {
    }

    public void mark()
    {
    }

    public void matrix()
    {
    }

    public void noaccess()
    {
    }

    public void nullDPS()
    {
    }

    public void packedarray()
    {
    }

    public void pop()
    {
    }

    public void put()
    {
    }

    public void putinterval()
    {
    }

    public void readonly()
    {
    }

    public void roll(int n, int j)
    {
    }

    public void shareddict()
    {
    }

    public void statusdict()
    {
    }

    public void store()
    {
    }

    public void string(int len)
    {
    }

    public void systemdict()
    {
    }

    public void userdict()
    {
    }

/********************************************************
 These methods are returning values.
    public void anchorsearch(int *truth)
    {
    }

    public void count(int *n)
    {
    }

    public void counttomark(int *n)
    {
    }

    public void known(int *b)
    {
    }

    public void length(int *len)
    {
    }

    public void maxlength(int *len)
    {
    }

    public void rcheck(int *b)
    {
    }

    public void scheck(int *b)
    {
    }

    public void search(int *b)
    {
    }

    public void stringwidth(const char *s, float *xp, float *yp)
    {
    }

    public void wcheck(int *b)
    {
    }

    public void where(int *b)
    {
    }

    public void xcheck(int *b)
    {
    }

********************************************************/


	// -- Section: Font.

    public void FontDirectory()
    {
    }

    public void ISOLatin1Encoding()
    {
    }

    public void SharedFontDirectory()
    {
    }

    public void StandardEncoding()
    {
    }

    public void currentcacheparams()
    {
    }

    public void currentfont()
    {
    }

    public void definefont()
    {
    }

    public void findfont(String name)
    {
    }

    public void makefont()
    {
    }

    public void scalefont(float size)
    {
    }

    public void selectfont(String name, float scale)
    {
    }

    public void setcachedevice(float wx, float wy, float llx, float lly, float urx, float ury)
    {
    }

    public void setcachelimit(float n)
    {
    }

    public void setcacheparams()
    {
    }

    public void setcharwidth(float wx, float wy)
    {
    }

    public void setfont(int f)
    {
    }

    public void undefinefont(String name)
    {
    }

/********************************************************
 These methods are returning values.
    public void cachestatus(int *bsize, int *bmax, int *msize);
********************************************************/


	// -- Section: State:
    public void concat(float[] m)
    {
    }

    public void currentdash()
    {
    }

    public void currenthalftone()
    {
    }

    public void currentmatrix()
    {
    }

    public void currentscreen()
    {
    }

    public void currenttransfer()
    {
    }

    public void defaultmatrix()
    {
    }

    public void grestore()
    {
    }

    public void grestoreall()
    {
    }

    public void gsave()
    {
    }

    public void gstate()
    {
    }

    public void initgraphics()
    {
    }

    public void initmatrix()
    {
    }

    public void rotate(float angle)
    {
    }

    public void scale(float x, float y)
    {
    }

    public void setdash(float[] path, int size, float offset)
    {
    }

    public void setflat(float flatness)
    {
    }

    public void setgray(float gray)
    {
    }

    public void setgstate(int gst)
    {
    }

    public void sethalftone()
    {
    }

    public void sethalftonephase(float x, float y)
    {
    }

    public void sethsbcolor(float h, float s, float b)
    {
    }

    public void setlinecap(int linecap)
    {
    }

    public void setlinejoin(int linejoin)
    {
    }

    public void setlinewidth(float width)
    {
    }

    public void setmatrix()
    {
    }

    public void setmiterlimit(float limit)
    {
    }

    public void setrgbcolor(float r, float g, float b)
    {
    }

    public void setscreen()
    {
    }

    public void setstrokeadjust(int b)
    {
    }

    public void settransfer()
    {
    }

    public void translate(float x, float y)
    {
    }

/********************************************************
 These methods are returning values.

    public void currentflat(float *flatness)
    {
    }

    public void currentgray(float *gray)
    {
    }

    public void currentgstate(int gst)
    {
    }

    public void currenthalftonephase(float *x, float *y)
    {
    }

    public void currenthsbcolor(float *h, float *s, float *b)
    {
    }

    public void currentlinecap(int *linecap)
    {
    }

    public void currentlinejoin(int *linejoin)
    {
    }

    public void currentlinewidth(float *width)
    {
    }

    public void currentmiterlimit(float *limit)
    {
    }

    public void currentpoint(float *x, float *y)
    {
    }

    public void currentrgbcolor(float *r, float *g, float *b)
    {
    }

    public void currentstrokeadjust(int *b)
    {
    }
********************************************************/


	// -- Section: Input/Output.

    public void equals()
    {
    }

    public void equalsequals()
    {
    }

    public void closefile()
    {
    }

    public void currentfile()
    {
    }

    public void deletefile(String filename)
    {
    }

    public void echo(int b)
    {
    }

    public void file(String name, String access)
    {
    }

    public void filenameforall()
    {
    }

    public void flush()
    {
    }

    public void flushfile()
    {
    }

    public void print()
    {
    }

    public void printobject(int tag)
    {
    }

    public void pstack()
    {
    }

    public void renamefile(String oldName, String newName)
    {
    }

    public void resetfile()
    {
    }

    public void setfileposition(int pos)
    {
    }

    public void stack()
    {
    }

    public void write()
    {
    }

    public void writehexstring()
    {
    }

    public void writeobject(int tag)
    {
    }

    public void writestring()
    {
    }


/********************************************************
 These methods are returning values.

    public void bytesavailable(int *n)
    {
    }

    public void fileposition(int *pos)
    {
    }

    public void status(int *b)
    {
    }

    public void token(int *b)
    {
    }

    public void read(int *b)
    {
    }

    public void readhexstring(int *b)
    {
    }

    public void readline(int *b)
    {
    }

    public void readstring(int *b)
    {
    }
********************************************************/


	// -- Section: Math.

    public void abs()
    {
    }

    public void add()
    {
    }

    public void and()
    {
    }

    public void atan()
    {
    }

    public void bitshift(int shift)
    {
    }

    public void ceiling()
    {
    }

    public void cos()
    {
    }

    public void div()
    {
    }

    public void exp()
    {
    }

    public void floor()
    {
    }

    public void idiv()
    {
    }

    public void ln()
    {
    }

    public void log()
    {
    }

    public void mod()
    {
    }

    public void mul()
    {
    }

    public void neg()
    {
    }

    public void round()
    {
    }

    public void sin()
    {
    }

    public void sqrt()
    {
    }

    public void sub()
    {
    }

    public void truncate()
    {
    }

    public void xor()
    {
    }


	// -- Section: matrix.

    public void concatmatrix()
    {
    }

    public void identmatrix()
    {
    }

    public void invertmatrix()
    {
    }

/********************************************************
 These methods are returning values.

    public void dtransform(float x1, float y1, float *x2, float *y2)
    {
    }

    public void idtransform(float x1, float y1, float *x2, float *y2)
    {
    }

    public void itransform(float x1, float y1, float *x2, float *y2)
    {
    }

    public void transform(float x1, float y1, float *x2, float *y2)
    {
    }

********************************************************/


	// -- Section: Misc.
    public void banddevice()
    {
    }

    public void framedevice()
    {
    }

    public void nulldevice()
    {
    }

    public void renderbands()
    {
    }


	// -- Section: Stack.

    public void sendboolean(int it)
    {
    }

    public void sendchararray(char[] s, int size)
    {
    }

    public void sendfloat(float it)
    {
    }

    public void sendfloatarray(float[] a, int size)
    {
    }

    public void sendint(int it)
    {
    }

    public void sendintarray(int[] a, int size)
    {
    }

    public void sendstring(String s)
    {
    }


/********************************************************
 These methods are returning values.

    public void getboolean(int *it)
    {
    }

    public void getchararray(int size, char s[])
    {
    }

    public void getfloat(float *it)
    {
    }

    public void getfloatarray(int size, float a[])
    {
    }

    public void getint(int *it)
    {
    }

    public void getintarray(int size, int a[])
    {
    }

    public void getstring(char *s)
    {
    }

********************************************************/


    // -- Section: Paint.

    public void ashow(float x, float y, String s)
    {
    }

    public void awidthshow(float cx, float cy, int c, float ax, float ay, String s)
    {
    }

    public void copypage()
    {
    }

    public void eofill()
    {
    }

    public void erasepage()
    {
    }

    public void fill()
    {
    }

    public void image()
    {
    }

    public void imagemask()
    {
    }

    public void kshow(String s)
    {
    }

    public void rectfill(float x, float y, float w, float h)
    {
    }

    public void rectstroke(float x, float y, float w, float h)
    {
    }

    public void show(String s)
    {
    }

    public void showpage()
    {
    }

    public void stroke()
    {
    }

    public void strokepath()
    {
    }

    public void ueofill(char[] nums, int n, char[] ops, int l)
    {
    }

    public void ufill(char[] nums, int n, char[] ops, int l)
    {
    }

    public void ustroke(char[] nums, int n, char[] ops, int l)
    {
    }

    public void ustrokepath(char[] nums, int n, char[] ops, int l)
    {
    }

    public void widthshow(float x, float y, int c, String s)
    {
    }

    public void xshow(String s, float[] numarray, int size)
    {
    }

    public void xyshow(String s, float[] numarray, int size)
    {
    }

    public void yshow(String s, float[] numarray, int size)
    {
    }



	// -- Section: Path.

    public void arc(float x, float y, float r, float angle1, float angle2)
    {
    }

    public void arcn(float x, float y, float r, float angle1, float angle2)
    {
    }

    public void arct(float x1, float y1, float x2, float y2, float r)
    {
    }

    public void charpath(String s, int b)
    {
    }

    public void clip()
    {
    }

    public void clippath()
    {
    }

    public void closepath()
    {
    }

    public void curveto(float x1, float y1, float x2, float y2, float x3, float y3)
    {
    }

    public void eoclip()
    {
    }

    public void eoviewclip()
    {
    }

    public void flattenpath()
    {
    }

    public void initclip()
    {
    }

    public void initviewclip()
    {
    }

    public void lineto(float x, float y)
    {
    }

    public void moveto(float x, float y)
    {
    }

    public void newpath()
    {
    }

    public void pathforall()
    {
    }

    public void rcurveto(float x1, float y1, float x2, float y2, float x3, float y3)
    {
    }

    public void rectclip(float x, float y, float w, float h)
    {
    }

    public void rectviewclip(float x, float y, float w, float h)
    {
    }

    public void reversepath()
    {
    }

    public void rlineto(float x, float y)
    {
    }

    public void rmoveto(float x, float y)
    {
    }

    public void setbbox(float llx, float lly, float urx, float ury)
    {
    }

    public void setucacheparams()
    {
    }

    public void uappend(char[] nums, int n, char[] ops, int l)
    {
    }

    public void ucache()
    {
    }

    public void ucachestatus()
    {
    }

    public void upath(int b)
    {
    }

    public void viewclip()
    {
    }

    public void viewclippath()
    {
    }


/********************************************************
 These methods are returning values.

    public void arcto(float x1, float y1, float x2, float y2, float r, float *xt1, float *yt1, float *xt2, float *yt2)
    {
    }

    public void pathbbox(float *llx, float *lly, float *urx, float *ury)
    {
    }

********************************************************/



	// -- Section: SysOp.

    public void bind()
    {
    }

    public void currentdict()
    {
    }

    public void deviceinfo()
    {
    }

    public void errordict()
    {
    }

    public void exec()
    {
    }

    public void prompt()
    {
    }

    public void quit()
    {
    }

    public void rand()
    {
    }

    public void restore()
    {
    }

    public void rrand()
    {
    }

    public void run(String filename)
    {
    }

    public void save()
    {
    }

    public void setpacking(int b)
    {
    }

    public void setshared(int b)
    {
    }

    public void srand()
    {
    }

    public void start()
    {
    }

    public void type()
    {
    }

    public void undef(String name)
    {
    }

    public void version(int bufsize, char[] buf)
    {
    }

    public void vmreclaim(int code)
    {
    }


/********************************************************
 These methods are returning values.

    public void countdictstack(int *n)
    {
    }

    public void countexecstack(int *n)
    {
    }

    public void currentpacking(int *b)
    {
    }

    public void currentshared(int *b)
    {
    }

    public void realtime(int *i)
    {
    }

    public void usertime(int *milliseconds)
    {
    }

    public void vmstatus(int *level, int *used, int *maximum)
    {
    }

********************************************************/


    // -- Section: WinOps.

/********************************************************
 These methods are returning values.

    public void ineofill(float x, float y, int *b)
    {
    }

    public void infill(float x, float y, int *b)
    {
    }

    public void instroke(float x, float y, int *b)
    {
    }

    public void inueofill(float x, float y, const char nums[], int n, const char ops[], int l, int *b)
    {
    }

    public void inufill(float x, float y, const char nums[], int n, const char ops[], int l, int *b)
    {
    }

    public void inustroke(float x, float y, const char nums[], int n, const char ops[], int l, int *b)
    {
    }

    public void wtranslation(float *x, float *y)
    {
    }

********************************************************/



	// -- Section: PostScript Level 2.

    public void leftbracket()
    {
    }

    public void rightbracket()
    {
    }

    public void leftleft()
    {
    }

    public void rightright()
    {
    }

    public void cshow(String s)
    {
    }

    public void currentcolor()
    {
    }

    public void currentcolorrendering()
    {
    }

    public void currentcolorspace()
    {
    }

    public void currentdevparams(String dev)
    {
    }

    public void currentpagedevice()
    {
    }

    public void currentsystemparams()
    {
    }

    public void currentuserparams()
    {
    }

    public void defineresource(String category)
    {
    }

    public void execform()
    {
    }

    public void filter()
    {
    }

    public void findencoding(String key)
    {
    }

    public void findresource(String key, String category)
    {
    }

    public void globaldict()
    {
    }

    public void GlobalFontDirectory()
    {
    }

    public void glyphshow(String name)
    {
    }

    public void makepattern()
    {
    }

    public void product()
    {
    }

    public void resourceforall(String category)
    {
    }

    public void rootfont()
    {
    }

    public void setcolor()
    {
    }

    public void setcolorrendering()
    {
    }

    public void setcolorspace()
    {
    }

    public void setdevparams()
    {
    }

    public void setglobal(int b)
    {
    }

    public void setoverprint(int b)
    {
    }

    public void setpagedevice()
    {
    }

    public void setpattern(int patternDict)
    {
    }

    public void setsystemparams()
    {
    }

    public void setuserparams()
    {
    }

    public void startjob(int b, String password)
    {
    }

    public void undefineresource(String key, String category)
    {
    }


/********************************************************
 These methods are returning values.

    public void currentglobal(int *b)
    {
    }

    public void currentoverprint(int *b)
    {
    }

    public void gcheck(int *b)
    {
    }

    public void languagelevel(int *n)
    {
    }

    public void resourcestatus(String key, String category, int *b)
    {
    }

    public void revision(int *n)
    {
    }

    public void serialnumber(int *n)
    {
    }

********************************************************/

}
