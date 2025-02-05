package com.example.EsercizoBE_U2_W1_D1_Spring;

import com.example.EsercizoBE_U2_W1_D1_Spring.model.*;
import com.example.EsercizoBE_U2_W1_D1_Spring.service.AppService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EsercizoBeU2W1D1SpringApplicationTests {

    @Autowired AppService appService;

    @Test
    void testCreateToppingHam() {
        Topping t1 = appService.createHamTopping();
        assertEquals("Ham", t1.getName());
    }

    @Test
    @DisplayName("testaSeQuandoCreoTavolo1IlNumeroDelTavoloCorrispondeA1")
    void testCreateTavolo1() {
        Tavolo tavolo = appService.createTavolo1();
        assertEquals(1, tavolo.getNumeroTavolo());
    }

    @Test
    void createPizzaXL() {
        Pizza pXl = appService.createSalamiPizzaXL();
        assertTrue(pXl.isXl());
    }

    @Test
    void addMenuElementToOrder() {
        Ordine o1 = new Ordine(4, appService.createTavolo1());
        o1.addMenuElement(appService.createHawaiianPizza());

        assertEquals(1 , o1.getListaElementiOrdinati().size());
        assertTrue(o1.getListaElementiOrdinati().contains(appService.createHawaiianPizza()));
    }

    @ParameterizedTest
    @CsvSource({"2.0,2.0,4.0", "4.0,3.0,7.0"})
    void testCalculateTotal(double price1, double price2, double expectedTotal) {
        Ordine o2 = new Ordine(2, appService.createTavolo1());
        o2.addMenuElement(new Drink("drink1",12,price1));
        o2.addMenuElement(new Drink("drink2",20,price2));

        assertEquals(expectedTotal, o2.getTotaleOrdine());
    }
}
