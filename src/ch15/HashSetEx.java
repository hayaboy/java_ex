package ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));

		System.out.println(set.size());

		for (Student s : set) {
			System.out.println(s.studentNum + s.name);
		}
	}

}
