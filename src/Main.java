import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1111));
        buses.add(new Bus(2222));

        buses.get(0).load(new Passenger("Вася", 22, 62));
        buses.get(0).load(new Passenger("Петя", 23, 50.5));
        buses.get(0).load(new Passenger("Алина", 19, 50));

        buses.get(1).load(new Passenger("Наташа", 24, 80));
        buses.get(1).load(new Passenger("Катя", 29, 47.4));
        buses.get(1).load(new Passenger("Юля", 46, 71.5));
        buses.get(1).load(new Passenger("Семен", 71, 59));

        buses.add(new Bus(3333));

        buses.sort(Comparator.comparingDouble(Bus::getTotalWeight));
//        System.out.println(buses);
        for (Bus b: buses ) {
            System.out.println(b);
            System.out.println(b.getTotalWeight());
        }

        System.out.println("-----------------------------");
        buses.sort(Comparator.comparingDouble(Bus::countMedianeWeightOfPas));
        for (Bus b: buses ) {
            System.out.println(b);
            System.out.println(b.countMedianeWeightOfPas());
        }
    }
}