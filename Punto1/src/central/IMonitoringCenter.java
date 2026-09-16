import Punto1.src.observers.IObserver;

public interface IMonitoringCenter {

    void suscribe(IObserver observer);

    void unsuscribe(IObserver observer);

    void notifyObservers(MonitoringEvent event);

   
}