package ro.trc.ziua4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.trc.ziua4.domeniu.Profesor;
import ro.trc.ziua4.repository.ProfesorRepository;

@Service
public class ProfesorServiciu {

    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor profesorPrincipal() {
        return profesorRepository.getProfesorPrincipalFromDatabase();
    }
}
