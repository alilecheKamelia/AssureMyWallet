package com.projets.innovations.asssurWallet.asssureMyWallet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data

@Document(collection = "Contrat")
public class Contrat implements Serializable {

    @Id
    private String id;
    private String description;
    private LocalDate dateFinContrat;
    private LocalDate dateContrat;
    private BigDecimal tarif;
    private List<String> garanties;

    public Contrat(String id,LocalDate dateFinContrat, LocalDate dateContrat, List<String> garanties, BigDecimal tarif,String
                   description) {
this.id=id;
        this.description = description;
        this.dateFinContrat = dateFinContrat;
        this.dateContrat = dateContrat;
        this.garanties = garanties;
        this.tarif=tarif;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public LocalDate getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    public List<String> getGaranties() {
        return garanties;
    }

    public void setGaranties(List<String> garanties) {
        this.garanties = garanties;
    }



}
