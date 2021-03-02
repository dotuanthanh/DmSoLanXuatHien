import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

class myTreeMap<K, V> {
    public static void main(String[] args) {
        String[] Arr = {"THANH", "MINH", "TRANG", "PHUONG","THANH"};
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("thanh", 1);
        treeMap.put("eddy", 1);
        treeMap.put("google", 1);
        String[] newArr = new String[5];
        for (int i = 0; i < Arr.length; i++) {
            newArr[i] = Arr[i].toLowerCase(Locale.ROOT);
            if (treeMap.containsKey(newArr[i])) {
                int key = treeMap.get(newArr[i]);
              treeMap.put(newArr[i],++key);
            }
            else{
                treeMap.put(newArr[i],1);
            }
        }
        System.out.println(treeMap);
    }
}


