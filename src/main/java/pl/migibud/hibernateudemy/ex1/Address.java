package pl.migibud.hibernateudemy.ex1;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "district",length = 50,nullable = false,unique = false)
	private String district;
	@Column(name = "state",length = 50,nullable = false,unique = false)
	private String state;
	@Column(name = "city",length = 50,nullable = false,unique = false)
	private String city;
	@Column(name = "street",length = 50,nullable = false,unique = false)
	private String street;
	@Column(name = "houseNumber",length = 30,nullable = false,unique = false)
	private String houseNumber;
	@Column(name = "numberOfApartment",length = 30,nullable = false,unique = false)
	private String numberOfApartment;




}
