/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.hoja2ej2;

/**
 *
 * @author thero
 */
public class Hoja2Ej2 {

    public static void main(String[] args) {
        Perecedero[] perecederos = {
            new Perecedero("P1", "Leche", 1.20, 5, 2024),
            new Perecedero("P2", "Yogur", 0.90, 6, 2025),
            new Perecedero("P3", "Queso", 2.50, 3, 2024),
            new Perecedero("P4", "Pan", 1.00, 6, 2025),
            new Perecedero("P5", "Jamón", 3.50, 7, 2024)
        };

        EnPromocion[] promociones = {
            new EnPromocion("E1", "Galletas", 2.00, 10),
            new EnPromocion("E2", "Café", 3.00, 15),
            new EnPromocion("E3", "Chocolate", 2.50, 20),
            new EnPromocion("E4", "Refresco", 1.50, 5),
            new EnPromocion("E5", "Cereal", 3.20, 25)
        };

        System.out.println("=== Artículos EN PROMOCIÓN ===");
        for (EnPromocion e : promociones) {
            e.mostrar();
            System.out.println();
        }

        System.out.println("=== Artículos PERECEDEROS ===");
        for (Perecedero p : perecederos) {
            p.mostrar();
            System.out.println();
        }

        System.out.println("=== ARTÍCULOS CADUCADOS ===");
        for (Perecedero p : perecederos) {
            if (p.estaCaducado()) {
                System.out.println(p.getCodigo() + ": " + p.getDescripcion());
            }
        }

        System.out.println("\n=== ARTÍCULO CON MÁXIMO DESCUENTO ===");
        EnPromocion max = promociones[0];
        for (EnPromocion e : promociones) {
            if (e.getDescuento() > max.getDescuento()) {
                max = e;
            }
        }
        System.out.println("Código: " + max.getCodigo() + " - " + max.getDescripcion() + " (" + max.getDescuento() + "%)");
    }
}
