package Punto1.src.observers;
public class IntensiveDoctor implements IObserver {
    private String name;

    public IntensiveDoctor(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("El doctor " + name + " ha sido notificado de un nuevo paciente en la UCI.");
    }
    
}
