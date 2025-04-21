import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

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
//A5
    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
        Alumno mejorAlumno = null;
        double mejorPromedio = 0;

        for (DivisionCurso division : divisionCursos) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    LocalDate fechaNac = alumno.getFechaNacimiento();
                    int anioNacimiento = fechaNac.getYear();

                    if (anioNacimiento == anioNacimientoAlumno) {
                        boolean tieneDesaprobadas = false;
                        double sumaNotas = 0;
                        int cantidadNotas = 0;

                        for (Nota nota : alumno.getNotas()) {
                            if (nota.getValor() < 6) {
                                tieneDesaprobadas = true;
                                break;
                            }
                            sumaNotas += nota.getValor();
                            cantidadNotas++;
                        }

                        if (!tieneDesaprobadas && cantidadNotas > 0) {
                            double promedio = sumaNotas / cantidadNotas;
                            if (promedio > mejorPromedio || mejorAlumno == null) {
                                mejorPromedio = promedio;
                                mejorAlumno = alumno;
                            }
                        }
                    }
                }
            }
        }

        return mejorAlumno;
    }

//A6
    public List<Alumno> getMejoresAlumnos(int anioNacimientoAlumno){
       List<Alumno> mejoresAlumnos = new ArrayList<>();

        for (DivisionCurso division : divisionCursos) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {

                    if (anioNacimientoAlumno == alumno.getFechaNacimiento().getYear() && !alumno.tieneRecuperatorios()) {
                        double promedioActual = alumno.promedioNotas(null);

                        if (mejoresAlumnos.size() < 3) {
                            mejoresAlumnos.add(alumno);
                        } else {
                            // Encontramos el alumno con menor promedio
                            int indiceMenor = 0;
                            double promedioMenor = mejoresAlumnos.get(0).promedioNotas(null);

                            // recorremos la lista para encontrar el menor promedio
                            for (int i = 1; i < mejoresAlumnos.size(); i++) {
                                double promedioTemp = mejoresAlumnos.get(i).promedioNotas(null);
                                if (promedioTemp < promedioMenor) {
                                    promedioMenor = promedioTemp;
                                    indiceMenor = i;
                                }
                            }

                            // Si el alumno actual tiene mejor promedio que el promedio menor, lo reemplazamos
                            if (promedioActual > promedioMenor) {
                                mejoresAlumnos.remove(indiceMenor);
                                mejoresAlumnos.add(alumno);
                            }
                        }
                    }

                }
            }
        }
        return mejoresAlumnos;
    }


}
