package Punto2.shippings;

public class SeaShipment implements Shipment {

    @Override
    public void calculateShippingCost(double weight, double distance) {
        System.out.println("Costo de envio maritimo: " + (weight * distance * 0.15));
    }

    @Override
    public void calculateEstimatedDeliveryTime(double distance) {
        int days = 0;
        if (distance<=2) {
            days = 1;
        } else {
            days=(int) (distance / 2);
        }
        System.out.println("Tiempo estimado de entrega maritima: " + days + " dias");
    }
    
    
}
