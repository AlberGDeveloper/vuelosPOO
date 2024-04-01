package Clases;

public class Reservas {
    private Cliente cliente;
    private Vuelos vuelo;

    public Reservas(Cliente cliente, Vuelos vuelo) {
        this.cliente = cliente;
        this.vuelo = vuelo;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelos getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}

    
}
