package kodlama.io.DevsAndTech.business.abstracts;

import java.util.List;

import kodlama.io.DevsAndTech.business.requests.AddTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateTechnologyRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllTechnologyResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdTechnologyResponse;

public interface TechnologyService {
	
	List<GetAllTechnologyResponse> getAll() throws Exception;
	
	GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception;
	
	void add(AddTechnologyRequest addTechnologyRequest) throws Exception;
	
	void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception;
	
	void delete( DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;
	

}
