package pl.migibud.hibernate.ex6;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "projects")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Project implements Serializable {

	public Project() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String name;
	private Date creationDate;

	public Project(String name, Date creationDate) {
		this.name = name;
		this.creationDate = creationDate;
	}
}
