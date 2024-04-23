package CollectionExample;

import java.util.Collection;
import java.util.HashSet;

public class CollectionDriver {
public static void main(String [] args) {
	//where should i store this. Collection is an interface.
	Collection cl = new HashSet();
	Student st1= new Student("Shiva",99);
	Student st2 = new Student("Anjaynay",100);
	Student st3 = new Student ("Kartik",95);
	Student st4 = new Student("Roman",89);
	Student st5= new Student("Divu",67);
	cl.add(st1);
	cl.add(st2);
	cl.add(st3);
	cl.add(st4);
	cl.add(st5);
	
	//We should print the name of student who has highest marks.
	for(Object strs : cl) {
		System.out.println();
	}
}
}
