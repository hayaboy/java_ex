package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("blue", 96);
		maps.put("hong", 86);
		maps.put("white", 92);
		
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
//		for(String key : maps) {
//			
//		}
		
		
		Set<Entry<String, Integer>> entries= maps.entrySet();
		
		for(Map.Entry<String, Integer>  entry :  entries  ) {
//			System.out.println(entry);
//			System.out.println(entry.getValue());
			
			int score=entry.getValue();
			
			
			if(score > maxScore) {
				name = entry.getKey();
				maxScore=entry.getValue();
			}
			
			totalScore +=  entry.getValue();
			
		}
		
		int avgScore = totalScore / maps.size();
		System.out.println("평균 점수: " + avgScore);

		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
		
		
//		System.out.println(entries);
		
		
//		Iterator iterator  = 	entries.iterator();
//		
//		
//		while(iterator.hasNext()) {
//			
//			//System.out.println(iterator.next());
//		}
		
		
	}

}
