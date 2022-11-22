package nominee.get.award.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="awardees")
public class KRAwardeesDTO {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="achievements")
	private String achievement;
	@Column(name="alive")
	private String alive;
	@Column(name="age")
	private int age;
	@Column(name="place")
	private String place;
}
