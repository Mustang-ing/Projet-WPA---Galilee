package Class_Definition;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Adherent 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 40, nullable = false)
    private String nom;

    @Column(length = 40, nullable = false)
    private String prenom;

    @Column(name = "date_naissance", nullable = false)
    private String dateNaissance;

    /*
    @Column(length = 100, nullable = false)
    private String adresse;

    @Column(name = "code_postal", length = 10, nullable = false)
    private String codePostal;

    @Column(length = 50, nullable = false)
    private String ville;

    @Column(name = "adresse_courriel", length = 100, nullable = false, unique = true)
    private String adresseCourriel;

    @Column(name = "numero_telephone", length = 15, nullable = false)
    private String numeroTelephone;

    @Column(name = "date_paiement_cotisation", nullable = false)
    private LocalDate datePaiementCotisation;
    
    */
    @ManyToMany
    private List<Adherent> Adherents = new ArrayList<>();
    
    

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /*
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresseCourriel() {
        return adresseCourriel;
    }

    public void setAdresseCourriel(String adresseCourriel) {
        this.adresseCourriel = adresseCourriel;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public LocalDate getDatePaiementCotisation() {
        return datePaiementCotisation;
    }

    public void setDatePaiementCotisation(LocalDate datePaiementCotisation) {
        this.datePaiementCotisation = datePaiementCotisation;
    }
    */

}
