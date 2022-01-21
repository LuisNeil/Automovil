public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static int capacidadTanqueStatic = 50;
    private static Color colorPatente = Color.GRIS;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 80;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";


    public Automovil(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
       this(fabricante,modelo);
       this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }


    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante,modelo,color,motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId(){
        return id;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public Color getColor(){
        return this.color;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public Tanque getTanque(){
        if(tanque == null){
            this.tanque = new Tanque();
        }
        return this.tanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static int getCapacidadTanqueStatic(){
        return capacidadTanqueStatic;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void setTanque(Tanque tanque){
        this.tanque = tanque;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static void setCapacidadTanqueStatic(int capacidadTanqueStatic){
        Automovil.capacidadTanqueStatic = capacidadTanqueStatic;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle(){
        String detalle =  "auto.id = "  + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();
        if (this.getTipo() != null){
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
                detalle +=    "\nauto.color = " + this.color;
        if(this.motor != null){
            detalle += "\nauto.motor = " + this.motor.getCilindrada();
        }
        if(this.conductor != null){
            detalle += "\nauto.conductor = " + this.conductor;
        }

        if(getRuedas() != null){
            detalle += "\nRuedas del automovil";
            for (Rueda rueda: this.getRuedas()) {
                detalle += "\n" + rueda.getFabricante() + ", aro: " + rueda.getAro() + ", ancho: " + rueda.getAncho() + ".\n ";
            }
        }
        return detalle;

    }

    public String acelerar(int rpm){
        return "el auto " + fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar(){
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar +"\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(this.getTanque().getCapacidad()*porcentajeGasolina);
    }

    public static float calcularConsumoStatic(int km, float porcentajeGasolina){
        return km/(capacidadTanqueStatic*porcentajeGasolina);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante!= null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + ": " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
