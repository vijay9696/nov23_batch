package collectionframeworkinjava;

import java.util.ArrayList;

public class SoreObjectInArrayListExample {
	ArrayList<Student> studentData()
	{
		Student s1=new Student("Abhay",1,101);
		Student s2=new Student("Bhabupratap",2,102);
		Student s3=new Student("Chandrakant",3,103);
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		return studentList;
		
	}
}
