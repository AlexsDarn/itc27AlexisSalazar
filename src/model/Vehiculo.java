package model;

public class Vehiculo {
    private final String matricula;
    private final String marca;
    private final String modelo;
    private final String color;
    private final double precio;

    public Vehiculo(String matricula, String marca, String modelo, String color, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "model.Vehiculo [Matrícula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Precio=" + precio + "]";
    }
}
