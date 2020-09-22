package Main;

import java.util.ArrayList;
import java.util.Scanner;
import Cajero.Clientes;
import Cajero.CuentaCorriente;
import Cajero.Producto;
import Cajero.TarjetaCredito;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> clients = new ArrayList<String>();
		ArrayList<String> rutClients = new ArrayList<String>();
		ArrayList<String> ejecutivo = new ArrayList<String>();
		Clientes cliente = new Clientes("", "", "", "", "", "", 0);
		Producto product = new Producto("", "", "", "");
		CuentaCorriente cuentaCorriente = new CuentaCorriente("", "", "", "", "", 0, 0);
		TarjetaCredito tarjetaCredito = new TarjetaCredito("", "", "", "", "", 0, 0);
		
		cuentaCorriente.setCtaCorriente("00 - 15642280");
		cuentaCorriente.setDeudaCorriente(48630);
		cuentaCorriente.setSaldoCorriente(896520);
		
		tarjetaCredito.setNroCredito("01 - 59324452");
		tarjetaCredito.setSaldoActualCredito(1563259);
		tarjetaCredito.setDeudaCredito(480623);
		
		product.setEjecutivoName("Katherine ");
		product.setEjecutivoLastName("Brevis");
		product.setEjecutivoAddress("Woodland Trail 1459 - Springfield");
		product.setEjecutivoPhone("+193 1259 5256");
		ejecutivo.add(product.getEjecutivoName() + product.getEjecutivoLastName());
		ejecutivo.add("Telefono " + product.getEjecutivoPhone());
		ejecutivo.add("Direccion " + product.getEjecutivoAddress());
		
		cliente.setClave(5688);
		cliente.setName("Freddy ");
		cliente.setLastName("Zambrano");
		cliente.setRut("169859795");
		cliente.setAddress("Evergreen Terrace 742 - Springfield");
		cliente.setDate("05061988");
		cliente.setPhone("+193 7717 3239");
		clients.add(cliente.getName() + cliente.getLastName());
		clients.add("Telefono " + cliente.getPhone());
		clients.add("Direccion " + cliente.getAddress());
		rutClients.add(cliente.getRut());
		menu(sc, ejecutivo, cliente);
	}
		
	public static void menu(Scanner sc, ArrayList<String> clients, Clientes cliente) {
		
		String ingresoRut, ingresoMenu;
		int ingresoPass = 0;
		
		System.out.println("Bienvenido a SafeBank");
		System.out.println("Para mostrar su informacion por favor ingrese su Rut sin puntos ni guion");
		ingresoRut = sc.nextLine();
		try {
		System.out.println("Ingrese su clave numerica");
		System.out.println("Le recordamos que la clave debe ser numerica de 4 digitos");
		ingresoPass = sc.nextInt();
		} catch(Exception e){
			System.out.println("Ha ingresado letras en su contraseña, le recordamos que debe ser numerica");
		}
		if(ingresoRut == cliente.getRut() && ingresoPass == cliente.getClave()) {
			System.out.println(". . . . . .");
			System.out.println("Bienvenido " + cliente.getName());
			System.out.println("¿Que desea hacer?");
			System.out.println("1 - Cuenta Corriente");
			System.out.println("2 - Tarjeta de Credito");
			System.out.println("3 - Ver datos del ejecutivo asignado");
			System.out.println("4 - Salir");
			ingresoMenu = sc.nextLine();
			System.out.println("- - - - - - -");
			if(ingresoMenu.compareToIgnoreCase("1") == 0) {
				
			} else if(ingresoMenu.compareToIgnoreCase("2") == 0) {
				
			} else if(ingresoMenu.compareToIgnoreCase("3") == 0) {
				
			} else if(ingresoMenu.compareToIgnoreCase("4") == 0) {
				System.out.println("Cerrando sesion");
				System.out.println("Hasta luego " + cliente.getName());
				System.out.println("SafeBank le desea un excelente dia");
				System.exit(0);
			}
		}
	}
	public static void cuentaCorriente(Scanner sc) {
		
		
		String menuCC, retiro;
		System.out.println("Saldo actual");
		
		
		System.out.println("¿Que desea hacer?");
		System.out.println("1 - Volver al menu");
		System.out.println("2 - Retirar dinero");
		System.out.println("3 - Pagar mi deuda");
		menuCC = sc.nextLine();
		if(menuCC.compareToIgnoreCase("1") == 0) {
			//volver al main
		} else if (menuCC.compareToIgnoreCase("2") == 0) {
			System.out.println("¿Cuanto dinero desea retirar?");
			retiro = sc.nextLine();
			if(retiro.compareToIgnoreCase("0") == 0) {
				//volver a cuenta corriente
			}
		} else if (menuCC.compareToIgnoreCase("3") == 0) {
			
		}
	}

	public static void tarjetaCredito() {
		
	}

	public static void ejecutivo(ArrayList<String> ejecutivo) {
		
		System.out.println("Estos son los datos de su ejecutivo");
		System.out.println(ejecutivo);
	}
}
