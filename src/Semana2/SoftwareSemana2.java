package Semana2;


class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Videojuego: " + nombre + " | Género: " + genero + " | Versión: " + version + " | Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El juego " + nombre + " ha sido iniciado.");
    }

    void cerrar() {
        activo = false;
        System.out.println("El juego " + nombre + " ha sido cerrado.");
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}

class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre + " | Lenguaje: " + lenguaje + " | Versión: " + version + " | Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("Módulo " + nombre + " completado.");
    }

    void mostrarEstado() {
        System.out.println("Estado de " + nombre + " (Terminado): " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}

class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("Tarea: " + titulo + " | Responsable: " + responsable + " | Horas: " + horasEstimadas + " | Completada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("La tarea '" + titulo + "' ha sido completada.");
    }

    void mostrarResponsable() {
        System.out.println("Responsable de " + titulo + ": " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Tarea '" + titulo + "' completada: " + completada);
    }
}

public class SoftwareSemana2 {
    public static void main(String[] args) {
        System.out.println("=== SW1.1 — VIDEOJUEGO ===");
        Videojuego vj1 = new Videojuego();
        vj1.nombre = "Minecraft";
        vj1.genero = "Sandbox";
        vj1.version = "1.20";
        vj1.activo = false;

        Videojuego vj2 = new Videojuego();
        vj2.nombre = "Valorant";
        vj2.genero = "FPS";
        vj2.version = "7.08";
        vj2.activo = false;

        Videojuego vj3 = new Videojuego();
        vj3.nombre = "Tetris";
        vj3.genero = "Puzzle";
        vj3.version = "1.0";
        vj3.activo = false;

        vj1.iniciar();
        vj2.cerrar();
        vj1.mostrarInformacion();
        vj2.mostrarInformacion();
        vj3.mostrarInformacion();

        System.out.println("\n=== SW1.2 — MÓDULO DE SOFTWARE ===");
        Modulo m1 = new Modulo();
        m1.nombre = "Login";
        m1.lenguaje = "Java";
        m1.version = "1.0";
        m1.terminado = false;

        Modulo m2 = new Modulo();
        m2.nombre = "Inventario";
        m2.lenguaje = "Java";
        m2.version = "2.0";
        m2.terminado = false;

        Modulo m3 = new Modulo();
        m3.nombre = "Reportes";
        m3.lenguaje = "Python";
        m3.version = "1.1";
        m3.terminado = false;

        m1.marcarTerminado();
        m1.mostrarEstado();
        m2.mostrarEstado();
        m3.mostrarEstado();

        System.out.println("\n=== SW1.3 — TAREA DE DESARROLLO ===");
        Tarea t1 = new Tarea();
        t1.titulo = "Diseñar DB";
        t1.responsable = "Carlos";
        t1.horasEstimadas = 5.0;
        t1.completada = false;

        Tarea t2 = new Tarea();
        t2.titulo = "Crear API";
        t2.responsable = "Ana";
        t2.horasEstimadas = 3.5;
        t2.completada = false;

        Tarea t3 = new Tarea();
        t3.titulo = "Pruebas";
        t3.responsable = "Luis";
        t3.horasEstimadas = 8.0;
        t3.completada = false;

        t2.completar();
        t1.mostrarEstado();
        t2.mostrarEstado();
        t3.mostrarEstado();
    }
}