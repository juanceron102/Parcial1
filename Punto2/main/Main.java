package Punto2.main;

import java.util.Scanner;
import Punto2.orders.ShipOrder;
import Punto2.packages.Package;
import Punto2.shippings.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Package package1 = new Package(5.0, 15.0);

        while (true) {
            System.out.println("Precios estimados para su paquete:");
            System.out.println("Peso: " + package1.getWeight() + " kg");
            System.out.println("Distancia: " + package1.getDistance() + " km");
            System.out.println("----------------------------------------");

            System.out.println("Seleccione la modalidad de envio:");
            System.out.println("1. Aereo");
            System.out.println("2. Maritimo");
            System.out.println("3. Ecologico");
            System.out.println("4. Casillero");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            Shipment shipment = null;

            switch (opcion) {
                case 1:
                    shipment = new AirShipment();
                    shipment.calculateShippingCost(package1.getWeight(), package1.getDistance());
                    break;
                case 2:
                    shipment = new SeaShipment();
                    shipment.calculateShippingCost(package1.getWeight(), package1.getDistance());
                    break;
                case 3:
                    shipment = new EcologicShipment();
                    shipment.calculateShippingCost(package1.getWeight(), package1.getDistance());
                    break;
                case 4:
                    shipment = new MailboxShipment();
                    shipment.calculateShippingCost(package1.getWeight(), package1.getDistance());
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el servicio");
                    return;
                default:
                    System.out.println("Opcion no valida");
                    continue;
            }

            System.out.println("Desea procesar esta orden con la modalidad seleccionada? (s/n)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("s")) {
                ShipOrder order = new ShipOrder(package1, shipment);
                order.processOrder();
                System.out.println("Orden procesada con exito");
                return;
            }
        }
    }
}
