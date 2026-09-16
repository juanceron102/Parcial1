package Punto1.src.observers;
public class NurseryBoss implements IObserver {
    private String name;

    public NurseryBoss(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("El Jefe de enfermeria " + name + " ha sido notificado de un nuevo paciente en la UCI.");
    }
    
}
