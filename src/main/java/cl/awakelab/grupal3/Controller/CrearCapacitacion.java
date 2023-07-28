package cl.awakelab.grupal3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearCapacitacion")

public class CrearCapacitacion {

    @GetMapping
    public String getCrearCapacitacion(){
        return ("crearCapacitacion");
    }
}
