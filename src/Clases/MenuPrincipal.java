package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuPrincipal {
	private BufferedReader br;
	private GestionVuelosReservas gestionVuelosReservas;

	public MenuPrincipal(GestionVuelosReservas gestionVuelosReservas) {
		this.gestionVuelosReservas = gestionVuelosReservas;
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}
	

	public int mostrarMenu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion = 0;
		String entrada;
		System.out.println("[1] Mostrar catálogo de vuelos.");
		System.out.println("[2] Realizar reserva.");
		System.out.println("[3] Listado de reservas.");
		System.out.println("[0] Salir.");
		System.out.print("Elige una opcion: ");
		entrada = br.readLine();

		try {
			opcion = Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			System.out.println("Por favor, introduce un número válido.");
		}

		return opcion;
	}

	public void buclePrincipal() throws IOException {
		boolean salir = false;
		while (!salir) {
			int opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				System.out.println(gestionVuelosReservas.catalogoVuelos());
				break;
			case 2:
				int codigoCliente = leerCodigoCliente(); 
				String nombreCliente = leerNombreCliente();
				String emailCliente = leerEmailCliente();
				int numeroVuelo = leerNumeroVuelo(); 
				gestionVuelosReservas.reservarVuelo(codigoCliente, numeroVuelo, nombreCliente, emailCliente);
				break;
			case 3:
				System.out.println(gestionVuelosReservas.listadoReservas());
				break;
			default:
				salir = true;
			}
		}
	}

	private String leerEmailCliente() throws IOException {
		String email;
		System.out.print("Email cliente: ");
		email = br.readLine();
		return email;
	}


	private String leerNombreCliente() throws IOException {
		String nombre;
		System.out.print("Nombre cliente: ");
		nombre = br.readLine();
		return nombre;
	}


	public int leerCodigoCliente() throws IOException {
		String entrada;
		int codigo;
		System.out.print("Codigo cliente: ");
		entrada = br.readLine();
		codigo = Integer.parseInt(entrada);
		return codigo;
	}

	public int leerNumeroVuelo() throws IOException {
		String entrada;
		int numeroVuelo;
		System.out.print("Numero Vuelo: ");
		entrada = br.readLine();
		numeroVuelo = Integer.parseInt(entrada);
		return numeroVuelo;
	}
}
