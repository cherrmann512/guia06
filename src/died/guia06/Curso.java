package died.guia06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import died.guia06.util.ComparadorCreditos;
import died.guia06.util.ComparadorNroLibreta;
import died.guia06.util.Registro;

/**
 * Clase que representa un curso. Un curso se identifica por su ID y por su nombre y ciclo lectivo.
 * Un curso guarda una lista de los inscriptos actuales que tienen.
 * Un curso, al aprobarlo, otorga una cantidad de creditos definidas en el curso.
 * Un curso requiere que para inscribirnos tengamos al menos la cantidad de creditos requeridas, y que haya cupo disponible
 * @author marti
 *
 */
public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
	}
	

	public Curso(Integer id, String nombre, Integer cicloLectivo, Integer cupo, List<Alumno> inscriptos,
			Integer creditos, Integer creditosRequeridos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cicloLectivo = cicloLectivo;
		this.cupo = cupo;
		this.inscriptos = inscriptos;
		this.creditos = creditos;
		this.creditosRequeridos = creditosRequeridos;
		this.log = new Registro();
	}


	public Integer getCupo() {
		return cupo;
	}


	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}


	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}


	public List<Alumno> getInscriptos() {
		return inscriptos;
	}


	public void setInscriptos(List<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}


	public Integer getCreditosRequeridos() {
		return creditosRequeridos;
	}


	public void setCreditosRequeridos(Integer creditosRequeridos) {
		this.creditosRequeridos = creditosRequeridos;
	}


	public void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}


	public Integer getCreditos() {
		return creditos;
	}
	public Integer getCicloLectivo() {
		return cicloLectivo;
	}
	

	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	public Boolean inscribir(Alumno a) {
		try {
			if(a.creditosObtenidos()>=this.creditosRequeridos &&
					(this.inscriptos == null || this.cupo>this.inscriptos.size()) && 
					a.cursosCicloLectivo(this.cicloLectivo)) {
				this.inscriptos.add(a);
				a.inscripcionAceptada(this);
				log.registrar(this, "inscribir ",a.toString());
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	
	/**
	 * imprime los inscriptos en orden alfabetico
	 */
	public void imprimirInscriptos() {
		try {
			Collections.sort(inscriptos);
			System.out.println("Alumnos inscriptos en "+this.nombre);
			for (Alumno a : inscriptos) {
				System.out.println(a.toString());
			}
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//imprime inscriptos ordenados por el numero de libreta
	public void imprimirInscriptosNroLibreta() {
		try {
			ComparadorNroLibreta comparador = new ComparadorNroLibreta();
			Collections.sort(inscriptos, comparador);
			System.out.println("Alumnos inscriptos en "+this.nombre);
			for (Alumno a : inscriptos) {
				System.out.println(a.toString());
			}
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public void imprimirInscriptosCreditos() {
		try {
			ComparadorCreditos comparador = new ComparadorCreditos();
			Collections.sort(inscriptos, comparador);
			System.out.println("Alumnos inscriptos en "+this.nombre);
			for (Alumno a : inscriptos) {
				System.out.println(a.toString());
			}
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
