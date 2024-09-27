package service;

import model.Cliente;
import model.Vehiculo;

import java.util.Arrays;

public class ConcesionarioVehiculos {
    private Cliente[] clientes;
    private Vehiculo[] vehiculos;
    private int numClientes;
    private int numVehiculos;
    private String cif;
    private String nombre;
    private String paginaWeb;

    public ConcesionarioVehiculos(String cif, String nombre, String paginaWeb) {
        this.clientes = new Cliente[10];
        this.vehiculos = new Vehiculo[10];
        this.numClientes = 0;
        this.numVehiculos = 0;
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
    }

    public void registrarCliente(Cliente c) {
        if (numClientes >= clientes.length) {
            clientes = Arrays.copyOf(clientes, clientes.length * 2);
        }
        clientes[numClientes++] = c;
    }

    public void imprimirClientes() {
        System.out.println("Lista de Clientes:");
        for (int i = 0; i < numClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    public void registrarVehiculo(Vehiculo v) {
        if (numVehiculos >= vehiculos.length) {
            vehiculos = Arrays.copyOf(vehiculos, vehiculos.length * 2);
        }
        vehiculos[numVehiculos++] = v;
    }

    public void imprimirVehiculos() {
        System.out.println("Catálogo de Vehículos:");
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println(vehiculos[i]);
        }
    }

    public void imprimirVehiculos(String marca) {
        System.out.println("Vehículos de la marca " + marca + ":");
        for (int i = 0; i < numVehiculos; i++) {
            if (vehiculos[i].getMarca().equalsIgnoreCase(marca)) {
                System.out.println(vehiculos[i]);
            }
        }
    }
}
