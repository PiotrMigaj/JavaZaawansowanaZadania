package pl.migibud.hibernate.ex5MPsda.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "actors")
@Getter
@Setter
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name,lastName;

	private Double rating;

	public Actor() {
	}

	public Actor(String name, String lastName, Double rating) {
		this.name = name;
		this.lastName = lastName;
		this.rating = rating;
	}

	public void addMovie(Movie movie){
		this.movies.add(movie);
		movie.getActors().add(this);
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "actors_movies",
			joinColumns = @JoinColumn(name = "actors_id"),
			inverseJoinColumns = @JoinColumn(name = "movies_id")
	)
	private Set<Movie> movies = new HashSet<>();

	@Override
	public String toString() {
		return "Actor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", rating=" + rating +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Actor actor = (Actor) o;
		return Objects.equals(id, actor.id) && Objects.equals(name, actor.name) && Objects.equals(lastName, actor.lastName) &&
				Objects.equals(rating, actor.rating);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, lastName, rating);
	}
}
