# day03

In Java, a directory is a file system object that can contain other files and directories, while a file is a data storage unit that contains information.
E.g of directory: /Users/kzh/ibf-day03/ibf2022_batch2/day03/

A directory can be thought of as a container for files and other directories, while a file is a single unit of information that is typically stored within a directory. Directories can be nested within each other, forming a hierarchical structure that represents the organization of files on a file system.
E.g of file: /Users/kzh/ibf-day03/ibf2022_batch2/day03/cat_in_the_hat.txt

A Path in Java is a representation of the location of a file or directory in the file system. It can be an absolute or relative path and contains information about the file or directory's name, location, and any other relevant attributes.

.isDirectory()
Tests whether the file denoted by this abstract pathname is a directory.

.isFile()
Tests whether the file denoted by this abstract pathname is a normal file. A file is normal if it is not a directory and, in addition, satisfies other system-dependent criteria. Any non-directory file created by a Java application is guaranteed to be a normal file.


Reading a file & writing to a new file (CatInTheHat.java/CopyCatInTheHat.java)
----
1. Get a path (relative or absolute path):
Use the .get() method by passing an URI
A Uniform Resource Identifier (URI) is a character sequence that identifies a logical (abstract) or physical resource

2. Convert a path to a file
Use the .toFile() method

3. Check if the file exist, then check the file size, absolute path
Use the .exists() method
Use the .length() method
Use the .getAbsolutePath() method

4. Reading the content of a file using InputStream with byte buffer, alternatively, read using FileReader

5. Write using OutputStream or FileWriter


