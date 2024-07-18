package co.simplon.matchmydev.profiles.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
abstract class AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	AbstractEntity() {

	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		// prevent from accidental assignement(set by DB)
		this.id = id;
	}

}
