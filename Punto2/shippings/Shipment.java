package Punto2.shippings;

public interface Shipment {
    public void calculateShippingCost(double weight, double distance);
    public void calculateEstimatedDeliveryTime(double distance);
}
