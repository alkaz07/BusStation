import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Bus {
    private int number;
    private ArrayList<Passenger> pasList = new ArrayList<>();

    public void load(Passenger pas){
        pasList.add(pas);
    }

    public Bus(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number=" + number +
                ", pasList=" + pasList +
                '}';
    }

    public double getTotalWeight(){
        /*double sum=0;
        for (Passenger p: pasList) {
            sum += p.getWeight();
        }
        return sum;*/
        return pasList.stream().mapToDouble(Passenger::getWeight).sum();
    }

    public double countMedianeWeightOfPas(){
        double m = 0;
        //List<Passenger> a = this.pasList;
        //a.sort(Comparator.comparingDouble(Passenger::getWeight));
        //превратим список пассажиров в список их весов
        List<Double> b = new ArrayList<>();
        for (Passenger pas: pasList) {
            b.add(pas.getWeight());
        }
        //отсортируем список весов
        b.sort(Comparator.naturalOrder());
        //берем серединку списка
        if (b.size()>0) {
            if (b.size() % 2 == 0) {
                m = (b.get(b.size() / 2) + b.get(b.size() / 2 - 1)) / 2.0;
            } else
                m = b.get(b.size() / 2);
        }
        return m;
    }
}
