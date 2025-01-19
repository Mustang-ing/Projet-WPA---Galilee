package Class_Defintion;

/*

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
*/

public class Groupe 
{
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(length = 40, nullable = false)
    private String nom;

    //@Column(length = 40, nullable = false)
    private String prenom;

    //@Column(name = "date_naissance", nullable = false)
    private String dateNaissance;
    
    

}
