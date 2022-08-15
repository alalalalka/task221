package hiber.model;



import javax.persistence.*;

@Entity
@Table(name = "cars")

public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    @MapsId
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public User setUser(User user){
        this.user = user;
        return user;
    }

    public User getUser() {
        return user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
