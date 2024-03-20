package jungsuk.ch11_3;

import java.util.Comparator;

public class BanNoAscending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Student && o2 instanceof Student) {
			Student stu1=(Student)o1;
			Student stu2=(Student)o2;
			
			int ban1=stu1.ban;
			int ban2=stu2.ban;
					
			int result =ban1 - ban2;
			
			if(result==0) {
				int no1=stu1.no;
				int no2=stu2.no;
						return no1-no2;
			}
			
			
			return result;
		}
		
		return -1;
	}

}
