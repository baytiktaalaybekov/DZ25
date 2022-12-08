import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,Auto> map = new HashMap();
        map.put(new Car(1111111,001),new Auto(2001,"AMG",1200,"white"));
        System.out.println(map.entrySet());


    }
}