package com.example.fitswitch.Repository;

import com.example.fitswitch.Model.ISO8583;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ISO8583Repository extends JpaRepository<ISO8583,String> {

    // Consulta con los nombres exactos de los campos de la tabla para los inputs de filtros de busqueda
    @Query("SELECT i FROM ISO8583 i WHERE i.wiso012LocalDateTime BETWEEN :WISO_012_LOCALDATETIME AND :WISO_013_LOCALDATE")
    List<ISO8583> findByFechaRange(
            @Param("WISO_012_LOCALDATETIME") LocalDateTime WISO_012_LOCALDATETIME,
            @Param("WISO_013_LOCALDATE") LocalDateTime WISO_013_LOCALDATE
    );

}
