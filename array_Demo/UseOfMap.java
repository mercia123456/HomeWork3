package array_Demo;

import com.sun.tools.javac.comp.Enter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.prefs.PreferenceChangeEvent;

public class UseOfMap {
    public static void main(String []args){
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"New YOrk");
        map.put(2,"Mexico");
        map.put(3,"California");
        for (Map.Entry<Integer,String>city : map.entrySet()){


            System.out.println(city.getKey()+"->"+city.getValue());
            System.out.println(map.get(3));
        }
    }
}
