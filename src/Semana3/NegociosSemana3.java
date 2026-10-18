package Semana3;

class Cliente {
    private String nombre;
    private String correo;
    private int edad;
    private double saldo;

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
    }

    public String getCorreo() { return this.correo; }
    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) this.correo = correo;
    }

    public int getEdad() { return this.edad; }
    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
    }

    public double getSaldo() { return this.saldo; }
    public void setSaldo(double saldo) {
        if (saldo >= 0) this.saldo = saldo;
    }
}

class ProductoConStock {
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
    }

    public double getPrecio() { return this.precio; }
    public void setPrecio(double precio) {
        if (precio >= 0) this.precio = precio;
    }

    public int getStock() { return this.stock; }
    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) this.stock += cantidad;
    }
}

class Vendedor {
    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
    }

    public double getVentas() { return this.ventas; }
    public void setVentas(double ventas) {
        if (ventas >= 0) this.ventas = ventas;
    }

    public double getComision() { return this.comision; }
    public void setComision(double comision) {
        if (comision >= 0 && comision <= 100) this.comision = comision;
    }

    public void registrarVenta(double cantidad) {
        if (cantidad > 0) this.ventas += cantidad;
    }
}

public class NegociosSemana3 {
    public static void main(String[] args) {
        System.out.println("=== ND2.1 — CLIENTE DE E-COMMERCE ===");
        Cliente cli = new Cliente();
        cli.setNombre("Juan Pérez");
        cli.setCorreo("juan@mail.com");
        cli.setEdad(20);
        cli.setSaldo(50.0);
        cli.setEdad(-5);   // Ignorada
        cli.setSaldo(-100); // Ignorada
        System.out.println("Cliente: " + cli.getNombre() + " | Edad: " + cli.getEdad() + " | Saldo: $" + cli.getSaldo());

        System.out.println("\n=== ND2.2 — PRODUCTO CON STOCK ===");
        ProductoConStock ps = new ProductoConStock();
        ps.setNombre("Camiseta");
        ps.setPrecio(15.0);
        ps.setStock(10);
        ps.aumentarStock(5);
        ps.aumentarStock(-3); // Ignorada
        System.out.println("Producto: " + ps.getNombre() + " | Stock: " + ps.getStock());

        System.out.println("\n=== ND2.3 — CUENTA DE VENDEDOR ===");
        Vendedor v = new Vendedor();
        v.setNombre("Pedro");
        v.setComision(15.0);
        v.registrarVenta(200.0);
        v.registrarVenta(-50.0); // Ignorada
        System.out.println("Vendedor: " + v.getNombre() + " | Ventas: $" + v.getVentas());
    }
}