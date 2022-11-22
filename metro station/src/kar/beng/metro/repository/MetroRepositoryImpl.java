package kar.beng.metro.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import kar.beng.metro.entity.MetroEntity;

public class MetroRepositoryImpl implements MetroRepository{

	@Override
	public void save(MetroEntity entity) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");	
		  EntityManager manager= factory.createEntityManager();
		  EntityTransaction tranc=manager.getTransaction();
		  tranc.begin();
		  manager.persist(entity);
		  tranc.commit();
		  manager.close();
		
	}

}
