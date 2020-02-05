package ma.ensa.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.ensa.dao.ConferenceJpaRepository;

@Component
public class conferenceMetier {
	@Autowired
	ConferenceJpaRepository conferenceJpaRepository;

}
