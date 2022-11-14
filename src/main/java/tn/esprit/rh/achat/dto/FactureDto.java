package tn.esprit.rh.achat.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
public class FactureDto {
	  private Long idFacture;
	    private float montantRemise;
	    private float montantFacture;
	    @Temporal(TemporalType.DATE)
	    private Date dateCreationFacture;
	    @Temporal(TemporalType.DATE)
	    private Date dateDerniereModificationFacture;
	    private Boolean archivee;
}
