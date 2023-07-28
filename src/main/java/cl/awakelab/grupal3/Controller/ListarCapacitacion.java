package cl.awakelab.grupal3.Controller;

import cl.awakelab.grupal3.DAO.CapacitacionDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.awakelab.grupal3.Model.Capacitacion;
import org.springframework.ui.Model;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/listarCapacitacion")

public class ListarCapacitacion {
    private final CapacitacionDao capacitacionDao;

    public ListarCapacitacion(CapacitacionDao capacitacionDao) {
        this.capacitacionDao = capacitacionDao;
    }

    @GetMapping
    public String getListarCapacitacion(Model model) {
        List<Capacitacion> capacitaciones = capacitacionDao.obtenerCapacitaciones();
        model.addAttribute("capacitaciones", capacitaciones);
        return "listarCapacitacion";
    }
}
