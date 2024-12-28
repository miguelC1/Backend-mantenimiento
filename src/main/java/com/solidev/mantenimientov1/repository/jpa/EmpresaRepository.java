package com.solidev.mantenimientov1.repository.jpa;

import com.solidev.mantenimientov1.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
}
