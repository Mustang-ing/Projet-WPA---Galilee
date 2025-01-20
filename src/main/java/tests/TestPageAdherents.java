package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPageAdherents {

    WebDriver driver;

    @Before
    public void setUp() {
        // Définir le chemin vers le GeckoDriver (Firefox)
        System.setProperty("webdriver.gecko.driver", "/home/ing/Téléchargements/geckodriver-v0.35.0-linux64/geckodriver");

        // Initialisation du driver Firefox
        driver = new FirefoxDriver();
    }

    @Test
    public void testPageAdherents() {
        driver.get("http://localhost:8080/Projet_Web-0.0.1-SNAPSHOT/List_User.jsp");

        // Vérifier si la table des adhérents est bien affichée
        WebElement tableAdherents = driver.findElement(By.id("adherents-table"));
        assertTrue(tableAdherents.isDisplayed());

        // Vérifier la présence des boutons pour modifier et supprimer un adhérent
        WebElement boutonModifier = driver.findElement(By.name("btn-modifier"));
        WebElement boutonSupprimer = driver.findElement(By.name("btn-supprimer"));
        assertTrue(boutonModifier.isDisplayed());
        assertTrue(boutonSupprimer.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
