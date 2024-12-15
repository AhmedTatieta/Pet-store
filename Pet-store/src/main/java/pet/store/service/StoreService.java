package pet.store.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pet.store.controller.model.ContributorData;
import pet.store.entity.Contributor;

@Service

public class StoreService  

@Autowired
private ContributorDao contributorDao 

@Transactional(readonly = false)
public ContributorData insertContributor(ContributorData contributorData){
   Long contributorId = contributorData.getContributorId();
   Contributor contributor; 

  if (Objects.isNull(contributorId)) {
	  contributor = new Contributor(); }
  
  else {
	  
    contributor = findContributorById(contributorId);
    { 
  }
    
private Contributor findContributorById (Long contributorId) {
	return Contributor.findById(ContributorId);
	or ElseThrow() -> new NoSuchElementException)
  "Contributor with ID" + ContributorId + "was not found")); 
	
}
  @Transactional(readonly= true)
public List<contributorData> retrieveAllContributors() {
	List<Contributor> contributors = ContributorDao.findAll();
	List<ContributorData> response = new LinkedList<> ();
	for (contributor Contributor: Contributors) {
   response.add(new ContributorData (contributor)); 
	}
	return response; 
	
Retrieving PetStore
@Transactional(readOnly= true)
public PetStoreData retrieve PetStoreById( Long contributorId, Long StoreId)
find contributorById(contributorId);
PetStore petstore = findPetstoreById(StoreId);

   if(petStore.getContributor().getContributorId() != contributorId) {
	   throw new IllegalStateException( "PetStore with ID=" + StoreId +
			   "is not owned by contributor with ID=" + contributorId);
	   
	   return new PetStoreData(petStore); 
   }


}
  

{

}
