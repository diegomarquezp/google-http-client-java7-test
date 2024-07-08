package org.example;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;

public class Main {
  private static final ImmutableSet<String> BASIC_METHODS =
      ImmutableSet.of(HttpMethods.GET, HttpMethods.PUT, HttpMethods.POST, HttpMethods.DELETE);
  public static void main(String[] args) throws IOException {
    NetHttpTransport transport = new NetHttpTransport();
    HttpRequest request =
        transport.createRequestFactory().buildGetRequest(new GenericUrl("http://google.com"));
    for (String method : BASIC_METHODS) {
      request.setRequestMethod(method);
      request.execute();
    }
  }
}