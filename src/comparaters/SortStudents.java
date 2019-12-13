package comparaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

class Student /*implements Comparable<Student>*/{
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
		return "<id="+this.id+",rollNo="+this.rollNo+",marks="+this.marks+">";
	}
	public int compareTo(Student o) {
		if(this.marks>o.marks)
			return -1;
		else if(o.marks>this.marks)
			return 1;
		else
			return 0;
	}
	@Override
		public int hashCode() {
			return 100;
		}
	@Override
		public boolean equals(Object obj) {
			Student obj1 = (Student)obj;
			if(this.marks==obj1.marks)
				return true;
			else
				return false;
		}
}
public class SortStudents {

	public static void main(String[] args) {
		/*Student students[] = new Student[5];
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
		System.out.println("=================");
		System.out.println(Arrays.toString(students));
		Collections.sort(li);
		System.out.println("=================");
		System.out.println(li);*/
		TreeMap<Student,Integer> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.marks - o2.marks;
			}
			
		});
		LinkedHashMap<Student, Integer> lhm = new LinkedHashMap<>();
		/*for(int i=0;i<5;i++) {
			Student st =  new Student(i, Integer.parseInt("09"+i), (int)((Math.random()*100)+1));
			tm.put(st,i);
			lhm.put(st,i);
		}*/
		lhm.put(new Student(1,9000,250), 1);
		lhm.put(new Student(2,10000,250), 2);
		lhm.put(new Student(3,9000,350), 3);
		System.out.println(lhm);
		System.out.println(tm);
		lhm.forEach((k,v)->{
			System.out.println(k.hashCode()+" "+v);
		});
		/*for(int i=0;i<students.length;i++) {
			System.out.println(students[i].toString()+" "+li.get(i).toString());
		}*/
	}

}
