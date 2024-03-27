package com.BaiOlgaLook.Bai.repository;
import com.BaiOlgaLook.Bai.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long>{
}
