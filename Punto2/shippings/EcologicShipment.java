package Punto2.shippings;

public class EcologicShipment implements Shipment {

    @Override
    public void calculateShippingCost(double weight, double distance) {
        System.out.println("Costo de envio ecologico: " + (weight * distance * 0.25));
    }

    @Override
    public void calculateEstimatedDeliveryTime(double distance) {
            int days = 0;
            if (distance<=3) {  
                days = 1;
            } else {
                days=(int) (distance / 3);
            }
            System.out.println("Tiempo estimado de entrega ecologico: " + days + " dias");
    }
    
}
