package cl.awakelab.grupal3.DAO;

import cl.awakelab.grupal3.Model.Capacitacion;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class CapacitacionDao implements ICapacitacionDao {
//    listaCapacitaciones = new ArrayList<>();
    private final List<Capacitacion> listaCapacitaciones;

    public CapacitacionDao() {
        listaCapacitaciones = new ArrayList<>();
        // Agregar algunos datos de ejemplo a la lista

        listaCapacitaciones.add(new Capacitacion(1, "Capacitación A", "Detalle A",
                LocalDate.of(2023, 7, 25), LocalTime.of(10, 0), "Lugar A", "1 hora", 20));
        listaCapacitaciones.add(new Capacitacion(2, "Capacitación B", "Detalle B",
                LocalDate.of(2023, 7, 26), LocalTime.of(14, 30), "Lugar B", "2 horas", 15));
        listaCapacitaciones.add(new Capacitacion(3, "Capacitación C", "Detalle C",
                LocalDate.of(2023, 7, 27), LocalTime.of(9, 0), "Lugar C", "1.5 horas", 25));
    }

//    public class ActorService {
//
//        public List<ActorDTO> findAll(){
//            List<ActorDTO> actorDTOList = new ArrayList<ActorDTO>();
//
//            actorDTOList.add(new ActorDTO(1, "Rocio", "Cortavista"));
//            actorDTOList.add(new ActorDTO(2, "Kevin", "Johansen"));
//            actorDTOList.add(new ActorDTO(3, "Gallardo", "Caballero"));
//            actorDTOList.add(new ActorDTO(4, "Boby", "Balboa"));
//            actorDTOList.add(new ActorDTO(5, "Betty", "Boob"));
//
//            return actorDTOList;
//        }


    @Override
    public Capacitacion findById(int id) {
        // Implementar lógica para obtener una capacitación por su ID
        // Retorna la capacitación encontrada o null si no existe
        for (Capacitacion capacitacion : listaCapacitaciones) {
            if (capacitacion.getId() == id) {
                return capacitacion;
            }
        }
        return null;
    }

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return listaCapacitaciones;
    }

    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
        return false;
    }
}
