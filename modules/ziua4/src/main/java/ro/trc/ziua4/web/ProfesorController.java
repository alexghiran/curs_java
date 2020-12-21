package ro.trc.ziua4.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.trc.ziua4.domeniu.Profesor;
import ro.trc.ziua4.service.ProfesorServiciu;

@RestController
public class ProfesorController {

    @Autowired
    private ProfesorServiciu profesorServiciu;

    @RequestMapping(path = "/profesor", method = RequestMethod.GET)
    public ResponseEntity<Profesor> afiseazaProfesor() {
        Profesor raspuns = profesorServiciu.profesorPrincipal();
        return ResponseEntity.ok(raspuns);
    }
}
