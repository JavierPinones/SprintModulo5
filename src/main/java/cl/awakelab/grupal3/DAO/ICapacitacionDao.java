package cl.awakelab.grupal3.DAO;
import cl.awakelab.grupal3.Model.Capacitacion;
import java.util.List;

public interface ICapacitacionDao {

    Capacitacion findById(int id);


    public List<Capacitacion> obtenerCapacitaciones();
    public boolean crearCapacitacion(Capacitacion capacitacion);


//    public Actor findById(int id);
//    public List<Actor> findAll();
//    public boolean create(Actor a);
//    public boolean update(Actor a);
//    public boolean delete(int id);

}

