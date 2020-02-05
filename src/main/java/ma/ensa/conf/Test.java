package ma.ensa.conf;

import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import ma.ensa.dao.ConferenceJpaRepository;
import ma.ensa.entities.Conference;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
		ConferenceJpaRepository cjr = (ConferenceJpaRepository) ctx.getBean("conferenceJpaRepository");
		
		Conference cf1  =  new Conference("drstet24");
		Conference cf2  =  new Conference("drstet26");
		Conference cf3  =  new Conference("drstet28");
		cjr.save(cf1);
		cjr.save(cf2);
		cjr.save(cf2);
		System.out.println(cjr.count());
	
		Iterable<Conference> confs = cjr.findAll();
		for(Conference cf : confs){
			System.out.println(cf.getConferenceName());
		}
		
		System.out.println(cf1.getConferenceName());
		
		System.out.println(".....................");
	}
}
