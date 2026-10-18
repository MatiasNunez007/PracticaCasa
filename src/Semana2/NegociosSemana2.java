package Semana2;

class Producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Categoría: " + categoria + " | Precio: $" + precio + " | Disponible: " + disponible);
    }

    public void cambiarDisponibilidad(boolean nuevaDisponibilidad) {
        disponible = nuevaDisponibilidad;
    }

    void mostrarPrecio() {
        System.out.println("Precio de " + nombre + ": $" + precio);
    }

    void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de " + nombre + ": " + disponible);
    }
}

class Campania {
    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void mostrarInformacion() {
        System.out.println("Campaña: " + nombre + " | Plataforma: " + plataforma + " | Presupuesto: $" + presupuesto + " | Activa: " + activa);
    }

    public void activar() {
        activa = true;
        System.out.println("Campaña " + nombre + " activada.");
    }

    void desactivar() {
        activa = false;
        System.out.println("Campaña " + nombre + " desactivada.");
    }

    void mostrarPresupuesto() {
        System.out.println("Presupuesto: $" + presupuesto);
    }
}

class Cupon {
    public String codigo;
    public double porcentajeDescuento;
    String descripcion;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Cupón: " + codigo + " | Descuento: " + porcentajeDescuento + "% | Descripción: " + descripcion + " | Activo: " + activo);
    }

    public void activar() {
        activo = true;
    }

    void desactivar() {
        activo = false;
    }

    void mostrarDescuento() {
        System.out.println("Descuento: " + porcentajeDescuento + "%");
    }

    void mostrarResumen() {
        System.out.println("Cupón " + codigo + " - Descuento " + (int)porcentajeDescuento + "%");
    }
}

public class NegociosSemana2 {
    public static void main(String[] args) {
        System.out.println("=== ND1.1 — PRODUCTOS DE UNA TIENDA ONLINE ===");
        Producto p1 = new Producto();
        p1.nombre = "Audífonos Bluetooth";
        p1.precio = 32.50;
        p1.categoria = "Tecnología";
        p1.disponible = true;

        Producto p2 = new Producto();
        p2.nombre = "Teclado";
        p2.precio = 45.00;
        p2.categoria = "Tecnología";
        p2.disponible = true;

        Producto p3 = new Producto();
        p3.nombre = "Mousepad";
        p3.precio = 12.00;
        p3.categoria = "Accesorios";
        p3.disponible = false;

        p1.mostrarInformacion();
        p1.cambiarDisponibilidad(false);
        p1.mostrarInformacion();

        System.out.println("\n=== ND1.2 — CAMPAÑA PUBLICITARIA ===");
        Campania c1 = new Campania();
        c1.nombre = "Promo IG";
        c1.plataforma = "Instagram";
        c1.presupuesto = 100.0;
        c1.activa = false;

        Campania c2 = new Campania();
        c2.nombre = "Trend TikTok";
        c2.plataforma = "TikTok";
        c2.presupuesto = 200.0;
        c2.activa = false;

        Campania c3 = new Campania();
        c3.nombre = "Anuncios FB";
        c3.plataforma = "Facebook";
        c3.presupuesto = 150.0;
        c3.activa = false;

        c1.activar();
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();

        System.out.println("\n=== ND1.3 — CUPÓN DE DESCUENTO ===");
        Cupon cup1 = new Cupon();
        cup1.codigo = "VERANO20";
        cup1.porcentajeDescuento = 20.0;
        cup1.descripcion = "Descuento de verano";
        cup1.activo = true;

        Cupon cup2 = new Cupon();
        cup2.codigo = "BLACK50";
        cup2.porcentajeDescuento = 50.0;
        cup2.descripcion = "Black Friday";
        cup2.activo = false;

        Cupon cup3 = new Cupon();
        cup3.codigo = "NEW10";
        cup3.porcentajeDescuento = 10.0;
        cup3.descripcion = "Bienvenida";
        cup3.activo = true;

        cup1.mostrarResumen();
        cup2.mostrarResumen();
        cup3.mostrarResumen();
    }
}