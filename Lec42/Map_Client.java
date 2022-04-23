package Lec42;

public class Map_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 97);
		map.put("Puja", 69);
		map.put("Kunj", 78);
		map.put("Aman", 18);
		map.put("Anku", 18);
		map.put("Riya", 58);
		map.put("Nitin", 158);
		map.put("Nitin", 1);
		System.out.println(map);
		System.out.println(map.containsKey("Ram"));
		System.out.println(map.get("Ram"));
		System.out.println(map.remove("Nitin"));
		System.out.println(map.remove("Anku"));
		System.out.println(map);

	}

}
