import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impreza");
        Persona conductorSubaru = new Persona("Mari", "Martinez");
        subaru.setConductor(conductorSubaru);
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setTanque(new Tanque());

        Automovil mazda = new Automovil("Mazda","BT-50",Color.GRIS,new Motor(3.0, TipoMotor.DIESEL));
        Persona conductorMazda = new Persona("Gonzalo", "Gonzalez");
        mazda.setConductor(conductorMazda);
        mazda.setTanque(new Tanque());
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(4.0,TipoMotor.DIESEL), new Tanque(50));
        Persona conductorNissan = new Persona("Neil", "Navarro");
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.GASOLINA), new Tanque(50));
        Persona conductorSuzuki = new Persona("Sandra", "Suarez");
        suzuki.setConductor(conductorSuzuki);
        suzuki.setColor(Color.NARANJA);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi  = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Alejandra", "Alvarez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}
