package com.kh.example.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackComparator;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		HashMap<String, Snack> map = new HashMap<String, Snack>(); // <Key, Value>, Key 타입은 String형으로 주로 사용
		
		// put(K key, V value):V     키와 값을 추가
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500)); // 값 중복저장 가능
		map.put("고소미", new Snack("고소한맛", 1000));
		System.out.println(map); // Key와 Value '='으로 연결되어 출력, 순서유지 x
		map.put("새우깡", new Snack("매운맛", 1500)); 
		System.out.println(map); // Key값은 Set방식, 중복 저장 x -> 기존 객체에 덮어씌워짐
	
		// containskey(Object key):boolean       해당 Key가 있는지 확인
		// containsValue(Object Value):boolean  해당 Value가 있는지 확인
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		// equals메소드 오버라이딩 전 : false 출력 -> new로 객체 새로 생성되어 주소값이 다른 걸로 인식
		
		// get(Object key):V       키에 해당하는 값 반환
		// Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		System.out.println(map.get("다이제")); // Key값인 "다이제"와 매핑된 Value값이 반환됨
		System.out.println(map.get("홈런볼"));
		
		// values():Collection<V>    모든 value를 Collection에 담아 반환
		System.out.println(map.values());
		
		// keySet():Set<k>    Returns a Set view of the keys contained in this map.
		Set<String> set1 = map.keySet();  // 제네릭 필요, Key값의 자료형인(으로 설정한) String으로 제네릭 붙임
		System.out.println(set1); // Key값만 뽑아옴
		Iterator<String> it1 = set1.iterator(); // Returns an iterator over the elements in this set. The elements arereturned in no particular order 
		while (it1.hasNext()) { // 다음 요소(element)가 있으면 true 반환
			String key = it1.next(); // iteration(구분자)의 다믐 요소(element)를 반환, String으로 제네릭되어 있어 String형인 Key값 반환(요소 하나씩)
			System.out.println(key + "-" + map.get(key)); // key값이랑 매핑된 Value값 가져올 수 있음
		}
		
		
		// entrySet():Set<Map.Entry<K,V>>    entry(key와 value)들을 모아 set으로 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
		System.out.println(set2);
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>(); // Key기준으로 정렬됨
		map2.putAll(map);
		System.out.println(map2); // 오름차순으로 정렬됨, Key 기준으로 정렬 -> 
		                          // Key 타입인 String에 있는 정렬 기준으로 정렬됨
		
		
		TreeMap<String, Snack> map3 = new TreeMap<String, Snack>(new SnackComparator());
		map3.putAll(map2);
		System.out.println(map3);
	
		// remove(Object key):V      해당 Key의 entry 삭제 후 해당 값 반환
		System.out.println(map3.remove("다이제"));
		System.out.println(map3);
		// remove(Object key, Object value):boolean
		System.out.println(map3.remove("고소미", new Snack("고소한 맛", 1000))); // key값 value값 매칭되면 삭제 후 true반환/ 아니면 삭제 x, false 반환
		System.out.println(map3);
		System.out.println(map3.remove("고소미", new Snack("고소한 맛", 1500)));
		System.out.println(map3);
		
		// clear():void        모든 entry 삭제
		// isEmpty():boolean   map이 비어있는지 확인
		map3.clear();
		System.out.println(map3);
		System.out.println(map3.isEmpty());
	}
	
	public void doProperties() {
		// Properties : key와 value의 타입을 String으로 제한
		Properties prop = new Properties(); // String으로 타입이 제한되어 있기 때문에 제네릭 안 붙여줘도 노란 줄 안 뜸
//		prop.put(1, 10); // Properties의 부모클래스인 Hashtable의 put메소드
//		System.out.println(prop);
		
		// setProperty(String key, String value):Object    Properties에 데이터 추가
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망"); // 키 중복저장 안됨, 덮어 씌워짐
		System.out.println(prop);
		
		
		// getProperty(String key):String						Key를 통해 value반환
		// getProperty(String key, String defaultValue):String	Key를 통해 value반환, 해당 key가 없으면 defaultValue반환 	
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과")); // key 중 "견과"와 일치하는 key데이터 x -> null 반환
		System.out.println(prop.getProperty("채소", "땅콩")); // key에 "채소"가 있기 때문에 채소에 해당하는 value "피망" 반환
		System.out.println(prop.getProperty("견과", "땅콩"));
		System.out.println(prop.getProperty("야채", "야채는 없어요")); // 해당 key가 없으면 null대신 지정한 문자열 반환
	}
	
	
}	
