//Activity 3 code will be similar to the following

//For the first step, using setPath(), the path depends on your username, where you installed the activities, and your Operating System.
//You might want to locate the Unit12_Project_1 folder and then copy and paste the path from your file explorer (such as Windows Explorer), 
//being sure to get the slashes right

//OUFileChooser.setPath("C:/Users/<username>/Documents/M250/Activities/Unit12/Unit12_Project_1"); //needs editing

String pathname = OUFileChooser.getFilename(); //you can browse for README.TXT
System.out.println(pathname);

String pathname = OUFileChooser.getFilename("README.TXT"); //or set the path this way, depending on the current path
System.out.println(pathname);

//Create a file using the pathname found

File aFile = new File(pathname);
if (aFile.exists())
{
OUDialog.alert("A physical file exists!");
}
else
{
OUDialog.alert("No physical file exists!");
}

/*********************************************************/

//Activity 4 example 

//OUFileChooser.setPath("C:/Users/<username>/Documents/M250/Activities/Unit12/Unit12_Project_1"); //needs editing to match your path
String pathname = OUFileChooser.getFilename("poem.txt");

File aFile = new File(pathname);

try
{
  FileWriter aFileWriter = new FileWriter(aFile);
  aFileWriter.write("To be or not to be");
  aFileWriter.write(System.getProperty("line.separator"));
  aFileWriter.write("That is the question");
  aFileWriter.close();
  
  //This line may help you find the file you created....
  System.out.println("You just wrote to (and closed) the file " + aFile);
}
catch (Exception anException)
{
  System.out.println("Error" + anException);
}
