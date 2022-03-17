package com.projets.innovations.asssurWallet.asssureMyWallet.dtos;

import com.projets.innovations.asssurWallet.asssureMyWallet.model.Client;
import com.projets.innovations.asssurWallet.asssureMyWallet.model.Contrat;

import java.util.List;

public class ClientDTO {

    private String id;
    private String nom;
    private String prenom;
    private  int age;
    private String adresse;
    private List<Contrat> contrats;
    public ClientDTO(Client c) {
        this.id=c.getId();
        this.adresse=c.getAdresse();
        this.age=c.getAge();
        this.contrats=c.getContrats();
        this.nom=c.getNom();
        this.prenom=c.getPrenom();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }
}
