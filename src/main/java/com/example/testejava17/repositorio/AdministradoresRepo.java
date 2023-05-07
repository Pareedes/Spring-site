package com.example.testejava17.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testejava17.models.Administrador;

@Repository
public interface AdministradoresRepo extends JpaRepository<Administrador, Integer> {

    List<Administrador> findAll();

    Administrador findById(int id);

    void deleteById(int id);

}
