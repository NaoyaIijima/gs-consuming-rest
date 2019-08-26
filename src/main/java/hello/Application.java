package main.java.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        Quote quote = restTemplate.getForObject("https://routesao3e3uv-naoyaiijima-che.8a09.starter-us-east-2.openshiftapps.com/api/random", Quote.class);
        log.info(quote.toString());
    }

}