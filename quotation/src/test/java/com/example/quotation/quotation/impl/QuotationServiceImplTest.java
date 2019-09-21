/*
package com.example.quotation.quotation.impl;


import com.example.quotation.quotation.entity.Quotation;
import com.example.quotation.quotation.repository.QuotaionRepository;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class QuotationServiceImplTest {


    @Mock
    QuotaionRepository quotaionRepository;

    @InjectMocks
    QuotationServiceImpl quotationService;

    public void saveStockInfo()
    {


        Quotation quotation=new Quotation();
        quotation.setStockId(1);
        quotation.setUnitPrice(221.98);
        quotation.setTotalAmount(1000d);
        quotation.setQuantity(1d);
        Optional<Quotation> stock1 = Optional.of(quotation);
        //Mockito.lenient().when(quotaionRepository.findByStockId(1)).thenReturn(stock);

        Assert.assertNotNull(quotation);
       // Assert.assertEquals(1, quotation.getStockId());
    }
}
*/
