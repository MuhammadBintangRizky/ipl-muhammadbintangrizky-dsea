// Journal Comments
/*
* Changes (from 11-Oct-2001)
* -------------------------- 
* 11-Oct-2001 : Re-organised the class and moved it to new 
* package com.jrefinery.date (DG); 
* 05-Nov-2001 : Added a getDescription() method, and 
* eliminated NotableDate class (DG); 
* 12-Nov-2001 : IBD requires setDescription() method, now 
* that NotableDate class is gone (DG); Changed 
* getPreviousDayOfWeek(), 
* getFollowingDayOfWeek() and 
* getNearestDayOfWeek() to correct bugs (DG); 
* 05-Dec-2001 : Fixed bug in SpreadsheetDate class (DG); 
* 29-May-2002 : Moved the month constants into a separate 
* interface (MonthConstants) (DG); 
*/

// Noise Comments
/** 
* Default constructor. 
*/ 
protected AnnualDateRule() { } 
/** The day of the month. */ 
private int dayOfMonth; 
/** 
* Returns the day of the month. 
* @return the day of the month. 
*/ 
public int getDayOfMonth() { 
return dayOfMonth; 
} 

// Legal Comments
// Copyright (C) 2011 by Osoco. All rights reserved. 
// Released under the terms of the GNU General Public License 
// version 2 or later. 

// Informative Comments
// Returns an instance of the Responder being tested. 
protected abstract Responder responderInstance(); 
// renaming the function: responderBeingTested 
// format matched kk:mm:ss EEE, MMM dd, yyyy 
Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, 
\\d*");

// Clarification
assertTrue(a.compareTo(b) == -1); // a < b 
assertTrue(b.compareTo(a) == 1); // b > a 
