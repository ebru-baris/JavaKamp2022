package Kodlama.io.Devs.business.concracts;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concrates.Language;

@Service
public class LanguageManager implements LanguageService {
	
	
	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	
	
	@Override
	public Language add(Language language) throws Exception {
		if(isIdExist(language.getId())) throw new Exception("Id Tekrar Edemez");
		if(isNameExist(language)) throw new Exception("Isim Tekrar Edemez");
		return languageRepository.add(language);
	}

	@Override
	public void update(Language language, int id) throws Exception {
		if(!isIdExist(language.getId())) throw new Exception("Id Bulunamadı");
		if(isNameExist(language)) throw new  Exception("Isim tekrar edemez");
		languageRepository.update(language,id);
		
	}

	@Override
	public void delete(int id) throws Exception {
	if(!isIdExist(id)) throw new Exception	("Id Bulunamadı");
	languageRepository.delete(id);
		
	}

	@Override
	public Language getById(int id) throws Exception {
		if(isIdExist(id)) throw new Exception("Id Bulunamadı");
		return languageRepository.getById(id);
	}
	
	public boolean isNameExist(Language language) {
		for(Language languageNew : getAll()) {
			if(language.getName().equalsIgnoreCase(languageNew.getName())) {
				
				return true;
			}
		} return false;
	}
	
	public boolean isIdExist(int id) {
		for (Language languageNew : getAll()) {
			if(languageNew.getId()==id) {
				return true;
			}
			
		} return false;
	}
	
	

}

