package lab10;
import java.util.*;
import java.io.*;

public class HashTable {
	
	public class student{
      	public String name;
      	public int hashCode;
      	public student(String name) {
        	this.name = name;
        	//Generate the hash code from and store here
      	}
	
	Object[] table = new Object[500];
	
	boolean readFile(File filename) {
		Scanner sc = new Scanner(System.in);
		String key = new String();
		try {
			sc = new Scanner(filename);
		}
		catch (Exception e) {
			System.err.println(e.toString());
			return false;
		}
		while (sc.hasNextLine()) {
			key = sc.nextLine();
			hash(key);
		}
		return true;
	}
	
	boolean hash(String key) {
		//hashing code here
		return true;
	}
	
	
	public void Resize() {
   
    	}
    
    	public void Add()[
        
    	}
    
    	public Object Find(){
       
    	}
   
	
	public static void main(String args[]) {
		HashTable ht = new HashTable();
		File f = new File("StudentsNames.txt");
		ht.readFile(f);
	}
	
}
