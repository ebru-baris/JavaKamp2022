package kodlama.io.DevsAndTech.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.DevsAndTech.business.abstracts.TechnologyService;
import kodlama.io.DevsAndTech.business.requests.AddTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.DeleteTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.GetByIdTechnologyRequest;
import kodlama.io.DevsAndTech.business.requests.UpdateTechnologyRequest;
import kodlama.io.DevsAndTech.business.responses.GetAllTechnologyResponse;
import kodlama.io.DevsAndTech.business.responses.GetByIdTechnologyResponse;
import kodlama.io.DevsAndTech.dataAccess.abstracts.LanguageRepository;
import kodlama.io.DevsAndTech.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.DevsAndTech.entities.concretes.Language;
import kodlama.io.DevsAndTech.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
    private LanguageRepository languageRepository;

    public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
        this.technologyRepository = technologyRepository;
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() throws Exception {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> responses = new ArrayList<GetAllTechnologyResponse>();
        if (technologies.isEmpty()) {
            throw new Exception("Teknoloji bulunamadı");
        }
        for (Technology technology : technologies) {
            GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
            responseItem.setTechnologyId(technology.getTechnologyId());
            responseItem.setTechnologyName(technology.getTechnologyName());
            responseItem.setLanguageName(technology.getLanguage().getLanguageName());

            responses.add(responseItem);
        }
        return responses;
    }

    @Override
    public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(getByIdTechnologyRequest.getTechnologyId())
                .orElseThrow(() -> new Exception("Teknoloji bulunamadı!"));

        GetByIdTechnologyResponse responseItem = new GetByIdTechnologyResponse();
        responseItem.setTechnologyId(technology.getTechnologyId());
        responseItem.setTechnologyName(technology.getTechnologyName());
        responseItem.setLanguageName(technology.getLanguage().getLanguageName());

        return responseItem;
    }

    @Override
    public void add(AddTechnologyRequest addTechnologyRequest) throws Exception {
        Technology technology = new Technology();
        technology.setTechnologyName(addTechnologyRequest.getTechnologyName());
        if (technology.getTechnologyName().isEmpty() || technology.getTechnologyName().isBlank()) {
            throw new Exception("Teknoloji Adı Gerekli");
        }
        if (technologyRepository.existsByTechnologyNameIgnoreCase(addTechnologyRequest.getTechnologyName())) {
            throw new Exception("Teknoloji adı zaten mevcut");
        }

        Language language = languageRepository.findById(addTechnologyRequest.getLanguageId())
                .orElseThrow(() -> new Exception("Programlama Dili Bulunamadı"));
        technology.setLanguage(language);
        technologyRepository.save(technology);
    }

    @Override
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(id)
                .orElseThrow(() -> new Exception("Teknoloji Bulunamadı!"));
        if (technology.getTechnologyName().isEmpty() || technology.getTechnologyName().isBlank()) {
            throw new Exception("Teknoloji Adı Gerekli!");
        }
        if (technologyRepository.existsByTechnologyNameIgnoreCase(updateTechnologyRequest.getTechnologyName())) {
            throw new Exception("Teknoloji adı zaten mevcut");
        }

        technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());
        technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(deleteTechnologyRequest.getTechnologyId())
                .orElseThrow(() -> new Exception("Teknoloji Bulunamadı!"));
        technologyRepository.delete(technology);
    }
}