package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {
	Alumno a1;
	Alumno a2;
	Alumno a3;
	Alumno a4;
	Curso c1;
	Curso c2;
	Curso c3;
	Curso c4;
	Curso c5;
	Curso c6;
	Curso c7;
	
	
	@BeforeEach
	void init() {
		a1= new Alumno("cristian", 23223);
		c1= new Curso();
		c1.setCreditos(3);
		c1.setCicloLectivo(1);
		c1.setCupo(5);
		c1.setCreditosRequeridos(0);
		c2=new Curso();
		c2.setCreditos(2);
		c2.setCicloLectivo(1);
		c2.setCreditosRequeridos(0);
		c2.setCupo(5);
		List<Curso> apr1 = new ArrayList<Curso>();
		apr1.add(c1);
		apr1.add(c2);
		a1.setAprobados(apr1);
		c3 = new Curso();
		List<Curso> curs1 =new ArrayList<Curso>();
		curs1.add(c3);
		a1.setCursando(curs1);
		
		
		a2 = new Alumno("sebastian", 2315);
		a2.setAprobados(apr1);
		c4 = new Curso();
		c4.setCreditos(3);
		c4.setCicloLectivo(1);
		c4.setCupo(5);
		c4.setCreditosRequeridos(0);
		c5 = new Curso();
		c5.setCreditos(2);
		c5.setCicloLectivo(1);
		c5.setCreditosRequeridos(0);
		c5.setCupo(5);
		c6 = new Curso();
		c6.setCreditos(5);
		c6.setCicloLectivo(1);
		c6.setCupo(1);
		c6.setCreditosRequeridos(5);
		List<Curso> curs2 =new ArrayList<Curso>();
		curs2.add(c4);
		curs2.add(c5);
		a2.setCursando(curs2);
		
		c7 = new Curso();
		c7.setCupo(2);
		c7.setCicloLectivo(1);
		c7.setCreditosRequeridos(0);
		
		List<Alumno> inscr = new ArrayList<Alumno>();
		inscr.add(a1);
		inscr.add(a2);
		c7.setInscriptos(inscr);
		a3 = new Alumno("federico", 231);
		List<Curso> curs3 =new ArrayList<Curso>();
		curs3.add(c1);
		curs3.add(c2);
		curs3.add(c4);
		a4 = new Alumno("Pablo", 1421);
		a4.setCursando(curs3);
	}

	@Test
	void testCreditosObtenidos() {
		int esperado =5;
		assertEquals(esperado, a1.creditosObtenidos());
	}

	@Test
	void testAprobar() {
		a1.aprobar(c3);
		assertTrue(a1.getAprobados().contains(c3) && !a1.getCursando().contains(c3));
	}
	
//el metodo inscribir llama al metodo inscripcion aceptada de la clase Alumno
	
	@Test
	void testInscripcionAceptada() {
		c4.inscribir(a2);
		assertTrue(a2.getCursando().contains(c4));
	}
	
	@Test
	void testIncripcionNoAceptadaCupo() {
		c7.inscribir(a3);
		assertFalse(a3.getCursando().contains(c7));
	}
	
	@Test
	void testIncripcionNoAceptadaCreditos() {
		c3.inscribir(a3);
		assertFalse(a3.getCursando().contains(c3));
	}
	@Test
	void testInscripcionNoAceptadaCicloLectivo() {
		c5.inscribir(a4);
		assertFalse(a4.getCursando().contains(c5));
	}

}
