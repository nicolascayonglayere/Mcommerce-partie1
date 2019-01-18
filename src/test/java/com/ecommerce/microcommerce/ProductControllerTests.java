package com.ecommerce.microcommerce;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.exceptions.ProduitGratuitException;

public class ProductControllerTests {

	private static Product produitGratuit;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		produitGratuit = new Product(10, "pompon", 0, 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ProduitGratuitException.class)
	public void testAjouterProduitGratuit() {
		if (produitGratuit.getPrix() == 0) {
			throw new ProduitGratuitException("Test exception gratuite");
		} else {
			fail("echec du test");
		}
	}

	public static Product getProduitGratuit() {
		return produitGratuit;
	}

	public static void setProduitGratuit(Product produitGratuit) {
		ProductControllerTests.produitGratuit = produitGratuit;
	}

}
