package ro.trc.ziua4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ro.trc.ziua4.adnotare.Selectabil;

import java.lang.annotation.Annotation;
import java.util.Map;

@Service
public class ServiciuCautareAdnotare {

    @Autowired
    private ApplicationContext applicationContext;

    public String gasesteClasa(Class<? extends Annotation> kls) {
        Map<String, Object> mapare = applicationContext.getBeansWithAnnotation(kls);
        StringBuilder sb = new StringBuilder("Am gasit: ");
        mapare.forEach((key, value) -> sb.append(key).append(" "));

        return sb.toString();
    }
}
