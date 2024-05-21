package Modelo;

import java.io.IOException;

import Clases.GestionVuelosReservas;
import Clases.MenuPrincipal;

public class main {

	public static void main(String[] args) {
		//Creamos objeto de la clase GestionVuelosReservas (para llamar a los métodos de esta misma clase)
        GestionVuelosReservas gestionVuelosReservas = new GestionVuelosReservas();
        
        //Esta línea, llama al método inicializarVuelos (recordamos que el método inicializarVuelos no es estático
        //por lo que necesitamos crear un objeto). Antes de nada necesitamos inicializar vuelos ya que si no,
        //no tendríamos información de los vuelos disponible
        gestionVuelosReservas.inicializarVuelos();
        try {
        	//Creeamos el objeto menuPrincipal y le enviamos como argumento el objeto gestionVuelosReservas.
        	//De esta manera, menuPrincipal tendrá acceso a los métodos de la clase GestionVuelosReservas.
        	
        	//En POO tienes que acceder a los métodos de diferentes clases por lo que es necesario instanciar de esta manera
        	MenuPrincipal menuPrincipal = new MenuPrincipal(gestionVuelosReservas);		
        	//Hace la llamada al método buclePrincipal de la clase MenuPrincipal
        	menuPrincipal.buclePrincipal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
