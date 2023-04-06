package collectionframeworkinjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ShowAllStudentData {

	public static void main(String[] args) {
		SoreObjectInArrayListExample obj=new SoreObjectInArrayListExample();
		ArrayList<Student> studObj=obj.studentData();
		
		for(Student stud:studObj)
		{
			System.out.println(stud.name);
			System.out.println(stud.rollNo);
			System.out.println(stud.id);
		}

	}

}
