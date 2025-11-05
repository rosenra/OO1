package Ejercicio16.ejercicio16;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	DateLapse periodo;
	LocalDate from = LocalDate.of(2025, 6, 1);
	LocalDate to = LocalDate.of(2025, 6, 30);
	@BeforeEach
	void setUp() throws Exception { //throws exception para evitar hacer un try-except en caso de que falle el setup()
		periodo = new DateLapse(from,to);
	}
	@Test
	void testSizeInDays() {
		assertEquals(29,periodo.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		assertTrue(periodo.includesDate(from));
		assertTrue(periodo.includesDate(to));
		assertFalse(periodo.includesDate(null));
	}

}
