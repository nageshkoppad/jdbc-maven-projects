package place.in.stadium;

import place.in.stadium.entity.StadiumEntity;
import place.in.stadium.enum1.StadiumTypes;
import place.in.stadium.repository.StadiumRepositoryImpl;
import place.in.stadium.service.StadiumSeviceImpl;

public class Runner {

	public static void main(String[] args) {
		StadiumRepositoryImpl repo=new StadiumRepositoryImpl();
		StadiumEntity entity=new StadiumEntity(5,"chinnswami",2010,1200,250,StadiumTypes.CRICKET.getValue());
		StadiumEntity entity1=new StadiumEntity(5,"turf",2012,1300,100,StadiumTypes.FOOTBALL.getValue());
		StadiumEntity entity2=new StadiumEntity(5,"ksha",2015,1200,250,StadiumTypes.HOCKEY.getValue());
		StadiumEntity entity3=new StadiumEntity(5,"eden garden",2009,1300,250,StadiumTypes.CRICKET.getValue());
		StadiumEntity entity4=new StadiumEntity(5,"dribble arena",2007,1400,250,StadiumTypes.FOOTBALL.getValue());
		StadiumEntity entity5=new StadiumEntity(5,"wankhede",2001,14500,250,StadiumTypes.CRICKET.getValue());
		
		
		StadiumSeviceImpl service=new StadiumSeviceImpl(repo);
		//service.saveAndValidate(entity);
		service.saveAndValidate(entity1);
		//service.saveAndValidate(entity2);
		service.saveAndValidate(entity3);
		service.saveAndValidate(entity4);
		service.saveAndValidate(entity5);
	}

}
