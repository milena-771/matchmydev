package co.simplon.matchmydev.profiles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "contract_types")
public class ContractType extends AbstractEntity {

	@Column(name = "name")
	private String name;

	public ContractType() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ContractType [name=" + name + "]";
	}

}
