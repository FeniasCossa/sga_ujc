package mz.ujc.sga.model.university;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "course")
public class Course {

	@Id
	private Long id;
	
	
	private String name;
}
