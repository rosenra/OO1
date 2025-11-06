package Ejercicio19.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Ejercicio16.ejercicio16.DateLapse;

public class ReservaTest {
    private Propiedad propiedad;
    private Usuario usuario;
    private DateLapse periodo;
    private Reserva reserva;

    @BeforeEach
    void setUp() {
        propiedad = new Propiedad("Calle 123", "Depto Azul", 1000);
        usuario = new Usuario("Rocío", "Necochea", 12345678);
        periodo = new DateLapse(LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 6)); // 5 días
        reserva = new Reserva(periodo, propiedad, usuario);
    }

    @Test
    void testCalcularPrecio() {
        assertEquals(5000, reserva.calcularPrecio(), 0.01);
    }

    @Test
    void testIsDisponible() {
        DateLapse otroPeriodo = new DateLapse(LocalDate.of(2025, 6, 10), LocalDate.of(2025, 6, 15));
        assertTrue(reserva.isDisponible(otroPeriodo)); // no se superpone

        DateLapse solapado = new DateLapse(LocalDate.of(2025, 6, 3), LocalDate.of(2025, 6, 10));
        assertFalse(reserva.isDisponible(solapado)); // se superpone
    }

    @Test
    void testGetters() {
        assertEquals(periodo, reserva.getPeriodo());
        assertEquals(usuario, reserva.getInquilino());
    }
}