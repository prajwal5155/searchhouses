package Model;

import java.sql.Blob;

public class DTO {

	private int id;
	private String name;
	private String profession;
	private String email;
	private String city;
	private String state;
	private String contact;
	private String file;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "DTO [id=" + id + ", name=" + name + ", profession=" + profession + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", contact=" + contact + ", file=" + file + "]";
	}
	
	
	
	
	
}
