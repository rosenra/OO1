package Ejercicio19.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Ejercicio16.ejercicio16.DateLapse;

public class PropiedadTest {
    private Propiedad propiedad;
    private Usuario inquilino;
    private DateLapse periodo;

    @BeforeEach
    void setUp() {
        propiedad = new Propiedad("Av. Siempre Viva 742", "Casa Verde", 200);
        inquilino = new Usuario("Juan", "La Plata", 9876543);
        periodo = new DateLapse(LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 4)); // 3 días
    }

    @Test
    void testReservarYDisponibilidad() {
        assertTrue(propiedad.isDisponible(periodo));

        Reserva r = propiedad.reservar(periodo, inquilino);
        assertNotNull(r);
        assertFalse(propiedad.isDisponible(periodo)); // ahora ya no disponible
    }

    @Test
    void testCancelarReserva() {
    	// Reserva futura → se puede cancelar
        DateLapse futura = new DateLapse(LocalDate.now().plusDays(5), LocalDate.now().plusDays(10));
        Reserva r = propiedad.reservar(futura, inquilino);
        
        assertTrue(propiedad.cancelarReserva(r), 
            "Una reserva futura debería poder cancelarse");
        assertFalse(propiedad.getReservas().contains(r), 
            "La reserva futura debe eliminarse de la lista");
        
     // Reserva actual (en curso) → NO se puede cancelar
        DateLapse enCurso = new DateLapse(LocalDate.now().minusDays(1), LocalDate.now().plusDays(2));
        r = propiedad.reservar(enCurso, inquilino);
        
        assertFalse(propiedad.cancelarReserva(r), 
            "Una reserva en curso no debería poder cancelarse");
        assertTrue(propiedad.getReservas().contains(r), 
            "La reserva en curso debe seguir registrada");
        
        // Reserva pasada → se puede cancelar
        DateLapse pasada = new DateLapse(LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        r = propiedad.reservar(pasada, inquilino);
        
        assertTrue(propiedad.cancelarReserva(r), 
            "Una reserva ya finalizada debería poder cancelarse");
        assertFalse(propiedad.getReservas().contains(r), 
            "La reserva pasada debe eliminarse de la lista");
    }

  
    @Test
    void testCalcularTotal() {
        propiedad.reservar(periodo, inquilino);
        double total = propiedad.calcularTotal(periodo);
        assertEquals(600, total, 0.01); // 3 días * 200
    }
}
