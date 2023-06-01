import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Socio> socios = new ArrayList<>();
        socios.add(new Socio("12345678A", "Ana", LocalDate.of(1990, 5, 15), LocalDate.now(), 120.0, 2));
        socios.add(new Socio("98765432B", "Carlos", LocalDate.of(1985, 8, 25), LocalDate.now(), 90.0, 1));
        socios.add(new Socio("56789012C", "Alberto", LocalDate.of(1987, 12, 10), LocalDate.now(), 150.0, 3));
        socios.add(new Socio("34567890D", "Antonio", LocalDate.of(1995, 2, 8), LocalDate.now(), 80.0, 2));
        socios.add(new Socio("45678901E", "Alicia", LocalDate.of(1992, 11, 20), LocalDate.now(), 110.0, 1));

        System.out.println("Socios ordenados por DNI:");
        Stream<Socio> socioStreamDni = socios.stream()
                .sorted();
        socioStreamDni.forEach(System.out::println);


        System.out.println("\nSocios con cuota mayor a 100€:");
        Stream<Socio> socioStreamCuota = socios.stream()
                .filter(socio -> socio.getCuota() > 100);
        socioStreamCuota.forEach(System.out::println);

        System.out.println("\nSocios cuyo nombre empieza por A:");
        Stream<Socio> socioStreamNombre = socios.stream()
                .filter(socio -> socio.getNombre().startsWith("A"));
        socioStreamNombre.forEach(System.out::println);
    }
}
