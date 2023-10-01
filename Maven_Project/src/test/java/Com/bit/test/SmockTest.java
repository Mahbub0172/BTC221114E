package Com.bit.test;

import org.junit.Test;

import Com.bit.Pages.HomePage;
import Com.bit.Pages.ShirtPage;

public class SmockTest extends Basetest {
HomePage hp;
ShirtPage sp;
@Test	
	public void BuyAShirt() {
	hp = new HomePage(driver);
	hp.hoveroveronmanmanue();
	sp = hp.clickallshirtsubmanu();
	sp.Cliconfristshirt();
}


}
