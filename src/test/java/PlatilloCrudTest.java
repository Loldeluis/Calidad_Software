// Importa las anotaciones y utilidades de JUnit 5
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Clase de pruebas para la gestión de platillos
public class PlatilloCrudTest {

    // Objeto que se va a probar (el CRUD de platillos)
    private PlatilloCrud crud;

    // Antes de cada prueba, se inicializa un CRUD vacío
    @BeforeEach
    void setUp() {
        crud = new PlatilloCrud();
    }

    // Caso de prueba 1:
    // Verifica que al crear un platillo válido se agregue correctamente al menú
    @Test
    void test_crear_platillo_valido_debe_agregarse_al_menu() throws Exception {
        Platillo platillo = new Platillo("Tacos al pastor", 25.5, "Tacos con carne de cerdo marinada");

        assertTrue(crud.crearPlatillo(platillo)); // Se espera que retorne true
        assertEquals(1, crud.getMenu().size());  // El menú debe tener 1 platillo
    }

    // Caso de prueba 2:
    // Verifica que si el platillo no tiene nombre, debe lanzar una excepción
    @Test
    void test_crear_platillo_sin_nombre_debe_lanzar_excepcion() {
        Platillo platillo = new Platillo("", 30.0, "Sopa de verduras");

        Exception exception = assertThrows(Exception.class, () -> crud.crearPlatillo(platillo));
        assertEquals("Los campos obligatorios no pueden estar vacíos.", exception.getMessage());
    }

    // Caso de prueba 3:
    // Verifica que si el platillo no tiene descripción, debe lanzar una excepción
    @Test
    void test_crear_platillo_sin_descripcion_debe_lanzar_excepcion() {
        Platillo platillo = new Platillo("Pizza Margarita", 40.0, "");

        Exception exception = assertThrows(Exception.class, () -> crud.crearPlatillo(platillo));
        assertEquals("Los campos obligatorios no pueden estar vacíos.", exception.getMessage());
    }

    // Caso de prueba 4:
    // Verifica que al iniciar, el menú esté vacío
    @Test
    void test_menu_inicial_debe_estar_vacio() {
        assertTrue(crud.getMenu().isEmpty());
    }

    // Caso de prueba 5:
    // Verifica que al agregar varios platillos, todos se guarden en el menú
    @Test
    void test_agregar_varios_platillos_debe_guardarlos_todos_en_menu() throws Exception {
        crud.crearPlatillo(new Platillo("Hamburguesa", 35.0, "Hamburguesa con queso y papas fritas"));
        crud.crearPlatillo(new Platillo("Ensalada César", 28.0, "Ensalada con pollo y aderezo César"));

        assertEquals(2, crud.getMenu().size()); // El menú debe tener 2 platillos
    }
}
