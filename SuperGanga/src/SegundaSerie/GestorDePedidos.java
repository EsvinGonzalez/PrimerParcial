package SegundaSerie;

import java.util.PriorityQueue;

public class GestorDePedidos {
    public static void main(String[] args) {
        PriorityQueue<Pedido> colaDePedidos = new PriorityQueue<>();

        // Agregar algunos pedidos a la cola con diferentes prioridades
        colaDePedidos.offer(new Pedido(1, "Telefono Huawey", 5));
        colaDePedidos.offer(new Pedido(2, "Cama", 2));
        colaDePedidos.offer(new Pedido(3, "Refrigerador", 4));
        colaDePedidos.offer(new Pedido(4, "Microondas", 1));
        colaDePedidos.offer(new Pedido(5, "Licuadora", 3));

        // Procesar los pedidos en orden de prioridad
        System.out.println("Procesando pedidos por prioridad:");
        while (!colaDePedidos.isEmpty()) {
            Pedido pedidoActual = colaDePedidos.poll(); // Obtiene y elimina el elemento con mayor prioridad
            System.out.println("Procesando: " + pedidoActual);
        }
    }
}


class Pedido implements Comparable<Pedido> {
    private int id;
    private String descripcion;
    private int prioridad;

    public Pedido(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }


    @Override
    public int compareTo(Pedido otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

    // Getters para acceder a los atributos de la clase Pedido
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }
}