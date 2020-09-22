package Cajero;

public class CuentaCorriente extends Producto {

	String ctaCorriente;
	double saldoCorriente;
	double deudaCorriente;
	
	public CuentaCorriente(String ejecutivoName, String ejecutivoLastName, String ejecutivoPhone,
			String ejecutivoAddress, String ctaCorriente, double saldoCorriente,double deudaCorriente ) {
		
		super(ejecutivoName, ejecutivoLastName, ejecutivoPhone, ejecutivoAddress);
		this.ctaCorriente = ctaCorriente;
		this.saldoCorriente = saldoCorriente;
		this.deudaCorriente = deudaCorriente;
		// TODO Auto-generated constructor stub
	}

	public String getCtaCorriente() {
		return ctaCorriente;
	}

	public void setCtaCorriente(String ctaCorriente) {
		this.ctaCorriente = ctaCorriente;
	}

	public double getSaldoCorriente() {
		return saldoCorriente;
	}

	public void setSaldoCorriente(double saldoCorriente) {
		this.saldoCorriente = saldoCorriente;
	}

	public double getDeudaCorriente() {
		return deudaCorriente;
	}

	public void setDeudaCorriente(double deudaCorriente) {
		this.deudaCorriente = deudaCorriente;
	}

}
