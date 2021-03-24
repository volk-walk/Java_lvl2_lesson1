import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    Map <String,String> map = new HashMap<>();
    public void directory (){
        map.put("Соболева","89370627070 , 35955056950");
        map.put("Соловьев","8931779999");
        map.put("Журавлёв","8935433656");
        map.put("Гусев","89963627080");
        System.out.println(map);
    }
    public void add (String name,String numbers){
        map.put(name,numbers);
    }
    public String get (String name){
        for (Map.Entry<String,String> o :map.entrySet()) {
            if(name.equalsIgnoreCase(o.getKey())){
                System.out.println("Номер телефона "+name+" :"+ o.getValue());
                return o.getValue();
            }

        }
        return map.get(name);
    }
}
