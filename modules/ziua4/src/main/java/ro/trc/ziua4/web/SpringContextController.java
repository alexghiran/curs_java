package ro.trc.ziua4.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.trc.ziua4.adnotare.Selectabil;
import ro.trc.ziua4.service.ServiciuCautareAdnotare;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SpringContextController {

    private static final int CONTAINER_MAX_SIZE = 4096;

    @Autowired
    private ApplicationContext springContext;

    @Autowired
    private ServiciuCautareAdnotare serviciuCautare;

    @RequestMapping(path = "/context", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getSpringContext() {

        List<String> denumiriBean = new ArrayList<>();
        denumiriBean = Arrays.asList(this.springContext.getBeanDefinitionNames());
        System.out.println("debug");

        return ResponseEntity.ok(denumiriBean);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(path = "/clasa/{clasa}", method = RequestMethod.GET)
    public ResponseEntity<String> getClasaFromContext(@PathVariable String clasa) {

        Class<?> kls = null;
        try {
            kls = Class.forName(clasa);
            System.out.println(kls.getName());
        } catch (Exception e) {
            System.out.println("Nu gasesc adnotarile");
        }

        String result = serviciuCautare.gasesteClasa((Class<? extends Annotation>) kls);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(path = "/container/{size}")
    public ResponseEntity<String> alocaMemorie(@PathVariable int size) {
        String result;
        byte[] container;
        if (size > CONTAINER_MAX_SIZE) {
            result = "Apel invalid; dimensiunea este prea mare";
        } else {
            container = new byte[size];
            result = "Am creat containerul cu dimensiunea " + size;
        }

        return ResponseEntity.ok(result);
    }
}
