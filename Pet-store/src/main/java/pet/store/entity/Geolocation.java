package pet.store.entity;
import java.math.BigDecimal;

import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Geolocation {
	
	@Embedded
	@Data
	@NoArgsConstructor
	private BigDecimal latitude;
	private BigDecimal lontitude;
	
public Geolocation (Geolocation geolocation) {
	this.latitude = geolocation.latitude;
	this.lontitude = geolocation.lontitude;
}

 {

}
