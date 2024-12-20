package com.example.fitswitch.Repository;

import com.example.fitswitch.Model.ISO8583;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<ISO8583,String> {
}
