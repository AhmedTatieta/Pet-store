package pet.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class PetStore {
	@Id
	@GeneratedValue (strategy = Generation Type.IDENTITY)
	private Long PetstoreId;
	private String storeName;
	private String directions;
	private String stateOrProvince;
	private String country;
	
	@Embedded
	private Geolocation geolocation;
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "contributor_Id", nullable = false)
	private Contributor contributor;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "pet_store_amenity")
	JoinColumn = @JoinColumn(name = "Pet_store_id")
	inverseJoinColumn = @JoinColumn(name = "amenity_id")
     
	private Set<Amenity> amenities = new HashSet<>(); 
}
 {

}
