package com.BaiOlgaLook.Bai.repository;

import com.BaiOlgaLook.Bai.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}
