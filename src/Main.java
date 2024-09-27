import model.Cliente;
import model.Vehiculo;
import service.ConcesionarioVehiculos;

public class Main {
    public static void main(String[] args) {
        ConcesionarioVehiculos concesionario = getConcesionarioVehiculos();

        Vehiculo vehiculo1 = new Vehiculo("1234ABC", "VW", "Golf", "Rojo", 20000);
        Vehiculo vehiculo2 = new Vehiculo("5678DEF", "Ford", "Fiesta", "Azul", 15000);
        Vehiculo vehiculo3 = new Vehiculo("9101GHI", "VW", "Passat", "Negro", 25000);

        concesionario.registrarVehiculo(vehiculo1);
        concesionario.registrarVehiculo(vehiculo2);
        concesionario.registrarVehiculo(vehiculo3);

        concesionario.imprimirVehiculos();

        concesionario.imprimirVehiculos("VW");
    }

    private static ConcesionarioVehiculos getConcesionarioVehiculos() {
        ConcesionarioVehiculos concesionario = new ConcesionarioVehiculos("A-28-187189", "cheap car", "www.cheapcar.com");

        Cliente cliente1 = new Cliente("12345678A", "Juan", "Pérez");
        Cliente cliente2 = new Cliente("87654321B", "Ana", "Gómez");
        Cliente cliente3 = new Cliente("11223344C", "Luis", "Martín");

        concesionario.registrarCliente(cliente1);
        concesionario.registrarCliente(cliente2);
        concesionario.registrarCliente(cliente3);

        concesionario.imprimirClientes();
        return concesionario;
    }
}
