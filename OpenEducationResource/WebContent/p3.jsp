<%-- 
    Document   : p3
    Created on : Apr 30, 2018, 7:19:41 PM
    Author     : toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     As a Web developer, it's common to have to interact with files on disk: check disk usage, read file permissions, find file modification times, and read file contents. Fortunately PHP comes with a full-fledged set of file functions for just this purpose and this document lists them all, together with usage examples (See Table A). Keep reading, you might discover something new!

Table A

Function

Explanation

Example

filesize($file)	
This function returns the size of a file, in bytes. It's useful to calculate how much space a file occupies on disk.

<?php
// get file size in bytes
echo "Size is " . filesize('myfile.html') . " bytes";
?>
 
fileowner($file)
filegroup($file)
 	
These functions return the owner and group ID for a file. They're useful to find out who "owns" a particular file.

<?php
// get file owner and group
echo "UID: " . fileowner('myfile.html');
echo "GID: " . filegroup('myfile.html');
?>
 
fileatime($file)
filemtime($file)
 	
These functions return a timestamp indicating when a file was last accessed and modified respectively. They're useful to find out if a file has changed since a particular date.

<?php
// get file access/modification times
echo "Last accessed on: " . date("d-m-y", fileatime('myfile.html'));
 
echo "Last modified on: " . date("d-m-y", filemtime('myfile.html'));
?>
 
fileperms($file)	
This function returns the permissions of a file. Use it to check if a file is readable, writable or executable.

<?php
// get permissions in octal format
echo "File permissions: " . sprintf('%o', fileperms('myfile.html'));
?>
 
filetype($file)	
This function returns the "type" of a file - whether link, directory, character or block device, or regular file. Use this to test the nature of a file before using it in an operation.

<?php
// get file type
echo "File type: " . filetype('myfile.html');
?>
 
stat($file)	
This function is a "catch all" function that returns detailed statistics about a file, including its owner and group, size, time of last change, block usage and inode number. Use this function instead of the functions listed previously if you need to obtain complete file statistics in a single call.

<?php
// get file statistics
print_r(stat('myfile.html'));
?>
realpath($file)	
This function turns a relative file path into an absolute path. It's useful when you need to find out exactly where a file is located on disk.

<?php
// get absolute path
// returns "/tmp/myfile.html"
echo "File path: " . realpath("./cook/book/../../myfile.html");
?>
 
basename($file)
dirname($path)
 	
Given a complete file path, these functions can split it into its constituent parts and separately return the file name and directory name respectively.

<?php
// split directory and file names
// returns "/usr/local/bin"
echo "Directory: " . dirname("/usr/local/bin/php");
 
// returns "php"
echo "File: " . basename("/usr/local/bin/php");
?>
 
file($file)	
This function reads the contents of a file into an array. Each element of the array represents one line of the file. This function is useful to read a file's contents into a variable, so that it can be processed further.

<?php
// read file contents
$lines = file('myfile.html');
 
// print line by line
for($x=1; $x<=sizeof($lines); $x++) {
    echo "Line $x: " . $lines[$x-1] . "\n";
}
?>
 
RELATED TOPICS: MOBILITY  TECH & WORK  CXO  SOFTWARE  HARDWARE SMART PERSONS GUIDES
0
  by Taboola Promoted Links 
Recommended
If You Use Gmail, You'll Love This Inbox Add-On
Clearbit
Painter needs Rs. 20 lacs for baby’s expensive liver transplant surgery
Ketto
Commonly Misused Phrases That Will Make You Sound Unprofessional
Work + Money
5 ways to insert a checkmark into Office documents
Where on Google Earth was Osama bin Laden? (screenshots)
How do I use mail merge in Word 2007?
 | Commenting FAQs | Community Guidelines
Join Discussion

WHITE PAPERS, WEBCASTS, AND DOWNLOADS

    </body>
</html>
