package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import Clases.Reservas;
import Clases.Cliente;

public class Vuelos {
	private Vector<String> origenes;
	private Vector<String> destinos;
	private Vector<String> horas;
	private Vector<Double> precios; // Asumiendo que los precios son valores decimales
	// private Vector<String> codigosCliente;
	// private Vector<String> reservas; // Asumiría que es un Vector<String>, pero
	// depende de cómo estés manejando las reservas

	public Vuelos(Vector<String> origenes, Vector<String> destinos, Vector<String> horas, Vector<Double> precios) {
		super();
		this.origenes = origenes;
		this.destinos = destinos;
		this.horas = horas;
		this.precios = precios;

	}

	public Vector<String> getOrigenes() {
		return origenes;
	}

	public void setOrigenes(Vector<String> origenes) {
		this.origenes = origenes;
	}

	public Vector<String> getDestinos() {
		return destinos;
	}

	public void setDestinos(Vector<String> destinos) {
		this.destinos = destinos;
	}

	public Vector<String> getHoras() {
		return horas;
	}

	public void setHoras(Vector<String> horas) {
		this.horas = horas;
	}

	public Vector<Double> getPrecios() {
		return precios;
	}

	public void setPrecios(Vector<Double> precios) {
		this.precios = precios;
	}

}
