public class Car {
    private int Id;
    private int numberAuto;

    public Car(int id, int numberAuto) {
        Id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
