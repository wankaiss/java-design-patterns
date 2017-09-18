/**
 * aggregator-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.aggregatorservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;


public class AggregatorTest {
  @InjectMocks
  private Aggregator aggregator;

  @Mock
  private ProductInformationClient productInformationClient;

  @Mock ProductInventoryClient productInventoryClient;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testGetProduct() {
    String title = "The Product Title.";
    int inventories = 5;

    when(productInformationClient.getProductTitle()).thenReturn(title);
    when(productInventoryClient.getProductInventories()).thenReturn(inventories);

    Product testProduct = aggregator.getProduct();

    Assert.assertEquals(title, testProduct.getTitle());
    Assert.assertEquals(inventories, testProduct.getProductInventories());
  }
}
