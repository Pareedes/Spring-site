package com.example.testejava17.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testejava17.models.Administrador;
import com.example.testejava17.repositorio.AdministradoresRepo;

@Service
public class Administrador {

    @Autowired
    private AdministradoresRepo repository;

    public List<Administrador> findAll() {
        return repository.findAll();
    }

    public Administrador findById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public AdministradoresRepo getRepository() {
        return repository;
    }

    public void setRepository(AdministradoresRepo repository) {
        this.repository = repository;
    }

}
