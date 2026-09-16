package Punto2.shippings;

public class AirShipment implements Shipment {

    @Override
    public void calculateShippingCost(double weight, double distance) {
        // TODO Auto-generated method stub
        System.out.println("Costo de envio express: " + (weight * distance * 0.35));
    }

    @Override
    public void calculateEstimatedDeliveryTime(double distance) {
        int days = 0;
        if (distance<=5) {
            days = 1;
        } else {
            days=(int) (distance / 5);
        }
        System.out.println("Tiempo estimado de entrega express: " + days + " dias");
    }
    
}
