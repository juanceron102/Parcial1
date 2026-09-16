package Punto1.src.central;

import java.time.LocalDateTime;

public class MonitoringEvent {
    private String idPatient;
    private int tipe;
    private String description;
    public EventoMonitoreo(String idPaciente, int tipe, String descripcion) {
        this.idPatient = idPaciente;
        this.tipe = tipe;
        this.description = descripcion;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public String getEventType() {
        String eventTypeString = "";
        if(tipe==1){
            eventTypeString = "Paciente necesita cambio de medicamentos";
        }if(tipe==2){
            eventTypeString = "Cordinar cambio de cama paciente";
        }if(tipe==3){
            eventTypeString = "Examenes de lab"; 
        }
        return eventTypeString;
    }

    public String getDescription() {
        return description ;
    }

}
