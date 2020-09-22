package Cajero;

public class Clientes {
	
	String name;
	String lastName;
	String rut;
	String date;
	String address;
	String phone;
	int clave;

	public Clientes(String name, String lastName, String rut, String date, String address, String phone, int clave) {
		this.name = name;
		this.lastName = lastName;
		this.rut = rut;
		this.date = date;
		this.address = address;
		this.phone = phone;
		this.clave = clave;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	
}
