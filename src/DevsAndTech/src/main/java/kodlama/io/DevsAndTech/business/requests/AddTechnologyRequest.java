package kodlama.io.DevsAndTech.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTechnologyRequest {
	private String technologyName;
	private int languageId;

}
