package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap l=new LinkedHashMap();
		l.put("语文",99);
		l.put("数学", 98);
		l.put("英语", 97);
		System.out.println(l);
		System.out.println(l.keySet());//获取key  [语文, 数学]
		System.out.println(l.get("语文"));//返回指定key所对应的value   99
		System.out.println(l.isEmpty());//判断是否为空
		System.out.println(l.size());//返回Map中的对数
		//遍历输出key--value
		for(Object o:l.keySet()){
			System.out.println(o+"--"+l.get(o));//l.get(o)为获取对应key的value值
		}
		l.remove("语文");
		System.out.println(l.keySet());
		l.clear();
		System.out.println(l.isEmpty());
	}

}
