package died.guia06;

import java.util.ArrayList;

import died.guia06.util.InscripcionAnuladaException;
import died.guia06.util.RegistroAuditoriaException;

public class App {

	public static void main(String[] args) throws InscripcionAnuladaException, RegistroAuditoriaException {
		
		//new Curso(id, nombre, cicloLectivo, cupo, inscriptos, creditos, creditosRequeridos)
		Curso c1 = new Curso(1, "Algoritmos", 1, 5, new ArrayList<Alumno>(), 10, 0);
		Curso c2 = new Curso(2, "Estructura de datos", 1, 5, new ArrayList<Alumno>(), 10, 30);
		Curso c3 = new Curso(3, "Java", 1, 10, new ArrayList<Alumno>(), 10, 0);
		Curso c4 = new Curso(4, "Base de Datos", 1, 10, new ArrayList<Alumno>(), 10, 0);
		Curso c5 = new Curso(5, "Sintaxis y Semantica de los lenguajes", 2, 5, new ArrayList<Alumno>(), 10, 30);
		Curso c6 = new Curso(6, "PHP", 2, 10, new ArrayList<Alumno>(), 10, 10);
		Curso c7 = new Curso(7, "CSS", 2, 10, new ArrayList<Alumno>(), 10, 10);
		Curso c8 = new Curso(8, "Javascript", 3, 10, new ArrayList<Alumno>(), 10, 20);
		Curso c9 = new Curso(9, "DIED", 3, 10, new ArrayList<Alumno>(), 10, 50);
		Curso c10 = new Curso(10, "Administracion de Base de datos", 3, 6, new ArrayList<Alumno>(), 10, 20);
		Curso c11 = new Curso(11, "CCNA1", 1, 5, new ArrayList<Alumno>(), 10, 0);
		Curso c12 = new Curso(12, "Diagnostico y mantenimiento de PC", 1, 5, new ArrayList<Alumno>(), 10, 0);
		Curso c13 = new Curso(13, "Office", 1, 5, new ArrayList<Alumno>(), 10, 20);
		Curso c14 = new Curso(14, "C++", 1, 5, new ArrayList<Alumno>(), 10, 0);
		
		Alumno a1 = new Alumno("Martin Palermo", 1234);
		Alumno a2 = new Alumno("Juan Roman Riquelme", 3214);
		Alumno a3 = new Alumno("Fernando Alonso", 1445);
		Alumno a4 = new Alumno("Gabriel Avalos", 3512);
		Alumno a5 = new Alumno("Eduardo Salvio", 8754);
		Alumno a6 = new Alumno("Jose Sand", 1256);
		
//		c1.inscribir(a1);
//		c1.inscribir(a2);
//		c1.inscribir(a3);
//		c1.inscribir(a4);
//		c1.inscribir(a5);
//		
//		c3.inscribir(a1);
//		c3.inscribir(a2);
//		c3.inscribir(a3);
//		c3.inscribir(a4);
//		c3.inscribir(a5);
//		
//		c4.inscribir(a1);
//		c4.inscribir(a2);
//		c4.inscribir(a3);
//		c4.inscribir(a4);
//		
//		
//		c1.imprimirInscriptos();
//		System.out.println();
//		c3.imprimirInscriptosNroLibreta();
//		System.out.println();
//		
//		a1.aprobar(c1);
//		a2.aprobar(c1);
//		a1.aprobar(c3);
//		
//		c4.imprimirInscriptosCreditos();
//		System.out.println();
//		
//		c14.inscribir(a1);
//		c14.inscribir(a2);
//		
//		c14.imprimirInscriptos();
//		System.out.println();
//		a1.aprobar(c14);
//		
//		c14.imprimirInscriptos();
//		System.out.println();
//		c5.inscribir(a1);
//		c5.inscribir(a2);
//		c2.inscribir(a1);
//		c5.imprimirInscriptosCreditos();
//		a2.aprobar(c3);
//		a1.aprobar(c4);
//		a2.aprobar(c4);
//		
//		System.out.println();
//		c4.imprimirInscriptosNroLibreta();
//		
//		a3.aprobar(c1);
//		a3.aprobar(c3);
//		
//		c6.inscribir(a1);
//		c6.inscribir(a3);
//		c7.inscribir(a1);
//		c7.inscribir(a3);
//		c8.inscribir(a1);
//		c8.inscribir(a3);
//		
//		System.out.println();
//		c6.imprimirInscriptos();
//		System.out.println();
//		c7.imprimirInscriptosCreditos();
//		System.out.println();
//		c8.imprimirInscriptosNroLibreta();
//		System.out.println();
//		
//		c10.inscribir(a1);
//		c10.imprimirInscriptos();
		
		c1.inscribirAlumno(a1);
		c1.inscribirAlumno(a2);
		c1.inscribirAlumno(a3);
		c1.inscribirAlumno(a4);
		c1.inscribirAlumno(a5);
		
		c3.inscribirAlumno(a1);
		c3.inscribirAlumno(a2);
		c3.inscribirAlumno(a3);
		c3.inscribirAlumno(a4);
		c3.inscribirAlumno(a5);
		
		c4.inscribirAlumno(a1);
		c4.inscribirAlumno(a2);
		c4.inscribirAlumno(a3);
		c4.inscribirAlumno(a4);
		
		
		c1.imprimirInscriptos();
		System.out.println();
		c3.imprimirInscriptosNroLibreta();
		System.out.println();
		
		a1.aprobar(c1);
		a2.aprobar(c1);
		a1.aprobar(c3);
		
		c4.imprimirInscriptosCreditos();
		System.out.println();
		
		c14.inscribirAlumno(a1);
		c14.inscribirAlumno(a2);
		
		c14.imprimirInscriptos();
		System.out.println();
		a1.aprobar(c14);
		
		c14.imprimirInscriptos();
		System.out.println();
		c5.inscribirAlumno(a1);
		c5.inscribirAlumno(a2);
		c2.inscribirAlumno(a1);
		c5.imprimirInscriptosCreditos();
		a2.aprobar(c3);
		a1.aprobar(c4);
		a2.aprobar(c4);
		
		System.out.println();
		c4.imprimirInscriptosNroLibreta();
		
		a3.aprobar(c1);
		a3.aprobar(c3);
		
		c6.inscribirAlumno(a1);
		c6.inscribirAlumno(a3);
		c7.inscribirAlumno(a1);
		c7.inscribirAlumno(a3);
		c8.inscribirAlumno(a1);
		c8.inscribirAlumno(a3);
		
		System.out.println();
		c6.imprimirInscriptos();
		System.out.println();
		c7.imprimirInscriptosCreditos();
		System.out.println();
		c8.imprimirInscriptosNroLibreta();
		System.out.println();
		
		c10.inscribirAlumno(a1);
		c10.imprimirInscriptos();
		System.out.println();
		

		
		
		
	}
}
