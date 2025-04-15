import java.util.ArrayList;
import java.util.List;

public class DivisionCurso {

    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras = new ArrayList<>();

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }
}
