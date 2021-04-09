package tr.edu.medipol.yazilimaraclari.oguzcan.gecir;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class MuhasebeProgramiTest {
		
		@Test
		public void ucrethesaplaTest() {
			MuhasebeProgrami muhasebe = new MuhasebeProgrami();
			int ucret = (int) muhasebe.ucretHesapla(40, 25);
			
			Assert.assertEquals(1000,ucret);
		}
	}



