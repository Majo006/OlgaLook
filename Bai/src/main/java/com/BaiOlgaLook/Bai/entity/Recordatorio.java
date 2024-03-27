package com.BaiOlgaLook.Bai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "recordatorios")
public class Recordatorio {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "hora", nullable = false)
    private Time hora;
    @Column(name = "mensaje", nullable = false, length = 200)
    private String mensaje;
    @Column (name = "Estado", nullable = false)
    private String estado;
}
