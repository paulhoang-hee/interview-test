package com.example;


import com.example.service.PriceService;

import java.io.IOException;

/**
 * TASK: Read the prices from the file prices.csv on the classpath (resources directory) and sort them in descending
 * order then output the result to the command line, one price per line
 *
 * Note: To kick things off, use the following to read the file (You don't need to use this but its just to get the
         ball rolling)

 InputStream inputStream = Application.class.getClassLoader().getResourceAsStream("prices.csv");
 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

 * Note 2: You have full autononmy here. Add any libraries you need, google as much as you want, ask any questions
           to clear up any unknowns. Just code as if you are at work, delivering high quality code.

 */
public class Application {

  public static void main(String[] args) throws IOException {
    PriceService priceService = new PriceService();
  }

}
