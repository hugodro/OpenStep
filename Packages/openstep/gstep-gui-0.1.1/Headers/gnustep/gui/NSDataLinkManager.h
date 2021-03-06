/* 
   NSDataLinkManager.h

   Description...

   Copyright (C) 1996 Free Software Foundation, Inc.

   Author:  Scott Christley <scottc@net-community.com>
   Date: 1996
   
   This file is part of the GNUstep GUI Library.

   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Library General Public
   License as published by the Free Software Foundation; either
   version 2 of the License, or (at your option) any later version.
   
   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Library General Public License for more details.

   If you are interested in a warranty or support for this source code,
   contact Scott Christley <scottc@net-community.com> for more information.
   
   You should have received a copy of the GNU Library General Public
   License along with this library; if not, write to the Free
   Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
*/ 

#ifndef _GNUstep_H_NSDataLinkManager
#define _GNUstep_H_NSDataLinkManager

#include <AppKit/stdappkit.h>
#include <AppKit/NSWindow.h>
#include <AppKit/NSDataLink.h>
#include <AppKit/NSSelection.h>
#include <Foundation/NSCoder.h>

@interface NSDataLinkManager : NSObject <NSCoding>

{
  // Attributes
}

//
// Initializing and Freeing a Link Manager
//
- (id)initWithDelegate:(id)anObject;
- (id)initWithDelegate:(id)anObject
	      fromFile:(NSString *)path;

//
// Adding and Removing Links
//
- (BOOL)addLink:(NSDataLink *)link
	     at:(NSSelection *)selection;
- (BOOL)addLinkAsMarker:(NSDataLink *)link
		     at:(NSSelection *)selection;
- (NSDataLink *)addLinkPreviouslyAt:(NSSelection *)oldSelection
		     fromPasteboard:(NSPasteboard *)pasteboard
at:(NSSelection *)selection;
- (void)breakAllLinks;
- (void)writeLinksToPasteboard:(NSPasteboard *)pasteboard;

//
// Informing the Link Manager of Document Status
//
- (void)noteDocumentClosed;
- (void)noteDocumentEdited;
- (void)noteDocumentReverted;
- (void)noteDocumentSaved;
- (void)noteDocumentSavedAs:(NSString *)path;
- (void)noteDocumentSavedTo:(NSString *)path;

//
// Getting and Setting Information about the Link Manager
//
- (id)delegate;
- (BOOL)delegateVerifiesLinks;
- (NSString *)filename;
- (BOOL)interactsWithUser;
- (BOOL)isEdited;
- (void)setDelegateVerifiesLinks:(BOOL)flag;
- (void)setInteractsWithUser:(BOOL)flag;

//
// Getting and Setting Information about the Manager's Links
//
- (BOOL)areLinkOutlinesVisible;
- (NSEnumerator *)destinationLinkEnumerator;
- (NSDataLink *)destinationLinkWithSelection:(NSSelection *)destSel;
- (void)setLinkOutlinesVisible:(BOOL)flag;
- (NSEnumerator *)sourceLinkEnumerator;

//
// Methods Implemented by the Delegate
//
- (BOOL)copyToPasteboard:(NSPasteboard *)pasteboard 
		      at:(NSSelection *)selection
cheapCopyAllowed:(BOOL)flag;
- (void)dataLinkManager:(NSDataLinkManager *)sender 
	   didBreakLink:(NSDataLink *)link;
- (BOOL)dataLinkManager:(NSDataLinkManager *)sender 
  isUpdateNeededForLink:(NSDataLink *)link;
- (void)dataLinkManager:(NSDataLinkManager *)sender 
      startTrackingLink:(NSDataLink *)link;
- (void)dataLinkManager:(NSDataLinkManager *)sender 
       stopTrackingLink:(NSDataLink *)link;
- (void)dataLinkManagerCloseDocument:(NSDataLinkManager *)sender;
- (void)dataLinkManagerDidEditLinks:(NSDataLinkManager *)sender;
- (void)dataLinkManagerRedrawLinkOutlines:(NSDataLinkManager *)sender;
- (BOOL)dataLinkManagerTracksLinksIndividually:(NSDataLinkManager *)sender;
- (BOOL)importFile:(NSString *)filename
		at:(NSSelection *)selection;
- (BOOL)pasteFromPasteboard:(NSPasteboard *)pasteboard 
			 at:(NSSelection *)selection;
- (BOOL)showSelection:(NSSelection *)selection;
- (NSWindow *)windowForSelection:(NSSelection *)selection;

//
// NSCoding protocol
//
- (void)encodeWithCoder:aCoder;
- initWithCoder:aDecoder;

@end

#endif // _GNUstep_H_NSDataLinkManager
