import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ControladorEstudiante {

    private List<Estudiante> estudiantes;
    private Map<String, List<Estudiante>> grupos;
    private Set<Estudiante> estudiantesOrde;

    public ControladorEstudiante() {
        this.estudiantes = getListaEstudiantes();
        this.grupos = new HashMap<>();
        this.estudiantesOrde = estudiantesOrde;
    }

    public void ordenarEstudiantes() {
        estudiantes.sort(e1, e2) -> Integer.compare(e2.getCalificacion(), e1.getCalificacion());
        estudiantesOrde = new LinkedHashSet<>(estudiantes);
    }

    public void agruparEstudiantes() {
        for (Estudiante e : estudiantes) {
            String categoria = obtenerCategoria(e.getCalificacion());
        }
        grupos.computeIfAbsent(categoria, k -> new ArrayList<>());
    }

    public String obtenerCategoria(int calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }

    }

    public static List<Estudiante> getListado(int a, int b) {
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Juan", 85));
        estudiantes.add(new Estudiante("Carlos", 90));
        estudiantes.add(new Estudiante("María", 92));
        estudiantes.add(new Estudiante("Pedro", 78));
        estudiantes.add(new Estudiante("Gabriela", 91));
        estudiantes.add(new Estudiante("Ana", 88));
        estudiantes.add(new Estudiante("Luis", 75));
        estudiantes.add(new Estudiante("Carlos", 90));
        estudiantes.add(new Estudiante("Sofía", 83));
        estudiantes.add(new Estudiante("Diego", 95));
        estudiantes.add(new Estudiante("Valentina", 70));
        estudiantes.add(new Estudiante("Andrés", 65));
        estudiantes.add(new Estudiante("Camila", 88));
        estudiantes.add(new Estudiante("Ricardo", 80));
        estudiantes.add(new Estudiante("Gabriela", 91));
        estudiantes.add(new Estudiante("Esteban", 76));
        estudiantes.add(new Estudiante("Daniela", 84));
        estudiantes.add(new Estudiante("Sebastián", 92));
        estudiantes.add(new Estudiante("Carlos", 90));
        estudiantes.add(new Estudiante("Martina", 77));
        estudiantes.add(new Estudiante("Javier", 89));
        estudiantes.add(new Estudiante("Carlos", 90));
        estudiantes.add(new Estudiante("Isabella", 93));
        estudiantes.add(new Estudiante("Gabriela", 91));
        estudiantes.add(new Estudiante("Fernando", 68));

        return estudiantes;
    }

    public void mostrarEstudiantesOrdenados() {
        System.out.println("Lista de estudiantes ordena (descendente)");
        estudiantesOrde.forEach(System.out::println);
    }

    public void mostrarAgrupacion() {
        System.out.println("Agrupacion por categorias");
        for (Map.Entry<String, List<Estudiante>> entry : grupos.entrySet())
            ;

        System.out.println("Categoria " + entry.getKey() + " " + entry.getvalue());
    }

}
