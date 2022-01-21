public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorToyota = new Persona("Maria","Ochoa");

        Rueda[] ruedasToyota = {new Rueda("Pirelli", 16, 8.0),
                new Rueda("Pirelli", 16, 8.0),
                new Rueda("Pirelli", 16, 8.0),
                new Rueda("Pirelli", 16, 8.0),
                new Rueda("Pirelli", 16, 8.0)};
        Automovil toyota = new Automovil("Toyota","Corolla", Color.NEGRO,
                new Motor(1.8, TipoMotor.GASOLINA), new Tanque(70),conductorToyota, ruedasToyota);

        Persona conductorNissan = new Persona("Carlos","Barrios");
        Automovil nissan = new Automovil("Nissan","Sentra", Color.AZUL,
                new Motor(1.6, TipoMotor.GASOLINA),new Tanque(50));
        nissan.setConductor(conductorNissan);
        nissan.addRueda(new Rueda("Goodyear", 16, 8.0)).
        addRueda(new Rueda("Goodyear", 16, 8.0)).
        addRueda(new Rueda("Goodyear", 16, 8.0)).
        addRueda(new Rueda("Goodyear", 16, 8.0)).
        addRueda(new Rueda("Goodyear", 16, 8.0));

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaro");
        subaru.setModelo("Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTanque(new Tanque());
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Rafael", "Lopez");
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(motorMazda);
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        System.out.println(toyota.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(toyota);
        System.out.println(nissan);
        System.out.println(subaru);
        System.out.println(mazda);


    }
}
