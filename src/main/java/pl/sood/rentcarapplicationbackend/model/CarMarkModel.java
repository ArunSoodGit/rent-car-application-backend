package pl.sood.rentcarapplicationbackend.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "marka_model")
public class CarMarkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelu")
    private int id;
    @Column(name = "marka")
    private String mark;
    @Column(name = "model")
    private String model;

    @OneToMany(mappedBy = "carMarkModel")
    private Set<Car> cars;



    @ManyToOne()
    private CarClass carClass;

    public CarClass getCarClass() {
        return carClass;
    }
    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public CarMarkModel(String mark, String model) {

        this.mark = mark;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarMarkModel{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +

                ", carClass=" + carClass +
                '}';
    }

    public CarMarkModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
