package p3;

import java.time.*;
public class Student implements Comparable<Student> {
	private String name,phoneNumber,major;
	private int id;
	private LocalDate registrationDate;
	private LocalTime registrationTime;
	private static int idCount = 0;
	
	public Student(String name, String phoneNumber, String major) {
		super();
		id = idCount++;
		registrationDate = LocalDate.now();
		registrationTime = LocalTime.now();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public LocalTime getRegistrationTime() {
		return registrationTime;
	}
	
	public LocalDateTime getDateTime()
	{
	
		return LocalDateTime.of(registrationDate,registrationTime);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", major=" + major + ", id=" + id
				+ ", registrationDate=" + registrationDate + ", registrationTime=" + registrationTime + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return getDateTime().compareTo(o.getDateTime());
	}
	
	
}
