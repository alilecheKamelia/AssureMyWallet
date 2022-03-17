package com.projets.innovations.asssurWallet.asssureMyWallet.dtos;

import com.projets.innovations.asssurWallet.asssureMyWallet.model.Contrat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class ContratDTO {
     private String id;
     private String description;
    private LocalDate dateContrat;
    private LocalDate dateFinContrat;
    private BigDecimal tarif;
    private List<String> garanties;

    public ContratDTO(Contrat c) {
        this.id=c.getId();
        this.tarif=c.getTarif();
        this.description=c.getDescription();
        this.dateFinContrat=c.getDateFinContrat();
        this.dateContrat=c.getDateContrat();
        this.garanties=c.getGaranties();
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

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(LocalDate dateContrat) {
        this.dateContrat = dateContrat;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }


    public List<String> getGaranties() {
        return garanties;
    }

    public void setGaranties(List<String> garanties) {
        this.garanties = garanties;
    }

    public ContratDTO(String description, LocalDate dateContrat, LocalDate dateFinContrat, String type, List<String> garanties) {

        this.description = description;
        this.dateContrat = dateContrat;
        this.dateFinContrat = dateFinContrat;
        this.tarif = tarif;
        this.garanties = garanties;
    }

    public static ContratDTO creer(Contrat c) {
        return new ContratDTO(c);
    }

    public BigDecimal getTarif() {
        return tarif;
    }
}
