package Collections;

import java.util.Date;

public class Student {
String name;
Integer Id;
Long Mno;
@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", Mno=" + Mno + ", Email=" + Email + ", gender="
			+ gender + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public Long getMno() {
	return Mno;
}
public void setMno(Long mno) {
	Mno = mno;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}


public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
String Email;
char gender;
}
