import java.util.Stack;

public class StackedBus {
    int number;

    public StackedBus(int number) {
        this.number = number;
    }

    Stack<Passenger> pasStack= new Stack<>();

    public void load(Passenger pas){
        pasStack.push(pas);
    }

    public Passenger getNextPassenger(){
        return pasStack.pop();
    }

    public boolean isEmpty(){
        return pasStack.isEmpty();
    }

    @Override
    public String toString() {
        return "StackedBus{" +
                "number=" + number +
                ", pasStack=" + pasStack +
                '}';
    }
}
