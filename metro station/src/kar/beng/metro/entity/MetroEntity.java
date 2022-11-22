package kar.beng.metro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="metro")
	public class MetroEntity {
	    @Id
	    @Column(name="id")
		private int id;
	    @Column(name="startPoint")
		private String startPoint;
	    @Column(name="endPoint")
		private String endPoint;
	    @Column(name="since")
		private int since;
	    @Column(name="costConstruction")
		private int costConstruction;
	    @Column(name="metroName")
		private String metroName;
	    @Column(name="owner1") 
		private String owner;
	    @Column(name="transitType")
		private String transitType;
	    @Column(name="numberLines")
		private int numberLines;
	    @Column(name="numberStations")
		private int numberStations;
	    @Column(name="webSite")
		private String webSite;
	    @Column(name="headQuarter")
		private String headQuarter;
	    @Column(name="avrageSpeed")
		private int avrageSpeed;
	    @Column(name="maximumSpeed")
		private int maximumSpeed;
}
