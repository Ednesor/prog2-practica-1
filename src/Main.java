import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Crear una Escuela
        Escuela escuela = new Escuela(1, "UTN-FRM");

        // Crear una DivisionCurso
        DivisionCurso divisionCurso = new DivisionCurso(101, 2023, 1);
        divisionCurso.setEscuela(escuela);
        escuela.getDivisionCursos().add(divisionCurso);

        // Crear MATERIA
        Catedra catedra1 = new Catedra(1, "Programacion 1");
        catedra1.setDivisionCurso(divisionCurso);
        divisionCurso.getCatedras().add(catedra1);

        Catedra catedra2 = new Catedra(2, "Matematica");
        catedra2.setDivisionCurso(divisionCurso);
        divisionCurso.getCatedras().add(catedra2);

        // Crear Alumnos
        Alumno alumno1 = new Alumno(12345, "Juan", "Perez", LocalDate.of(2000, 1, 15));
        alumno1.setCatedra(catedra1);
        catedra1.getAlumnos().add(alumno1);

        Alumno alumno2 = new Alumno(54321, "Maria", "Gomez", LocalDate.of(2000, 6, 20));
        alumno2.setCatedra(catedra1);
        catedra1.getAlumnos().add(alumno2);

        Alumno alumno3 = new Alumno(98765, "Carlos", "Lopez", LocalDate.of(2001, 11, 10));
        alumno3.setCatedra(catedra2);
        catedra2.getAlumnos().add(alumno3);

        Alumno alumno4 = new Alumno(11111, "Ana", "Martinez", LocalDate.of(2000, 3, 25));
        alumno4.setCatedra(catedra1);
        catedra1.getAlumnos().add(alumno4);

        Alumno alumno5 = new Alumno(22222, "Pedro", "Rodriguez", LocalDate.of(2000, 5, 15));
        alumno5.setCatedra(catedra2);
        catedra2.getAlumnos().add(alumno5);

        Alumno alumno6 = new Alumno(33333, "Laura", "Sanchez", LocalDate.of(2000, 7, 8));
        alumno6.setCatedra(catedra1);
        catedra1.getAlumnos().add(alumno6);

        Alumno alumno7 = new Alumno(44444, "Diego", "Torres", LocalDate.of(2000, 9, 30));
        alumno7.setCatedra(catedra2);
        catedra2.getAlumnos().add(alumno7);

        Alumno alumno8 = new Alumno(55555, "Sofia", "Ruiz", LocalDate.of(2000, 12, 12));
        alumno8.setCatedra(catedra1);
        catedra1.getAlumnos().add(alumno8);


        // Crear Notas
        Nota nota1 = new Nota(1, 8.5, LocalDate.of(2023, 3, 10), false);
        nota1.setAlumno(alumno1);
        nota1.setCatedra(catedra1);
        alumno1.getNotas().add(nota1);
        catedra1.getNotas().add(nota1);

        Nota nota2 = new Nota(2, 6.0, LocalDate.of(2023, 4, 15), true); // Recuperatorio
        nota2.setAlumno(alumno1);
        nota2.setCatedra(catedra1);
        alumno1.getNotas().add(nota2);
        alumno1.getNotas().add(nota2);
        alumno1.getNotas().add(nota2);
        alumno1.getNotas().add(nota2);
        catedra1.getNotas().add(nota2);

        Nota nota3 = new Nota(3, 9.0, LocalDate.of(2023, 3, 20), false);
        nota3.setAlumno(alumno2);
        nota3.setCatedra(catedra1);
        alumno2.getNotas().add(nota3);
        alumno2.getNotas().add(nota3);
        alumno2.getNotas().add(nota3);
        alumno2.getNotas().add(nota3);
        alumno2.getNotas().add(nota3);
        catedra1.getNotas().add(nota3);

        Nota nota4 = new Nota(4, 7.5, LocalDate.of(2023, 3, 25), false);
        nota4.setAlumno(alumno3);
        nota4.setCatedra(catedra2);
        alumno3.getNotas().add(nota4);
        alumno3.getNotas().add(nota4);
        alumno3.getNotas().add(nota4);
        alumno3.getNotas().add(nota4);
        alumno3.getNotas().add(nota4);
        catedra2.getNotas().add(nota4);

        Nota nota5 = new Nota(5, 5.0, LocalDate.of(2023, 4, 25), true);
        nota5.setAlumno(alumno3);
        nota5.setCatedra(catedra2);
        alumno3.getNotas().add(nota5);
        catedra2.getNotas().add(nota5);

        Nota nota6 = new Nota(6, 9.5, LocalDate.of(2023, 3, 15), false);
        nota6.setAlumno(alumno4);
        nota6.setCatedra(catedra1);
        alumno4.getNotas().add(nota6);
        catedra1.getNotas().add(nota6);

        Nota nota7 = new Nota(7, 8.0, LocalDate.of(2023, 3, 18), false);
        nota7.setAlumno(alumno5);
        nota7.setCatedra(catedra2);
        alumno5.getNotas().add(nota7);
        catedra2.getNotas().add(nota7);

        Nota nota8 = new Nota(8, 7.0, LocalDate.of(2023, 3, 20), false);
        nota8.setAlumno(alumno6);
        nota8.setCatedra(catedra1);
        alumno6.getNotas().add(nota8);
        catedra1.getNotas().add(nota8);

        Nota nota9 = new Nota(9, 9.8, LocalDate.of(2023, 3, 22), false);
        nota9.setAlumno(alumno7);
        nota9.setCatedra(catedra2);
        alumno7.getNotas().add(nota9);
        catedra2.getNotas().add(nota9);

        Nota nota10 = new Nota(10, 6.5, LocalDate.of(2023, 3, 25), false);
        nota10.setAlumno(alumno8);
        nota10.setCatedra(catedra1);
        alumno8.getNotas().add(nota10);
        catedra1.getNotas().add(nota10);


        // Ejemplos de uso de los métodos
        System.out.println("Mejor nota de " + alumno1.getNombre() + " en Programacion 1: " + alumno1.mejorNota(catedra1.getCodigo()).getValor());
        System.out.println("Promedio de notas de " + alumno1.getNombre() + " en general: " + alumno1.promedioNotas(null));
        System.out.println("Alumno con mejor promedio en Programacion 1: "+ catedra1.mejorAlumnoCatedra() ); //Falta implementar mejorAlumnoCatedra
        System.out.println("Alumno con mejor promedio en la DivisionCurso: " + divisionCurso.mejorAlumnoDivisionCurso());
        System.out.println("Mejor alumno de la escuela nacido en 2000: " + escuela.getMejorAlumnoEscuela(2000));
        System.out.println("Los 3 mejores alumnos de la escuela nacidos en 2000: " + escuela.getMejoresAlumnos(2000));
    }
}