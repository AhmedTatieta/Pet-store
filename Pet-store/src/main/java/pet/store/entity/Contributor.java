package pet.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Contributor {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long contributorId;
	private String contributorName;
	@Column (unique = true)
	private string contributorEmail;
	@EqualsAndHashCode.Exclude
	@ToString.Exclude 
	@OneToMany (mappedBy =  "contributor" cascade = CascadeType.ALL)

private Set<PetStore> Petstore = new  HashSet<>(); 
}
{

}
