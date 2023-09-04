package exam;

import java.util.ResourceBundle;

public class ResourseEx {
    public static void main(String[] args) {
        ResourceBundle resourceBundle=ResourceBundle.getBundle("dmytro");
//        Iterator<String> iterator=resourceBundle.getKeys().asIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println(resourceBundle.getString("family"));
    }
}