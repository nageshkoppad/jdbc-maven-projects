package kar.beng.metro;

import kar.beng.metro.entity.MetroEntity;
import kar.beng.metro.repository.MetroRepositoryImpl;
import kar.beng.metro.service.MetroServiceImpl;

public class Runner {

	public static void main(String[] args) {
		MetroRepositoryImpl repo=new MetroRepositoryImpl();
		MetroEntity entity=new MetroEntity(1,"silk institute","yashavantpura",2007,2000000,"shivaji","benglore board","majestic",5,200,"beng.metro","Bengalore",37,87);
		MetroServiceImpl service=new MetroServiceImpl(repo);
        service.saveAndValidate(entity);
	}

}
