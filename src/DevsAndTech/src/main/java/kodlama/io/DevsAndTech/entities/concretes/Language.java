package kodlama.io.DevsAndTech.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Languages")
public class Language {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "language_id")
	private int languageId;
	
	
	@Column(name="language_name")
	private String languageName;

	
	@OneToMany (mappedBy ="language",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Technology> technologies;
	
}
