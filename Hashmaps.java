import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args){

        //Theme: HashMap


        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        //map.put("orange", 0.5550);
        //map.remove("apple");
        //System.out.println(map.get("apple"));
        //System.out.println(map.containsKey("pineapple"));
        //System.out.println(map.containsValue(1.00));
        //System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
