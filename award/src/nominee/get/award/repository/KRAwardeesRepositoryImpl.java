package nominee.get.award.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import nominee.get.award.dto.KRAwardeesDTO;

public class KRAwardeesRepositoryImpl implements KRAwardeesRepository {

	@Override
	public void save(KRAwardeesDTO dto) {
        EntityManagerFactory factoryAbstraction=Persistence.createEntityManagerFactory("com.xworkz");
        
        EntityManager mangerAbstraction =factoryAbstraction.createEntityManager();
      EntityTransaction transc=mangerAbstraction.getTransaction();
       
       transc.begin();
       
       mangerAbstraction.persist(dto);
       transc.commit();
       mangerAbstraction.close();
	}

}
