package comparaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	int rollNo;
	int marks;
	public Student(int id,int rollNo,int marks) {
		this.id = id;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[id="+this.id+",rollNo="+this.rollNo+",marks="+this.marks+"]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.marks>o.marks)
			return 1;
		else if(o.marks>this.marks)
			return -1;
		else
			return 0;
	}
	
}
public class SortStudents {

	public static void main(String[] args) {
		Student students[] = new Student[5];
		List<Student> li = new ArrayList<Student>();
		for(int i=0;i<students.length;i++) {
			students[i] = new Student(i, Integer.parseInt("0700"+i), (int)((Math.random()*100)+1));
			li.add(students[i]);
			System.out.println(students[i].toString());
		}
		Comparator<Student> marksComp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.marks - o2.marks;
			}
			
		};
		Arrays.sort(students, marksComp);
		Collections.sort(li);
		System.out.println(li);
		for(Student s:students) {
			System.out.println(s.toString());
		}
		/*for(int i=0;i<students.length;i++) {
			System.out.println(students[i].toString()+" "+li.get(i).toString());
		}*/
	}

}
