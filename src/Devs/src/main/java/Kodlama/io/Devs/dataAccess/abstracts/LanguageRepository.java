package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.concrates.Language;

@Repository
public interface LanguageRepository{
	public List<Language> getAll();
	public Language add(Language language);
	public void update(Language language,int id);
	public void delete(int id);
	public Language getById(int id);



}
