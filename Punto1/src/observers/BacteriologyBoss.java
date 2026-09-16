package Punto1.src.observers;
public class BacteriologyBoss implements IObserver {
    private String name;

    public BacteriologyBoss(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("El jefe de bacteriología " + name + " ha sido notificado de un nuevo paciente en la UCI.");
    }
    
}
