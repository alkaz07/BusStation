public class SmartPassenger extends Passenger {
    public SmartPassenger(String name, int age, double weight) {
        super(name, age, weight);
    }

    private Bus currentBus = null;

    public Bus getCurrentBus() {
        return currentBus;
    }

    public void stepInto(Bus b) {
        if (currentBus == null) {
            currentBus = b;
            b.load(this);
        }
    }

    public void stepOut() {
        if (currentBus != null) {
            currentBus.unload(this);
            currentBus = null;
        }
    }

    public void transitTo(Bus bus) {//пересадка
        stepOut();
        stepInto(bus);
    }
}
