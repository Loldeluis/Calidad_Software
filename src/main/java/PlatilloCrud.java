import java.util.ArrayList;
import java.util.List;

// Clase que gestiona el CRUD de platillos
public class PlatilloCrud {
    // Lista que representa el menú (almacén de todos los platillos)
    private List<Platillo> menu = new ArrayList<>();

    // Método para crear (agregar) un platillo al menú
    public boolean crearPlatillo(Platillo platillo) throws Exception {
        // Validación: el nombre y la descripción no pueden ser nulos ni vacíos
        if (platillo.getNombre() == null || platillo.getNombre().isEmpty() ||
                platillo.getDescripcion() == null || platillo.getDescripcion().isEmpty()) {
            throw new Exception("Los campos obligatorios no pueden estar vacíos.");
        }

        // Si pasa la validación, se agrega el platillo al menú
        menu.add(platillo);
        return true; // Retorna true para indicar que la operación fue exitosa
    }

    // Método para obtener la lista completa de platillos del menú
    public List<Platillo> getMenu() {
        return menu;
    }
}

