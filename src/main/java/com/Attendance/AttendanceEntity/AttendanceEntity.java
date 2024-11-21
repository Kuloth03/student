package com.Attendance.AttendanceEntity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="attend")
public class AttendanceEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private int rollnumber;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	private int sem1marktheory;
	private int sem2marktheory;
	private int sem1markprac;
	
	private int sem2markprac;
	private int sem1total;
	private int sem2total;
	private float total;
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public int getSem1marktheory() {
		return sem1marktheory;
	}
	public void setSem1marktheory(int sem1marktheory) {
		this.sem1marktheory = sem1marktheory;
	}
	public int getSem2marktheory() {
		return sem2marktheory;
	}
	public void setSem2marktheory(int sem2marktheory) {
		this.sem2marktheory = sem2marktheory;
	}
	public int getSem1markprac() {
		return sem1markprac;
	}
	public void setSem1markprac(int sem1markprac) {
		this.sem1markprac = sem1markprac;
	}
	public int getSem2markprac() {
		return sem2markprac;
	}
	public void setSem2markprac(int sem2markprac) {
		this.sem2markprac = sem2markprac;
	}
	public int getSem1total() {
		return sem1total;
	}
	public void setSem1total(int sem1total) {
		this.sem1total = sem1total;
	}
	public int getSem2total() {
		return sem2total;
	}
	public void setSem2total(int sem2total) {
		this.sem2total = sem2total;
	}
	
	
}
