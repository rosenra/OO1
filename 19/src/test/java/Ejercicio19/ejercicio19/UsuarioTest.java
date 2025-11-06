package Ejercicio19.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Ejercicio16.ejercicio16.DateLapse;

public class UsuarioTest {
    private Usuario usuario;
    private Propiedad propiedad1;
    private Propiedad propiedad2;
    private DateLapse periodo;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Rocío", "CABA", 11223344);
        propiedad1 = new Propiedad("San Martín 123", "Depto Centro", 100);
        propiedad2 = new Propiedad("Corrientes 456", "Depto Norte", 200);

        usuario.getPropiedades().add(propiedad1);
        usuario.getPropiedades().add(propiedad2);

        periodo = new DateLapse(LocalDate.of(2025, 8, 1), LocalDate.of(2025, 8, 4)); // 3 días
    }

    @Test
    void testReservar() {
        Reserva r = usuario.reservar("Depto Centro", periodo);
        assertNotNull(r);
        assertEquals(propiedad1.getNombre(), r.getPeriodo().getFrom().isEqual(periodo.getFrom()) ? propiedad1.getNombre() : null);
    }

    @Test
    void testReservarPropiedadInexistente() {
        assertNull(usuario.reservar("No existe", periodo));
    }

    @Test
    void testCalcularMonto() {
        propiedad1.reservar(periodo, usuario);
        propiedad2.reservar(periodo, usuario);
        double monto = usuario.calcularMonto(periodo);
        // (3*100 + 3*200) * 0.75 = 900 * 0.75 = 675
        assertEquals(675, monto, 0.01);
    }

    @Test
    void testGetters() {
        assertEquals("Rocío", usuario.getNombre());
        assertEquals("CABA", usuario.getDireccion());
        assertEquals(11223344, usuario.getDni());
    }
}
