public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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

}
