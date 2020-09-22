package Cajero;

public class TarjetaCredito extends Producto {

	String nroCredito;
	double saldoActualCredito;
	double deudaCredito;
	
	public TarjetaCredito(String ejecutivoName, String ejecutivoLastName, String ejecutivoPhone,
			String ejecutivoAddress,String nroCredito, double saldoActualCredito, double deudaCredito ) {
		
		super(ejecutivoName, ejecutivoLastName, ejecutivoPhone, ejecutivoAddress);
		
		this.nroCredito = nroCredito;
		this.saldoActualCredito = saldoActualCredito;
		this.deudaCredito = deudaCredito;
		
		// TODO Auto-generated constructor stub
	}

	public String getNroCredito() {
		return nroCredito;
	}

	public void setNroCredito(String nroCredito) {
		this.nroCredito = nroCredito;
	}

	public double getSaldoActualCredito() {
		return saldoActualCredito;
	}

	public void setSaldoActualCredito(double saldoActualCredito) {
		this.saldoActualCredito = saldoActualCredito;
	}

	public double getDeudaCredito() {
		return deudaCredito;
	}

	public void setDeudaCredito(double deudaCredito) {
		this.deudaCredito = deudaCredito;
	}

}
