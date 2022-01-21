public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano",4),
    STATION_WAGON("Station wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 3),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequenio", 2),
    CONVERTIBLE("Convertible","Auto deportivo", 2),
    FURGON("Furgon","Auto utilitario",3),
    SUV("SUV","Todo terrno deportivo",5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
