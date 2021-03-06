/**
 * api-gateway-service - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.api.gatewawy;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PriceClientImpl implements PriceClient {

  public PriceClientImpl() {
  }

  public String getPrice() {
    String response = null;
    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
      HttpGet httpGet = new HttpGet("http://localhost:50006/price");
      try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
        response = EntityUtils.toString(httpResponse.getEntity());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return response;
  }
}
