import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.directory();
        phoneDirectory.get("соболева");
        String [] arr = {"собака","котик","попугай","лошадка","котик","хомяк","попугай"};
        System.out.print("Первоначальный массив: ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" [" + arr[i] + "] ");
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
            System.out.println();
            System.out.println("Встречается каждое слово: " + map );
            Set <String> set = new HashSet<>(Arrays.asList(arr));
            System.out.println("Уникальное значение: "+ set);
    }
}




