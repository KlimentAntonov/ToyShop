public class Toy_Orders {
    long id;
    long id_toy;
    long id_order;
    int quantity;

    public Toy_Orders() {
    }

    public Toy_Orders(long id, long id_toy, long id_order, int quantity) {
        this.id = id;
        this.id_toy = id_toy;
        this.id_order = id_order;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_toy() {
        return id_toy;
    }

    public void setId_toy(long id_toy) {
        this.id_toy = id_toy;
    }

    public long getId_order() {
        return id_order;
    }

    public void setId_order(long id_order) {
        this.id_order = id_order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
