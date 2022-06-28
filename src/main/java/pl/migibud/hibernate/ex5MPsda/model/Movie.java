package pl.migibud.hibernate.ex5MPsda.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title,director;

	public Movie() {
	}

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public void addActor(Actor actor){
		actors.add(actor);
		actor.getMovies().add(this);
	}

	@ManyToMany(mappedBy = "movies")
	private Set<Actor> actors = new HashSet<>();

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", title='" + title + '\'' +
				", director='" + director + '\'' +
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
		Movie movie = (Movie) o;
		return Objects.equals(id, movie.id) && Objects.equals(title, movie.title) && Objects.equals(director, movie.director);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, director);
	}
}
