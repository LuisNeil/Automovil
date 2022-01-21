import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Date fecha = new Date();

        Automovil toyota = new Automovil("Toyota","Corolla", Color.NEGRO,
                new Motor(1.8, TipoMotor.GASOLINA), new Tanque(70));
        Automovil nissan = new Automovil("Nissan","Sentra", Color.AZUL,
                new Motor(1.6, TipoMotor.GASOLINA),new Tanque(50));
        Automovil nissan2 = new Automovil("Nissan","Sentra", Color.AZUL,
                new Motor(1.6, TipoMotor.GASOLINA),new Tanque(50));
        Automovil auto = new Automovil();

        Motor motorSubaru = new Motor(2.0 , TipoMotor.GASOLINA);
        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.VERDE);
        //subaru.setTanque(new Tanque(45));

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTanque(new Tanque(80));

        System.out.println(toyota.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println(subaru.calcularConsumo(300, 0.75f) + " km/L");
        System.out.println(toyota.calcularConsumo(300, 0.75f) +" km/L");
        System.out.println(mazda.calcularConsumo(400, 0.8f) + " km/L");

        System.out.println("Son iguales? " + nissan.equals(nissan2));
        System.out.println("Son iguales? " + auto.equals(nissan));
        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());
        System.out.println("Kilometros por litro: " + Automovil.calcularConsumoStatic(300, 0.6f) + " km/L");

    }
}
