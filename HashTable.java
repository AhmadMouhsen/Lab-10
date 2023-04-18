package lab10;
import java.util.*;
import java.io.*;

public class HashTable {
	
	public class Student{
      	public String name;
      	public int hashCode;
      	public Student(String name) {
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
    
    	public void add(Student student) {
			Resize();
			int index = getIndex(student);
			if (table[index] == null) {
				table[index] = student;
				size++;
			} else {
				// linear probing
				while (table[index] != null && !table[index].equals(student)) {
					index = (index + 1) % table.length;
				}
				if (table[index] == null) {
					table[index] = student;
					size++;
				}
			}
		}
    
    	public Object Find(){
       
    	}
   
	
	public static void main(String args[]) {
		HashTable ht = new HashTable();
		File f = new File("StudentsNames.txt");
		ht.readFile(f);
	}
	
}
