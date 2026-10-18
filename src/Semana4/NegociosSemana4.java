package Semana4;

class ProductoRegistro {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    public ProductoRegistro(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static int getContadorProductos() { return contadorProductos; }
}

class ClienteRegistro {
    private int id;
    private String nombre;
    private String correo;
    private boolean activo;
    private static int contadorClientes = 0;

    public ClienteRegistro(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true;
    }

    public void activar() { this.activo = true; }
    public void desactivar() { this.activo = false; }
    public static int getTotalClientes() { return contadorClientes; }
}

class Pedido {
    private int numero;
    private String cliente;
    private double total;
    private String estado;
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void confirmar() {
        if (!this.estado.equals("Confirmado")) {
            this.estado = "Confirmado";
            ventasTotales += this.total;
        }
    }

    public static int getContadorPedidos() { return contadorPedidos; }
    public static double getVentasTotales() { return ventasTotales; }
}

public class NegociosSemana4 {
    public static void main(String[] args) {
        System.out.println("=== ND3.1 — REGISTRO DE PRODUCTOS ===");
        ProductoRegistro pr1 = new ProductoRegistro("Mouse", 25.50, 10);
        ProductoRegistro pr2 = new ProductoRegistro("Teclado", 45.00, 5);
        ProductoRegistro pr3 = new ProductoRegistro("Monitor", 150.00, 3);
        ProductoRegistro pr4 = new ProductoRegistro("Pad", 10.00, 20);
        ProductoRegistro pr5 = new ProductoRegistro("Silla", 120.00, 2);
        System.out.println("Total de productos: " + ProductoRegistro.getContadorProductos());

        System.out.println("\n=== ND3.2 — REGISTRO DE CLIENTES ===");
        ClienteRegistro cr1 = new ClienteRegistro("Ana Pérez", "ana@correo.com");
        ClienteRegistro cr2 = new ClienteRegistro("Luis Gómez", "luis@correo.com");
        System.out.println("Total clientes: " + ClienteRegistro.getTotalClientes());

        System.out.println("\n=== ND3.3 — PEDIDOS ===");
        Pedido ped1 = new Pedido("Carlos", 120.50);
        Pedido ped2 = new Pedido("Maria", 80.00);
        ped1.confirmar();
        ped1.confirmar(); // Evita contabilizar doble
        System.out.println("Pedidos creados: " + Pedido.getContadorPedidos());
        System.out.println("Ventas totales confirmadas: $" + Pedido.getVentasTotales());
    }
}