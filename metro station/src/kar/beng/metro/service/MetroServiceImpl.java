package kar.beng.metro.service;

import kar.beng.metro.entity.MetroEntity;
import kar.beng.metro.repository.MetroRepositoryImpl;

public class MetroServiceImpl implements MetroService {
    private MetroRepositoryImpl repository;
    public MetroServiceImpl(MetroRepositoryImpl repository) {
    	this.repository=repository;
    }
	 
	@Override
	public void saveAndValidate(MetroEntity entity) {
		int id=	entity.getId();
		String startPoint=entity.getStartPoint();
		String endPoint=entity.getEndPoint();
		int since=entity.getSince();
		int costConstruction=entity.getCostConstruction();
		String metroName=entity.getMetroName();
		String owner=entity.getOwner();
		String transitType=entity.getTransitType();
		int numberLines=entity.getNumberLines();
		int numberStations=entity.getNumberStations();
		String webSite=entity.getWebSite();
		String headQuarter=entity.getHeadQuarter();
		int avrageSpeed=entity.getAvrageSpeed();
		int maximumSpeed=entity.getMaximumSpeed();
		
		boolean name111=false;
		boolean name1=false;
		boolean name2=false;
		boolean name3=false;
		boolean name4=false;
		boolean name5=false;
		boolean name6=false;
		boolean name7=false;
		boolean name8=false;
		boolean name9=false;
		boolean name10=false;
		boolean name11=false;
		boolean name12=false;
		boolean name13=false;
		boolean name14=false;
		boolean name15=false;
		if(id>0 && id<100)name111=true;
		if(name111 && startPoint.length()>2 && startPoint.length()<100)name1=true;
		if(name1 && endPoint.length()>2 && endPoint.length()<100)name2=true;
		if(name2 && since>1999 && since<2023)name3=true;
		if(name3 && costConstruction>100000 && costConstruction<100000000)name4=true;
		if(name4 && metroName.length()>2 && metroName.length()<100)name5=true;
		if(name5 && owner.length()>2 && owner.length()<100)name6=true;
		if(name6 && transitType.length()>2 && transitType.length()<100)name7=true;
		if(name7 && numberLines>3 && numberLines<10)name8=true;
		if(name8 && numberStations>50 && numberStations<500)name9=true;
		if(name9 && webSite.length()>2 && webSite.length()<50)name10=true;
		if(name10 && headQuarter.length()>2 && headQuarter.length()<100)name11=true;
		if(name11 && avrageSpeed>27 && avrageSpeed<40)name12=true;
		if(name12 && maximumSpeed>30 && maximumSpeed<120)this.repository.save(entity);
	}
}
