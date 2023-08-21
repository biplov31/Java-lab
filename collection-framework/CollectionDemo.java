// collection addresses two limitations of an array; same data type and unchangeable size
import java.util.List; 

public class CollectionDemo{
	public static void main(String[] args){
		// List allows duplicate values
		// ArrayList names = new ArrayList();
		ArrayList<String> names = new ArrayList<String>();		
		names.add("Radha");
		names.add("Krishna");
		String name3 = "Radha";
		names.add(name3);
		// names.get(1);
		// names.remove(1); 
		
		// Hash does not allow duplication. data is unique and sorted. name6 overrides name4
		HashSet<String> otherNames = new HashSet<String>();
		String name4 = "Radha";
		otherNames.add(name4);
		String name5 = "Krishna";
		otherNames.add(name5);
		String name6 = "Radha";
		otherNames.add(name6);
		String name7 = "Hari";
		otherNames.add(name7);
		// LinkesHashSet preserves the insertion order [Radha, Krishna, Hari]
		
		// With map we can store data in key-value pair.
		HashMap<Integer, String> studentInfo = new HashMap<Integer, String>();
		studentInfo.put(5, "Radha");
		studentInfo.put(3, "Ram");
		studentInfo.put(10, "Hari");
		// LinkedHashMap preserves the insertion order
		
		studentInfo.forEach((key, value) -> {
			System.out.println(key + " " + value);
		})
		
		System.out.println(studentInfo);
	}
}