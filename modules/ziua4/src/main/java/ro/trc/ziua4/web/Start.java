package ro.trc.ziua4.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import ro.trc.ziua4.service.ServiciuSalutare;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Start {

    @Autowired
    private ServiciuSalutare serviciuSalutare;

    @RequestMapping(value = "/detalii/{id}", method = RequestMethod.GET)
    public String salutare(@PathVariable Long id, HttpServletRequest request) {
        return serviciuSalutare.getMesajSalutare();
    }
}

/**
 * JRebel pentru hot-swap
 *
 * */
