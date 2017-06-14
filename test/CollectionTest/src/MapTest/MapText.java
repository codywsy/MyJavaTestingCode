package MapTest;
import java.util.*;

public class MapText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		// 输入数据
		map.put("01", "李同学");
		map.put("03", "吴同学");
		map.put("02", "魏同学");
		map.put("00", "张同学");
		Set<String> set = map.keySet();
		Iterator it = set.iterator();
		System.out.println("HashMap 类实现的 Map 集合，无序");
		while(it.hasNext()){
			String str = (String)it.next();
			String name = (String)map.get(str);
			System.out.println(str + " " + name);
		}
		
		//有序，TreeMap
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.putAll(map);
		it = treemap.keySet().iterator();
		System.out.println("TreeMap 类实现的 Map 集合，有序");
		while(it.hasNext()){
			String str = (String)it.next();
			String name = treemap.get(str);
			System.out.println(str + " " + name);
		}
		
	}

}
