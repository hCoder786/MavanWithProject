package hCoder786.MavanWithProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private int id;
	private String Name;
	private String Address;
	private String Phon_No;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhon_No() {
		return Phon_No;
	}
	public void setPhon_No(String phon_No) {
		Phon_No = phon_No;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Phon_No=" + Phon_No + "]";
	}
	public Student(int id, String name, String address, String phon_No) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		Phon_No = phon_No;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
