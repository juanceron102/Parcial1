package Punto2.orders;
import Punto2.packages.Package;
import Punto2.shippings.*;
public class ShipOrder {
    private Package package1;
    private Shipment shipment;

    public ShipOrder(Package package1, Shipment shipment) {
        this.package1 = package1;
        this.shipment = shipment;
    }

    public void processOrder() {
        double weight = package1.getWeight();
        double distance = package1.getDistance();

        shipment.calculateShippingCost(weight, distance);
        shipment.calculateEstimatedDeliveryTime(distance);
    }

    
}
