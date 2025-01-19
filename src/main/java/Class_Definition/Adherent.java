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
	//public Adherent() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 40)
    private String nom;

    @Column(length = 40)
    private String prenom;

    @Column(name = "date_naissance")
    private String dateNaissance;

    
    @Column(length = 100)
    private String adresse;

    @Column( length = 10)
    private String codePostal;

    @Column(length = 50)
    private String ville;

    @Column( length = 100)
    private String adresseCourriel;

    @Column(length = 15)
    private String numeroTelephone;

    @Column
    private String datePaiementCotisation;
    
 
    @ManyToMany
    //private List<Adherent> Adherents = new ArrayList<>();
    
    

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
    public List<Adherent> getAdherent()
    {
    	return Adherents;
    }

    */
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

    public String getDatePaiementCotisation() {
        return datePaiementCotisation;
    }

    public void setDatePaiementCotisation(String datePaiementCotisation) {
        this.datePaiementCotisation = datePaiementCotisation;
    }
   

}
