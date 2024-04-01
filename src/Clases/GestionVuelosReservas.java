package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Clases.Vuelos;

public class GestionVuelosReservas {
    private Vuelos vuelos;
    private Vector<Integer> codigosCliente = new Vector<>();
    private Vector<String> nombresClientes = new Vector<>(); // Cambiado para evitar el conflicto de nombres
    private Vector<String> emailsClientes = new Vector<>(); // Agregado para almacenar emails, basado en tu intención original
    private Vector<Integer> reservas = new Vector<>();

    public GestionVuelosReservas() {
        // Inicializa la instancia de Vuelos con vectores vacíos
        this.vuelos = new Vuelos(new Vector<>(), new Vector<>(), new Vector<>(), new Vector<>());
    }
    
    public void reservarVuelo(int codigoCliente, int codigoVuelo, String nombreCliente, String emailCliente) {
        codigosCliente.add(codigoCliente);
        nombresClientes.add(nombreCliente); 
        emailsClientes.add(emailCliente); 
        reservas.add(codigoVuelo);
    }
    
    public String listadoReservas() {
        StringBuilder listado = new StringBuilder("--------- Reservas ---------\n");
        for (int i = 0; i < codigosCliente.size(); i++) {
            int cliente = codigosCliente.get(i);
            String nombrecliente = nombresClientes.get(i);
            int indiceVuelo = reservas.get(i);
            // Asume que los vectores en `Vuelos` son accesibles a través de getters
            String origen = vuelos.getOrigenes().get(indiceVuelo);
            String destino = vuelos.getDestinos().get(indiceVuelo);
            String hora = vuelos.getHoras().get(indiceVuelo);
            double precio = vuelos.getPrecios().get(indiceVuelo);
            listado.append(String.format("\n--- Reserva Número %d ---\nCliente: %d\nNombre: %s\nEmail: %s\nOrigen: %s\nDestino: %s\nHora: %s\nPrecio: %.2f\n------------------------\n",
                    i + 1, cliente, nombrecliente, emailsClientes.get(i), origen, destino, hora, precio));

        }
        listado.append("\n------ Fin Reservas ------\n");
        return listado.toString();
    }
    
	public void inicializarVuelos() {
        vuelos.getOrigenes().add("Madrid");
        vuelos.getDestinos().add("Barcelona");
        vuelos.getHoras().add("9:00");
        vuelos.getPrecios().add(157.0);
        vuelos.getOrigenes().add("Barcelona");
        vuelos.getDestinos().add("Madrid");
        vuelos.getHoras().add("12:30");
        vuelos.getPrecios().add(175.0);
        vuelos.getOrigenes().add("Madrid");
        vuelos.getDestinos().add("Barcelona");
        vuelos.getHoras().add("9:00");
        vuelos.getPrecios().add(162.0);
        vuelos.getOrigenes().add("Madrid");
        vuelos.getDestinos().add("OPORTO");
        vuelos.getHoras().add("18:00");
        vuelos.getPrecios().add(132.0);
	}

    public String catalogoVuelos() {
		String listado = "--------- Vuelos ---------";
		String origen, destino, hora;
		double precio;
		for (int i = 0; i < vuelos.getOrigenes().size(); ++i) {
			origen = ((String) vuelos.getOrigenes().elementAt(i)).toString();
			destino = ((String) vuelos.getDestinos().elementAt(i)).toString();
			hora = ((String) vuelos.getHoras().elementAt(i)).toString();
			precio = ((Double) vuelos.getPrecios().elementAt(i)).doubleValue();
			listado += "\n--- Vuelo Número " + (i+1) + " ---\n";
			listado += "Origen: " + origen + "\n";
			listado += "Destino: " + destino + "\n";
			listado += "Hora: " + hora + "\n";
			listado += "Precio: " + precio + "\n";
			listado += "\n----------------------";
		}
		listado += "\n------- Fin Vuelos -------\n";
		return listado;
    }

 
}

