package kodlama.io.DevsAndTech.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdTechnologyResponse {
	
	private int technologyId;
	private String technologyName;
	private String languageName;

}
