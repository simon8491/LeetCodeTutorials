import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MinIndexSum {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list = new HashMap<>();    //in this case, the key must be the string from the list and value must 
                                                        //be the integer for next operations with the output list
            for (int i = 0; i < list1.length; i++) {
                list.put(list1[i], i);
            }                                            
        ArrayList<String> outputList = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

            for (int i=0; i<list2.length; i++) {
                if(list.containsKey(list2[i])) {
                    if(minSum > i + list.get(list2[i])) { //minSum > 0 + 1 in the first step
                                                        //minSum > 1 + 0 in the second step
                                                        //minSum > 2 + 2 in the third step
                        minSum = i + list.get(list2[i]);//change MAX_VAL to 1
                        outputList.clear();
                        outputList.add(list2[i]);
                    } else if ( minSum == i+list.get(list2[i])) {
                        outputList.add(list2[i]);
                    }
                }
            }
        return outputList.toArray(new String[outputList.size()]);
    }
}