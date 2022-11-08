package kodlama.io.DevsAndTech.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.DevsAndTech.business.abstracts.LanguageService;
import kodlama.io.DevsAndTech.business.requests.AddLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateLanguageRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllLanguageResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdLanguageResponse;


@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping
	public List<GetAllLanguageResponse> getAll() throws Exception {
		return languageService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdLanguageResponse getById(GetByIdLanguageRequest getByIdLanguageRequest) throws Exception {
		return languageService.getById(getByIdLanguageRequest);
	}
	
	@PostMapping
	public void add(AddLanguageRequest addLanguageRequest) throws Exception{
		languageService.add(addLanguageRequest);
	}
 	
	@PutMapping("/{id}")
	public void update(@PathVariable int id, @RequestBody UpdateLanguageRequest updateLanguageRequest) throws Exception{
		languageService.update(id, updateLanguageRequest);
	}
	
	@DeleteMapping("{id}")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception{
		languageService.delete(deleteLanguageRequest);
	}

}
