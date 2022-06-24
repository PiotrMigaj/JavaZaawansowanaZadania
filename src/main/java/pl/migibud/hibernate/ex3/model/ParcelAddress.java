package pl.migibud.hibernate.ex3.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "parcel_addresses")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ParcelAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String country, city, street, zipCode;

    public ParcelAddress() {
    }

    public ParcelAddress(String country, String city, String street, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
