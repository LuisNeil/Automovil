public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueStatic(70);
        Automovil.setColorPatente(Color.ROJO);
        System.out.println("Velocidad max carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad max ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        Automovil toyota = new Automovil("Toyota","Corolla", Color.NEGRO,
                new Motor(1.8, TipoMotor.GASOLINA), new Tanque(70));
        Automovil nissan = new Automovil("Nissan","Sentra", Color.AZUL,
                new Motor(1.6, TipoMotor.GASOLINA),new Tanque(5));

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaro");
        subaru.setModelo("Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTanque(new Tanque());

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(motorMazda);
        toyota.setTipo(TipoAutomovil.SEDAN);
        mazda.setTipo(TipoAutomovil.PICKUP);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        nissan.setTipo(TipoAutomovil.SEDAN);

        TipoAutomovil tipo = mazda.getTipo();
        System.out.println("Tipo mazda: " + tipo.getNombre());
        System.out.println("Tipo descripcion mazda: " + tipo.getDescripcion());

        tipo = toyota.getTipo();
        switch (tipo){
            case CONVERTIBLE ->
                    System.out.println("Es un automovil es deportivo y descapotable de dos puertasa");
            case COUPE ->
                System.out.println("Es un automovil pequenio de dos puertas y tipicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano, compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }
    }
}
