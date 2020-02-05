package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conference {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConference;
	private String conferenceName;
	
	public Conference() {
		super();
	}
	
	
	
	
	
	public Conference(String conferenceName) {
		super();
		this.conferenceName = conferenceName;
	}





	public Long getIdConference() {
		return idConference;
	}





	public void setIdConference(Long idConference) {
		this.idConference = idConference;
	}





	public String getConferenceName() {
		return conferenceName;
	}
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
	
	
	
}
