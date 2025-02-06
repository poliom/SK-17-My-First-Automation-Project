package Lecture7;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Lecture7 {
    public static void main(String[] args) {
        //demoHashMapOperations();
        demoHashSetOperations();
    }

    public static void demoHashMapOperations(){
        HashMap<Integer ,String> foodMap = new HashMap<>();

        foodMap.put(1, "Chips");
        foodMap.put(2, "Banana");
        foodMap.put(3, "Ice-cream");
        foodMap.put(4, "Peanuts");

        System.out.println("This is our food HashMap: "+foodMap);

        foodMap.clear();
        System.out.println("This is our food map after clear: "+foodMap);

        System.out.println("Is the food map empty: " +foodMap.isEmpty());

        System.out.println("Adding the key value pairs again");
        foodMap.put(1, "Chips");
        foodMap.put(2, "Banana");
        foodMap.put(3, "Ice-cream");
        foodMap.put(4, "Peanuts");

        System.out.println("Is the food map empty: " +foodMap.isEmpty());

        System.out.println("Do we have Banana in our food map: "+foodMap.containsValue("Banana"));
        System.out.println("Do we have 5 key in our food map: "+foodMap.containsKey(5));

        System.out.println("Food map after remove key 3: "+foodMap.remove(3));
        System.out.println("This is our food HashMap: "+foodMap);

        System.out.println("Food map after remove key 2 and value Banana: "+foodMap.remove(2, "Banana"));
        System.out.println("Food map after remove key 2 and value Banana: "+foodMap.remove(2, "Banana"));
        System.out.println("This is our food HashMap: "+foodMap);

        System.out.println("Entry Set of food map: "+foodMap.entrySet());

        System.out.println("Key set of food map: "+foodMap.keySet());

        foodMap.putIfAbsent(3, "Banana");
        System.out.println("This is our food HashMap: "+foodMap);
        foodMap.putIfAbsent(3, "BananaS");
        System.out.println("This is our food HashMap: "+foodMap);

        foodMap.put(1, "Tortila Chips");
        System.out.println("This is our food HashMap: "+foodMap);

        System.out.println("This is value of key 4 of our food HashMap: "+foodMap.get(4));

        System.out.println("This is value or the default value of key 5 of our food HashMap: "
                + foodMap.getOrDefault(5,"Default value"));

        System.out.println("This is value of key 5 of our food HashMap: "+foodMap.get(5));

        System.out.println("This is value or the default value of key 3 of our food HashMap: "
                + foodMap.getOrDefault(3,"Default value"));

        System.out.println("This is values of our food Hashmap: "+ foodMap);

        System.out.println("Replace key 4 of our food Hashmap: "+ foodMap.replace(4,"Apples"));
        System.out.println("This is values of our food Hashmap: "+ foodMap);

        System.out.println("Replace key 4 of our food Hashmap: "+ foodMap.replace(4,"Peanuts","Apples"));
        System.out.println("This is values of our food Hashmap: "+ foodMap);

        System.out.println("Replace key 4 of our food Hashmap: "+ foodMap.replace(4,"Apples","Peanuts"));
        System.out.println("This is values of our food Hashmap: "+ foodMap);

        Object cloneMap = foodMap.clone();
        System.out.println("Clone map key values: " + cloneMap);

        Collection<String> valuesCollection = foodMap.values();
        System.out.println("This is all values of foodMap in collection: "+ valuesCollection);

        for(Integer key : foodMap.keySet()){
            System.out.println("This is the value on " +key+ ": "+foodMap.get(key));
        }
    }

    public static void demoHashSetOperations(){
        HashSet<String> foodSet = new HashSet<>();
        foodSet.add("Banana");
        foodSet.add("Chips");
        foodSet.add("Soda");
        foodSet.add("Peanuts");
        System.out.println("This is our foodSet: "+foodSet);
        System.out.println("Removed Soda from foodSet: "+foodSet.remove("Soda"));
        System.out.println("This is our foodSet: "+foodSet);
        System.out.println("Removed Soda from foodSet: "+foodSet.remove("Soda"));
        System.out.println("This is our foodSet: "+foodSet);
        foodSet.add("Water");
        System.out.println("This is our foodSet: "+foodSet);

        foodSet.add("Soda");
        System.out.println("This is our foodSet: "+foodSet);

        for(String item:foodSet){
            System.out.println("This is food from foodSet: "+item);
        }
    }
}
