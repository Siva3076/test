import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sam {
public static void main(String[] args) {
	HashMap<Integer, String> hash= new HashMap<>();
	hash.put(1, "Siva");
	hash.put(2, "Subbu");
	hash.put(3, "Sisu");
	hash.put(4, "Manyam");
	//System.out.println(hash.entrySet());	
	//System.out.println(hash.get(3));
	//System.out.println(hash.keySet());
	//System.out.println(hash.values());
	for (Map.Entry str : hash.entrySet()) {
		System.out.println(str.getValue());
	}
}
}
