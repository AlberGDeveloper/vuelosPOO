package Clases;

import java.util.Vector;

public class Cliente {
	private Vector<String> codigosCliente;
	private Vector<String> nombreCompleto;
	private Vector<String> email;

	public Cliente(Vector<String> codigosCliente, Vector<String> nombreCompleto, Vector<String> email) {
		super();
		this.codigosCliente = codigosCliente;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
	}

	public Vector<String> getCodigosCliente() {
		return codigosCliente;
	}

	public void setCodigosCliente(Vector<String> codigosCliente) {
		this.codigosCliente = codigosCliente;
	}

	public Vector<String> getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(Vector<String> nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Vector<String> getEmail() {
		return email;
	}

	public void setEmail(Vector<String> email) {
		this.email = email;
	}

}
