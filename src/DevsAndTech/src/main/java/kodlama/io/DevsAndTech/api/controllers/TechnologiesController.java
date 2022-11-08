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

import kodlama.io.DevsAndTech.business.abstracts.TechnologyService;
import kodlama.io.DevsAndTech.business.requests.AddTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateTechnologyRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllTechnologyResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologyService technologyService;

	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	
	@GetMapping
	public List<GetAllTechnologyResponse> getAll() throws Exception{
		return technologyService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception{
		return technologyService.getById(getByIdTechnologyRequest);
	}

	
	@PostMapping
	public void add(AddTechnologyRequest addTechnologyRequest) throws Exception{
		technologyService.add(addTechnologyRequest);
	}
	
	@PutMapping("/{id}")
	public void update (@PathVariable int id, @RequestBody UpdateTechnologyRequest updateTechnologyRequest) throws Exception{
		technologyService.update(id,updateTechnologyRequest);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception{
		technologyService.delete(deleteTechnologyRequest);
	}

}
