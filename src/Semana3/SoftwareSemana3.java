package Semana3;

class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public String getUsername() { return this.username; }
    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        }
    }

    public String getCorreo() { return this.correo; }
    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        }
    }

    public int getNivel() { return this.nivel; }
    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public boolean isActivo() { return this.activo; }
    public void activar() { this.activo = true; }
    public void desactivar() { this.activo = false; }
}

class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getProgreso() { return this.progreso; }
    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (this.progreso == 100) this.terminado = true;
        }
    }

    public String getResponsable() { return this.responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public boolean isTerminado() { return this.terminado; }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0 && (this.progreso + porcentaje) <= 100) {
            this.progreso += porcentaje;
            if (this.progreso == 100) this.terminado = true;
        }
    }
}

class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
    }

    public int getPuerto() { return this.puerto; }
    public void setPuerto(int puerto) {
        if (puerto > 0) this.puerto = puerto;
    }

    public boolean isActivo() { return this.activo; }
    public int getCantidadPeticiones() { return this.cantidadPeticiones; }

    public void iniciar() { this.activo = true; }
    public void detener() { this.activo = false; }
    public void registrarPeticion() {
        if (this.activo) this.cantidadPeticiones++;
    }
}

public class SoftwareSemana3 {
    public static void main(String[] args) {
        System.out.println("=== SW2.1 — USUARIO DEL SISTEMA ===");
        Usuario u = new Usuario();
        u.setUsername("admin");
        u.setCorreo("admin@mail.com");
        u.setNivel(1);
        u.setUsername(""); // Ignorada
        u.setNivel(-5);    // Ignorada
        u.activar();
        System.out.println("Usuario: " + u.getUsername() + " | Nivel: " + u.getNivel() + " | Activo: " + u.isActivo());

        System.out.println("\n=== SW2.2 — PROYECTO DE SOFTWARE ===");
        Proyecto p = new Proyecto();
        p.setNombre("Sistema Web");
        p.setResponsable("Matias");
        p.setProgreso(80);
        p.avanzar(15);
        System.out.println("Progreso actual: " + p.getProgreso() + "%");
        p.avanzar(10); // Excede 100%, ignorada
        System.out.println("Progreso tras valor inválido: " + p.getProgreso() + "%");

        System.out.println("\n=== SW2.3 — SERVICIO DE SOFTWARE ===");
        Servicio s = new Servicio();
        s.setNombre("Autenticación");
        s.setPuerto(8080);
        s.iniciar();
        s.registrarPeticion();
        s.registrarPeticion();
        System.out.println("Servicio " + s.getNombre() + " en puerto " + s.getPuerto() + " - Peticiones: " + s.getCantidadPeticiones());
    }
}