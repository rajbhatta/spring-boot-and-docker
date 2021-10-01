package raj.ecs.springbootdocker.modal;

public class House {
    private int id;
    private String name;
    private float cost;
    private String location;

    public House(int id, String name, float cost, String location) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }


}
