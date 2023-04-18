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
	private int size = 0;
	
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
    /**

	Adds a student object to the hash table
	If the hash table is full, calls the Resize method to resize the table
	Uses linear probing for collision resolution
	@param student the student object to be added
		 */
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
		
	/**

	Calculates the hash value of the given student object and returns the index for the hash table
	If the index is negative, adds the table length to the index
	@param student the student object to calculate hash value for
	@return the index for the hash table
		 */
		private int getIndex(Student student) {
			int hashCode = student.hashCode();
			int index = hashCode % table.length;
			if (index < 0) {
				index += table.length;
			}
			return index;
		}
    
    	public Object Find(){
       
    	}
   
	
	public static void main(String args[]) {
		HashTable ht = new HashTable();
		File f = new File("StudentsNames.txt");
		ht.readFile(f);
	}
	
}
