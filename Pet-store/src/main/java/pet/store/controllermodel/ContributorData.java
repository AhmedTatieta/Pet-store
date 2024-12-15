package pet.store.controllermodel;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import pet.store.entity.Amenity;
import pet.store.entity.Contributor;
import pet.store.entity.Geolocation;
import pet.store.entity.PetPark;
@Data

public class ContributorData {

	private Long contributorId;
	private String contributorName;
	private string contributorEmail;
	private Set<PetStore> Petstore = new  HashSet<>(); 
	
	@Value
public class PetStoreResponse

    private Long PetstoreId;
    private String storeName;
    private String directions;
    private String stateOrProvince;
    private String country;
    private Geolocation geolocation;
    private Set<String> amenities = new HashSet<>(); 
}
 {

}
