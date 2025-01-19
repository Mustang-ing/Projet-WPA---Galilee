import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPageAccueil {

    WebDriver driver;

    @Before
    public void setUp() {
        // Définir le chemin vers le GeckoDriver (Firefox)
        System.setProperty("webdriver.gecko.driver", "/home/ing/Téléchargements/geckodriver-v0.35.0-linux64/geckodriver");

        // Initialisation du driver Firefox
        driver = new FirefoxDriver();
    }

    @Test
    public void testPageAccueil() {
        driver.get("http://localhost:8080/Projet_Web-0.0.1-SNAPSHOT/index.html");

        // Vérifier si le titre de la page est correct
        WebElement titre = driver.findElement(By.tagName("h1"));
        assertTrue(titre.getText().contains("Association sportive de Galilee"));

        // Vérifier la présence des liens
        WebElement lienInscriptions = driver.findElement(By.linkText("Liste des inscrits"));
        WebElement lienGroupes = driver.findElement(By.linkText("Liste des groupes"));

        // Vérifier si les liens sont affichés correctement
        assertTrue(lienInscriptions.isDisplayed());
        assertTrue(lienGroupes.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
