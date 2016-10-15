import java.util.HashMap;
import java.util.Map;

/**
 * Created by cx on 16/10/9.
 */
public class HashMapSingleton {

    public static Map<String, Object> singletonMap = new HashMap<String,Object>();

    public static HashMapSingleton hashMapSingleton = new HashMapSingleton();
    private HashMapSingleton(){

    }

    public static void setSingletonMap(String key,Object instance){
        if(!singletonMap.containsKey(key)){
            singletonMap.put(key, instance);
        }
    }

    public static Object getSingletonMap(String key){
        return singletonMap.get(key);
    }

    public static void main(String[] args){
        HashMapSingleton.setSingletonMap("single",HashMapSingleton.hashMapSingleton);
        HashMapSingleton singleton1 = (HashMapSingleton) HashMapSingleton.getSingletonMap("single");
        HashMapSingleton singleton2 = (HashMapSingleton) HashMapSingleton.getSingletonMap("single");
        System.out.println(singleton1);
        System.out.println(singleton2);
    }

}
