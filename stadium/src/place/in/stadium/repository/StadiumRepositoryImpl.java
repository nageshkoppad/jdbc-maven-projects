package place.in.stadium.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import place.in.stadium.entity.StadiumEntity;

public class StadiumRepositoryImpl implements StadiumRepository {

	@Override
	public void save(StadiumEntity entity) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");	
	  EntityManager manager= factory.createEntityManager();
	  EntityTransaction tranc=manager.getTransaction();
	  tranc.begin();
	  manager.persist(entity);
	  tranc.commit();
	  manager.close();
	}

}
