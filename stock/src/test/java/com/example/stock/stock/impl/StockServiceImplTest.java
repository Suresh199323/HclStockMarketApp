package com.example.stock.stock.impl;


import com.example.stock.stock.entity.Stock;
import com.example.stock.stock.repository.StockRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class StockServiceImplTest {

    @Mock
    StockRepository stockRepository;

    @InjectMocks
    StockServiceImpl stockService;

    @Test
    public void getStockPrice()
    {
    Integer stockId;
    Stock stock=new Stock();
    stock.setStockId(1);
    stock.setStockName("AAPL");
    stock.setStockPrice(221.33);
    stock.setDescription("its a AAPL stock");
    Optional<Stock> stock1 = Optional.of(stock);
//doubt

        /*RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/employees";
        URI uri = new URI(baseUrl);

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

        //Verify request succeed
        Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals(true, result.getBody().contains("employeeList"));*/
    Mockito.lenient().when(stockRepository.findByStockId(1)).thenReturn(stock);

    Assert.assertNotNull(stock);
    Assert.assertEquals("AAPL", stock.getStockName());
}
}
