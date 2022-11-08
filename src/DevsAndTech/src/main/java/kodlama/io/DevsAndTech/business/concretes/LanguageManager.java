package kodlama.io.DevsAndTech.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.DevsAndTech.business.abstracts.LanguageService;
import kodlama.io.DevsAndTech.business.requests.AddLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdLanguageRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateLanguageRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllLanguageResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdLanguageResponse;
import kodlama.io.DevsAndTech.dataAccess.abstracts.LanguageRepository;
import kodlama.io.DevsAndTech.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	@Override
	public List<GetAllLanguageResponse> getAll() throws Exception{
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> getAllLanguageResponses = new ArrayList<GetAllLanguageResponse>();
		if(languages.isEmpty()) {
			throw new Exception("Mevcut Degil");
		}
		for(Language language : languages) {
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			responseItem.setLanguageId(language.getLanguageId());
			responseItem.setLanguageName(language.getLanguageName());
			getAllLanguageResponses.add(responseItem);
		}
		return getAllLanguageResponses;
	}
	
	@Override
	public GetByIdLanguageResponse getById(GetByIdLanguageRequest getByIdLanguageRequest) throws Exception{
		Language language =languageRepository.findById(getByIdLanguageRequest.getLanguageId()).orElseThrow(()-> new Exception("Bulunamadi"));
		
		GetByIdLanguageResponse responseItem = new GetByIdLanguageResponse();
		responseItem.setLanguageId(language.getLanguageId());
		responseItem.setLanguageName(language.getLanguageName());
		
		return responseItem;
	}
	
	@Override
	public void add(AddLanguageRequest addLanguageRequest) throws Exception{
		Language language = new Language();
		language.setLanguageName(addLanguageRequest.getLanguageName());
		if(language.getLanguageName().isEmpty() || language.getLanguageName().isBlank()){
		throw new Exception("Bir Programlama Dili Yazınız!");	
		}
		if(languageRepository.existsByLanguageNameIgnoreCase(addLanguageRequest.getLanguageName())) {
			throw new Exception("Bu Programlama Dili Mevcut!");
		}
		languageRepository.save(language);
	}
	
	@Override
	public void update(int id, UpdateLanguageRequest updateLanguageRequest) throws Exception{
	Language language = languageRepository.findById(id).orElseThrow(()-> new Exception(" Programlama Dili Bulunamadı!"));
	
	if (language.getLanguageName().isEmpty() || updateLanguageRequest.getLanguageName().isBlank()) {
        throw new Exception("Bir Programlama Dili Yazınız!");
    }
	if(languageRepository.existsByLanguageNameIgnoreCase(updateLanguageRequest.getLanguageName())) {
	throw new Exception("Bu programlama Dili Mevcut!");
    }
	
	language.setLanguageName(updateLanguageRequest.getLanguageName());
	languageRepository.save(language);
	}


	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception{
		Language language = languageRepository.findById(deleteLanguageRequest.getLanguageId()).orElseThrow(() -> new Exception("Programlama Dili Bulunamadı!"));
		languageRepository.delete(language);
	}
	
	
}
