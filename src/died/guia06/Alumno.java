package died.guia06;

import java.util.List;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;
	
	public Alumno(String nombre, Integer nroLibreta, List<Curso> cursando, List<Curso> aprobados) {
		super();
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;
		this.cursando = cursando;
		this.aprobados = aprobados;
	}
	
	public Alumno(String nombre, Integer nroLibreta) {
		super();
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;
	}


	public int creditosObtenidos() {
		int sumacreditos=0;
		for (Curso c : aprobados) {
			sumacreditos += c.getCreditos();
		}
		return sumacreditos;
	}

	public void aprobar(Curso c) {
		if(this.cursando.contains(c)) {
			this.cursando.remove(c);
			this.aprobados.add(c);
		}
	}

	public void inscripcionAceptada(Curso c) {
		if(c.inscribir(this)) {
			this.cursando.add(c);
		}
	}
	
	
	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Alumno && this.nroLibreta == ((Alumno)obj).nroLibreta)
			return true;
		return false;
	}
	
	public boolean cursosCicloLectivo(int ciclo) {
		int aux=0;
		for (Curso curso : cursando) {
			if(curso.getCicloLectivo() == ciclo)
				aux++;
		}
		if(aux>=3) {
			return false;
		}
		else return true;
	}

}
