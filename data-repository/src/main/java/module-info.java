import com.bigcorp.project.data.contract.AddressService;
import com.bigcorp.project.data.repository.AddressServiceImpl;

/**
 * Référentiel de données pour les utilisateurs personnes physiques
 * @provides AddressService
 */
module com.bigcorp.project.data.repository{
	
	requires transitive com.bigcorp.project.data.contract;
	
	exports com.bigcorp.project.data.model;
	exports com.bigcorp.project.data.repository;
	
	provides AddressService with AddressServiceImpl;
}