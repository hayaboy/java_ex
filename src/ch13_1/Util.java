package ch13_1;

public class Util {
	
	
//	static <K,V> V  getValue(Pair<K,V> p, K k) {
//		
//		if(p.getKey()==k) {
//			return p.getValue();
//		}else {
//			return null;
//		}
//		
//		
//	}
	
	
static <P extends Pair<K,V>, K, V> V  getValue(Pair<K,V> p, K k) {
		
		if(p.getKey()==k) {
			return p.getValue();
		}else {
			return null;
		}
		
		
	}
	

}
