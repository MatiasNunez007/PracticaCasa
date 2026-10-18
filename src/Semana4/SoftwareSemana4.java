package Semana4;

class UsuarioRegistrado {
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;

    public UsuarioRegistrado(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    public int getId() { return this.id; }
    public String getUsername() { return this.username; }
    public static int getTotalUsuarios() { return contadorUsuarios; }
}

class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public void iniciar() { this.ejecutando = true; }
    public void cerrar() { this.ejecutando = false; }
    public static int getTotalAplicaciones() { return totalAplicaciones; }
}

class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
        }
    }

    public static int getTotalServidores() { return totalServidores; }
    public static int getServidoresActivos() { return servidoresActivos; }
}

public class SoftwareSemana4 {
    public static void main(String[] args) {
        System.out.println("=== SW3.1 — USUARIOS REGISTRADOS ===");
        UsuarioRegistrado u1 = new UsuarioRegistrado("user1", "u1@mail.com");
        UsuarioRegistrado u2 = new UsuarioRegistrado("user2", "u2@mail.com");
        UsuarioRegistrado u3 = new UsuarioRegistrado("user3", "u3@mail.com");
        UsuarioRegistrado u4 = new UsuarioRegistrado("user4", "u4@mail.com");
        System.out.println("ID Usuario 1: " + u1.getId());
        System.out.println("ID Usuario 4: " + u4.getId());
        System.out.println("Total de usuarios: " + UsuarioRegistrado.getTotalUsuarios());

        System.out.println("\n=== SW3.2 — INSTANCIAS DE APLICACIÓN ===");
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("ERP", "2.1");
        app1.iniciar();
        System.out.println("Total aplicaciones: " + Aplicacion.getTotalAplicaciones());

        System.out.println("\n=== SW3.3 — SERVIDORES ===");
        Servidor s1 = new Servidor("WebPrimary", "192.168.1.10");
        Servidor s2 = new Servidor("DBPrimary", "192.168.1.20");
        s1.activar();
        System.out.println("Total servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
    }
}