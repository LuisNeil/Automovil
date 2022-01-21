public enum Color {
    ROJO("Rojo hambre"),
    NEGRO("Negro noche"),
    AZUL("Azul electrico"),
    BLANCO("Blanco perla"),
    GRIS("Gris oscuro"),
    VERDE("Verde bosque"),
    NARANJA("Naranja Postobon");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
