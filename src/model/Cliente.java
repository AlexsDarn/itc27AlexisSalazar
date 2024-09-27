package model;

public class Cliente {
    private final String nif;
    private final String nombre;
    private final String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "model.Cliente [NIF=" + nif + ", Nombre=" + nombre + ", Apellidos=" + apellidos + "]";
    }
}
