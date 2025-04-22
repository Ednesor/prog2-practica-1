import java.util.ArrayList;
import java.util.List;

public class Catedra {

    private int codigo;
    private String denominacion;
    private DivisionCurso divisionCurso;
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();

    public Catedra() {
    }

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public DivisionCurso getDivisionCurso() {
        return divisionCurso;
    }

    public void setDivisionCurso(DivisionCurso divisionCurso) {
        this.divisionCurso = divisionCurso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Alumno mejorAlumnoCatedra(){
        if(this.alumnos.size() == 0) return null;
        Alumno notaMasAlta = this.alumnos.getFirst();
        for (int i = 1; i < this.alumnos.size(); i++) {
            System.out.println(this.alumnos.get(i));
            if(this.alumnos.get(i).promedioNotas(this.codigo) > notaMasAlta.promedioNotas((this.codigo))) notaMasAlta = this.alumnos.get(i);
        }
        return notaMasAlta;
    }
}
