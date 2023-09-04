package data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    static List<String> name =new ArrayList<>();
    public static List<String> getValidNames(){
        name.clear();
        name.add("Dmytro");
        name.add("Oleg");
        return name;
    }

    public List<String> getNoValidNames(){
        name.clear();
        name.add("asdasd");
        name.add("asdasd");
        return name;
    }
    public static List<String> getCertNoValid(){
        name.clear();
        name.add("mkldnsvfklj");
        name.add("Nihja67723i3n");
        return name;
    }
}
