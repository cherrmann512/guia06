package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import died.guia06.util.InscripcionAnuladaException;
import died.guia06.util.RegistroAuditoriaException;

class CursoTest {
	
	
	/*
	 * Dado a como defini desde el paso 2 y 3 los métodos de inscripción para poder testear
	 * hasta el momento el programa, los métodos de testing de la clase Alumno
	 * verifican el correcto funcionamiento de testeo. Por lo que aquí se verifica
	 * que el metodo Inscribir efectivamente devuelve true o false, dependiendo el caso
	 * 
	 */
	Alumno a1;
	Curso c1;
	Curso c2;
	Curso c3;
	Curso c4;
	Curso c5;
	Alumno a2;

	
	@BeforeEach
	void init() {
		c1 = new Curso();
		c1.setCreditos(3);
		c1.setCicloLectivo(1);
		c1.setCupo(5);
		c1.setCreditosRequeridos(0);
		c2= new Curso();
		c2.setCreditos(2);
		c2.setCicloLectivo(1);
		c2.setCreditosRequeridos(0);
		c2.setCupo(5);
		
		List<Curso> apr = new ArrayList<Curso>();
		apr.add(c1);
		apr.add(c2);
		
		c3 = new Curso();
		c3.setCreditos(3);
		c3.setCicloLectivo(1);
		c3.setCupo(5);
		c3.setCreditosRequeridos(3);
		
		c4 = new Curso();
		c4.setCreditos(3);
		c4.setCicloLectivo(1);
		c4.setCupo(5);
		c4.setCreditosRequeridos(2);
		
		List<Curso> curs = new ArrayList<Curso>();
		curs.add(c3);
		curs.add(c4);
		
		c5 = new Curso();
		c5.setCreditos(3);
		c5.setCicloLectivo(1);
		c5.setCupo(1);
		c5.setCreditosRequeridos(5);
		
		a1 = new Alumno("cristian", 2328, curs, apr);
		a2 = new Alumno("sebastian", 451);
		a2.setCursando(curs);
	}

//	@Test
//	void testInscripcionAlumno() {
//		assertTrue(c5.inscribir(a1));
//	}
//	
//	@Test
//	void testInscripcionFallida() {
//		assertFalse(c5.inscribir(a2));
//	}
	@Test
	void testInscripcionAlumno() throws InscripcionAnuladaException, RegistroAuditoriaException {
		assertTrue(c5.inscribirAlumno(a1));
	}
	@Test
	void testInscripcionFallida() throws RegistroAuditoriaException, InscripcionAnuladaException {
		assertFalse(c5.inscribirAlumno(a2));
	}

}
