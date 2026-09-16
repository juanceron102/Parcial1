package Punto2.shippings;

public class MailboxShipment implements Shipment {
    private static final double RATE_PER_KM = 1.5;

    @Override
    public void calculateShippingCost(double weight, double distance) {
        double nearestDistributionDistance =distance/2;
        double cost =nearestDistributionDistance * RATE_PER_KM;
        System.out.println("Costo de envio por casillero: " + cost);
    }

    @Override
    public void calculateEstimatedDeliveryTime(double distance) {
        int days = 0;
        if (distance <= 10) {
            days = 1;
        } else {
            days = (int) (distance / 10);
        }
        System.out.println("Tiempo estimado de entrega por modalidad Viajeros/Casillero: " + days + " dias");
    }    
}

