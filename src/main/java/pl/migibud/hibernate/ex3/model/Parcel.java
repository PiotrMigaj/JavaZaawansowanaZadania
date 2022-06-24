package pl.migibud.hibernate.ex3.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "parcels")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private ParcelAddress parcelAddress;

    private String warehouse;
    private int price;

    public Parcel() {
    }

    public Parcel(String warehouse, int price) {
        this.warehouse = warehouse;
        this.price = price;
    }
}
