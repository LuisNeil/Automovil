import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueStatic(70);
        Automovil.setColorPatente(Color.ROJO);
        System.out.println("Velocidad max carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad max ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        Automovil toyota = new Automovil("Toyota","Corolla", Color.NEGRO,
                new Motor(1.8, TipoMotor.GASOLINA), new Tanque(70));
        Automovil nissan = new Automovil("Nissan","Sentra", Color.AZUL,
                new Motor(1.6, TipoMotor.GASOLINA),new Tanque(50));

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

        System.out.println(toyota.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println("Automovil get Color patente: " + Automovil.getColorPatente());
        System.out.println("Kilometros por litro: " + Automovil.calcularConsumoStatic(300, 0.6f));
        System.out.println(toyota);
        System.out.println(nissan);
        System.out.println(subaru);
        System.out.println(mazda);

        TipoAutomovil tipoMazda = mazda.getTipo();
        System.out.println("Tipo mazda: " + tipoMazda.getNombre());
        System.out.println("Tipo descripcion mazda: " + tipoMazda.getDescripcion());
    }
}
