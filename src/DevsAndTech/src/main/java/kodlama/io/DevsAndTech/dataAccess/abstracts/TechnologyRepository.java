package kodlama.io.DevsAndTech.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.DevsAndTech.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology,Integer>{
	boolean existsByTechnologyNameIgnoreCase(String name);

}
