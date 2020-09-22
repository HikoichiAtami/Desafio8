package Cajero;

public class Producto {

	String ejecutivoName;
	String ejecutivoLastName;
	String ejecutivoPhone;
	String ejecutivoAddress;

	public Producto(String ejecutivoName, String ejecutivoLastName, String ejecutivoPhone, String ejecutivoAddress) {
		this.ejecutivoName = ejecutivoName;
		this.ejecutivoLastName = ejecutivoLastName;
		this.ejecutivoPhone = ejecutivoPhone;
		this.ejecutivoAddress = ejecutivoAddress;
	}
	
	public String getEjecutivoName() {
		return ejecutivoName;
	}


	public void setEjecutivoName(String ejecutivoName) {
		this.ejecutivoName = ejecutivoName;
	}


	public String getEjecutivoLastName() {
		return ejecutivoLastName;
	}


	public void setEjecutivoLastName(String ejecutivoLastName) {
		this.ejecutivoLastName = ejecutivoLastName;
	}


	public String getEjecutivoPhone() {
		return ejecutivoPhone;
	}


	public void setEjecutivoPhone(String ejecutivoPhone) {
		this.ejecutivoPhone = ejecutivoPhone;
	}

	public String getEjecutivoAddress() {
		return ejecutivoAddress;
	}

	public void setEjecutivoAddress(String ejecutivoAddress) {
		this.ejecutivoAddress = ejecutivoAddress;
	}
}
