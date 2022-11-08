package kodlama.io.DevsAndTech.business.abstracts;

import java.util.List;

import kodlama.io.DevsAndTech.business.requests.AddLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateLanguageRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllLanguageResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdLanguageResponse;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll() throws Exception;
	
	GetByIdLanguageResponse getById(GetByIdLanguageRequest getByIdLanguageRequest) throws Exception;
	
	void add(AddLanguageRequest addLanguageRequest) throws Exception;
	
	void update(int id, UpdateLanguageRequest updateLanguageRequest) throws Exception;
	
	void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;

}
