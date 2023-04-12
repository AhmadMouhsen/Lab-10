package lab10;
import java.util.*;
import java.io.*;

public class HashTable {

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
	
	public static void main(String args[]) {
		HashTable ht = new HashTable();
		File f = new File("StudentsNames.txt");
		ht.readFile(f);
	}
	
}
