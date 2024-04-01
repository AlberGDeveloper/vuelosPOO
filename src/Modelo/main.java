package Modelo;

import java.io.IOException;

import Clases.GestionVuelosReservas;
import Clases.MenuPrincipal;

public class main {

	public static void main(String[] args) {
        GestionVuelosReservas gestionVuelosReservas = new GestionVuelosReservas();
        gestionVuelosReservas.inicializarVuelos();
        try {
        	MenuPrincipal menuPrincipal = new MenuPrincipal(gestionVuelosReservas);			
        	menuPrincipal.buclePrincipal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
