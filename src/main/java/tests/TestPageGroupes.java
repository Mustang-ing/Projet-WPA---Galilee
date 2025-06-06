import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPageGroupes {

    WebDriver driver;

    @Before
    public void setUp() {
        // Définir le chemin vers le GeckoDriver (Firefox)
        System.setProperty("webdriver.gecko.driver", "/home/ing/Téléchargements/geckodriver-v0.35.0-linux64/geckodriver");

        // Initialisation du driver Firefox
        driver = new FirefoxDriver();
    }

    @Test
    public void testPageGroupes() {
        driver.get("http://localhost:8080/Projet_Web-0.0.1-SNAPSHOT/Groupe.jsp");

        // Vérifier si la liste des groupes est bien affichée
        WebElement listeGroupes = driver.findElement(By.id("groupes-list"));
        assertTrue(listeGroupes.isDisplayed());

        // Vérifier si un bouton pour ajouter un groupe est présent
        WebElement boutonAjouterGroupe = driver.findElement(By.id("add-group"));
        assertTrue(boutonAjouterGroupe.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
