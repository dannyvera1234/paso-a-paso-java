package poo;

public class Coche {

	private int rueda;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cueros, climatizador;

	public Coche() {
		rueda = 4;
		largo = 555;
		ancho = 345;
		motor = 15;
		peso_plataforma = 1000;
	}

	public int getRueda() {
		return rueda;
	}

	public void setRueda(int rueda) {
		this.rueda = rueda;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso_plataforma() {
		return peso_plataforma;
	}

	public void setPeso_plataforma(int peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPeso_total() { // SETTER + GETTER
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if (asientos_cueros == true) {
			peso_total +=  50;
		}
		if (climatizador == true) {
			peso_total +=   20;
		}
		return "el peso del coche es" + peso_total;

	}

	public int precio_coche() {
		int precio_final = 10000;
		if (asientos_cueros == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}

	public String isAsientos_cueros() {
		if (asientos_cueros == true) {
			return "el coche tiene asiento de cuero";
		} else {
			return "el coche no tiene asiento de cuero";
		}
	}

	public void setAsientos_cueros(String asientos_cueros) {

		if (asientos_cueros.equalsIgnoreCase("si")) {
			this.asientos_cueros = true;
		} else {
			this.asientos_cueros = false;
		}
	}

	public String isClimatizador() {
		if (climatizador == true) {

			return "el coche lleva aire acodicinoada";
		} else {
			return "no tiene";
		}
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

}