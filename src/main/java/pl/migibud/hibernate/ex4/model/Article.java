package pl.migibud.hibernate.ex4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articles")
@Getter
@Setter
public class Article {

	public Article() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title, content;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "articles_tags",
			joinColumns = @JoinColumn(name = "articles_id"),
			inverseJoinColumns = @JoinColumn(name = "tags_id")
	)
	private Set<Tag> tags = new HashSet<>();

	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public void addTag(Tag tag){
		tags.add(tag);
		tag.getArticles().add(this);
	}

	public void removeTag(Tag tag){
		tags.remove(tag);
		tag.getArticles().remove(this);
	}

	@Override
	public String toString() {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
