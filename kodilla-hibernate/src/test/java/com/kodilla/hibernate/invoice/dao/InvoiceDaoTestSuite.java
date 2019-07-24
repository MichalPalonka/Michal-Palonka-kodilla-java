package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product knife = new Product("knife");
        Product saber = new Product("saber");
        Product sword = new Product("sword");

        Item itemKnife = new Item(knife, new BigDecimal(5), 1, new BigDecimal(5));
        Item itemSaber = new Item(saber, new BigDecimal(10), 1, new BigDecimal(10));
        Item itemSword = new Item(sword, new BigDecimal(25), 1, new BigDecimal(25));

        Invoice invoice = new Invoice("1/01/2000");
        knife.getItems().add(itemKnife);
        itemKnife.setProduct(knife);
        invoice.getItems().add(itemKnife);

        saber.getItems().add(itemSaber);
        itemSaber.setProduct(saber);
        invoice.getItems().add(itemSaber);

        sword.getItems().add(itemSword);
        itemSword.setProduct(sword);
        invoice.getItems().add(itemSword);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}
