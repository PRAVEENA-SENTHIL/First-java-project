import java.io.File;
import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class javafile {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		String str=cal.getTime().toString();
		// TODO Auto-generated method stub
		 try {
	            File Obj = new File("myfile.txt");
	            if (Obj.createNewFile()) {
	                System.out.println("File created: "
	                                   + Obj.getName());
	            }
	            else {
	            	Scanner Reader=new Scanner(Obj);
	            	
	            		while(Reader.hasNextLine())
	            		{
	            		  String name=Reader.next();
	            		  String num=Reader.next();
	            		  
	            		  String regex="[7-9]{1}[0-9]{9}";
	            		  if(num.matches(regex)==true)
	            		  {
	            			  File myfile=new File(name+".txt");
	            			  FileWriter a=new FileWriter(myfile);
	            			  a.write(str);
	            			  a.close();  
	            		  }
	            		  
	            		}
	            	}
	                //System.out.println("File already exists.");
	                
	            
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }

	}

}
