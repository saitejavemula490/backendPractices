package practiceJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private int  capacity;
    public LRUCache(int capacity) {
    	super( capacity,0.75f,true);
    	this.capacity=capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
    	return size()>capacity;
    }
	public static void main(String[] args) {
		LRUCache<String,Integer> hashMap = new LRUCache<>(3);
		
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		System.out.println(hashMap);
		hashMap.get("A");
		hashMap.put("D", 4);
		
		System.out.println(hashMap);
		

	}

}
