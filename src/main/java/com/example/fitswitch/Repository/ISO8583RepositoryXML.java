package com.example.fitswitch.Repository;

import com.example.fitswitch.Model.ISO8583XML;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISO8583RepositoryXML extends JpaRepository<ISO8583XML,String> {
}
