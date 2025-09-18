// Clase que representa un Platillo en el sistema
public class Platillo {
    // Atributos principales del platillo
    private String nombre;       // Nombre del platillo (ejemplo: "Pizza Margarita")
    private double precio;       // Precio del platillo (ejemplo: 40.0)
    private String descripcion;  // Descripción breve (ejemplo: "Pizza con queso y albahaca")

    // Constructor: inicializa un nuevo platillo con sus valores
    public Platillo(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Métodos "getters" para acceder a los atributos de forma segura
    public String getNombre() { return nombre; }       // Retorna el nombre
    public double getPrecio() { return precio; }       // Retorna el precio
    public String getDescripcion() { return descripcion; } // Retorna la descripción
}
