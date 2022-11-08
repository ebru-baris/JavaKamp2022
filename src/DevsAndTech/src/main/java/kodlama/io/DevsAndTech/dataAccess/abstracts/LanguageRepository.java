package kodlama.io.DevsAndTech.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.DevsAndTech.entities.concretes.Language;

public interface LanguageRepository  extends JpaRepository<Language,Integer>{
	boolean existsByLanguageNameIgnoreCase(String name);

}
