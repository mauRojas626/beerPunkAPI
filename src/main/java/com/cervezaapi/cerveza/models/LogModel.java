package com.cervezaapi.cerveza.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "log")
public class LogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String servicioConsumido;
    private LocalDateTime horaEjecucion;
    private Long tiempoRespuesta;

    public LogModel() {
    }

    public LogModel(String servicioConsumido, LocalDateTime horaEjecucion, Long tiempoRespuesta) {
        this.servicioConsumido = servicioConsumido;
        this.horaEjecucion = horaEjecucion;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicioConsumido() {
        return servicioConsumido;
    }

    public void setServicioConsumido(String servicioConsumido) {
        this.servicioConsumido = servicioConsumido;
    }

    public LocalDateTime getHoraEjecucion() {
        return horaEjecucion;
    }

    public void setHoraEjecucion(LocalDateTime horaEjecucion) {
        this.horaEjecucion = horaEjecucion;
    }

    public Long getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(Long tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
