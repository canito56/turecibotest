package com.turecibo.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TuReciboTest extends TuReciboTestSetup{
	
	public TuReciboTest() {
	}
	
	public TuReciboTest(String usern, String pwdn) {
		
		startUpBrowser();
	
		// Sign In
		sendBy("id", "19", usern);		// User
		sendBy("id", "21", pwdn);		// Password
		clickBy("id", "24");

		// Documentos a Firmar
		waitBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[1]");
		WebElement docafirmar = findBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[1]");
		docafirmar.click();
		
		// Recibos Mensual
		waitBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div/main/div/div/div[2]/div[2]/div[1]/button");
		WebElement recibosMensual = findBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div/main/div/div/div[2]/div[2]/div[1]/button");
		recibosMensual.sendKeys(Keys.RETURN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Descargar recibo
		waitBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div/main/div[2]/div/div[1]/div[3]/button[2]");
		WebElement descargar = findBy("xpath", "/html/body/div[1]/div/main/div/div/div[2]/div/div/main/div[2]/div/div[1]/div[3]/button[2]");
		descargar.click();

		// Click en Usuario
		waitBy("xpath", "//*[@id=\"58\"]/div[3]/div/div/span");
		WebElement user = findBy("xpath", "//*[@id=\"58\"]/div[3]/div/div/span");
		user.click();

		// Click en Salir
		waitBy("xpath", "//*[@id=\"menu-58\"]/div[5]");
		WebElement salir = findBy("xpath", "//*[@id=\"menu-58\"]/div[5]");
		salir.click();

		closeBrowser();
	}

}
