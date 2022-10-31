package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concrates.Language;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	
	private List<Language> languages = new ArrayList<>();
	
	public InMemoryLanguageRepository() {
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"JavaScript"));
		languages.add(new Language(4,"Kotlin"));
		languages.add(new Language(5,"Flutter"));
		languages.add(new Language(6,"Swift"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language add(Language language) {
		languages.add(language);
		return getById(language.getId());
	}

	@Override
	public void update(Language language, int id) {
		Language languageNew = getById(id);
		languageNew.setName(language.getName());
		
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));
		
	}

	@Override
	public Language getById(int id) {
		
		return languages.stream().filter(language -> language.getId()==id).findFirst().get();
	}
	
	


}
