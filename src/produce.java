public class produce {
    String name;
    String ID;
    double price;

    public produce(String ID) {
        this.ID = ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
