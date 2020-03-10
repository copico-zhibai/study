package com;


import com.sun.xml.internal.fastinfoset.Encoder;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author owen
 */
public class ControllerTest {

    @Test
    public void tes1() {
        String url = "http://localhost:8080/test1/{id}";
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class, "5");
        System.out.println(forObject);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", "9");
        String forObject1 = restTemplate.getForObject(url, String.class, map);
        System.out.println(forObject1);
    }

    @Test
    public void test2() {
        String url = "http://localhost:8080/test2/{id}{name}";
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class, "5", "6");
        System.out.println(forObject);
        Map<String, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "0");
        String forObject1 = restTemplate.getForObject(url, String.class, map);
        System.out.println(forObject1);

    }

    @Test
    public void test3() {
        String url = "http://localhost:8080/test3/{id}/{name}";
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject(url, String.class, "5", "6");
        System.out.println(forObject);
        Map<String, Object> map = new HashMap<>();
        map.put("id", "9");
        map.put("name", "0");
        String forObject1 = restTemplate.getForObject(url, String.class, map);
        System.out.println(forObject1);
    }

    @Test
    public void test4() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));
        String url = "http://120.55.69.13:8200/driver/rpc/xiaoju/lift-car?driverName=张一波&userPhone=13626671610";
        URI uri = UriComponentsBuilder.fromHttpUrl(url).encode(StandardCharsets.UTF_8).build().toUri();

        ResponseEntity<String> forEntity = restTemplate.getForEntity(uri, String.class);
        System.out.println(forEntity);
    }


}
