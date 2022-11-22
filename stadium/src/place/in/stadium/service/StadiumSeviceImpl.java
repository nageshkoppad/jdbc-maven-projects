package place.in.stadium.service;

import place.in.stadium.entity.StadiumEntity;
import place.in.stadium.repository.StadiumRepositoryImpl;

public class StadiumSeviceImpl implements StadiumSevice {

	private StadiumRepositoryImpl repository;
	public StadiumSeviceImpl(StadiumRepositoryImpl repository) {
		this.repository=repository;
	}
	@Override
	public void saveAndValidate(StadiumEntity entity) {
		int id=entity.getId();
		String name=entity.getName();
		int year=entity.getFoundedYear();
	    int capacity=	entity.getCapacity();
		int fees=entity.getEntryFees();
		String stadium=entity.getStadiums();
		
		boolean name2=false;
		boolean name3=false;
		boolean name4=false;
		boolean name5=false;
		boolean name6=false;
		if(id>0 && id<100) name2=true;
		if(name2 && name.length()>2 && name.length()<100)name3=true;
		if(name3 && year>1999 && year<2023)name4=true;
		if(name4 && capacity>200 && capacity<1500)name5=true;
		if(name5 && fees>100 && fees<500)name6=true;
		if(name6 && stadium.length()>2 && stadium.length()<100)this.repository.save(entity);	
	}
}
