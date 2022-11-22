package place.in.stadium.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import place.in.stadium.enum1.StadiumTypes;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlEnum
@Entity
@Table(name="stadium")
public class StadiumEntity {
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="founded_year")
private int foundedYear;
@Column(name="capacity")
private int capacity;
@Column(name="entity_fees")
private int entryFees;
@Column(name="stadium")
private String Stadiums;	
}
