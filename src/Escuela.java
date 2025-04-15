import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisionCursos = new ArrayList<>();

    public Escuela() {
    }

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }

    public Escuela(int numero, String denominacion, List<DivisionCurso> divisionCursos) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.divisionCursos = divisionCursos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisionCursos() {
        return divisionCursos;
    }

    public void setDivisionCursos(List<DivisionCurso> divisionCursos) {
        this.divisionCursos = divisionCursos;
    }
}
