package com.BaiOlgaLook.Bai.repository;

import com.BaiOlgaLook.Bai.entity.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {
}
