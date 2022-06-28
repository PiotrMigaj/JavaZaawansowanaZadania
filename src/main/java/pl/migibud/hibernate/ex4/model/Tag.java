package pl.migibud.hibernate.ex4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags")
@Getter
@Setter
public class Tag {

	public Tag() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@ManyToMany(mappedBy = "tags")
	private Set<Article> articles = new HashSet<>();

	public Tag(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
