public class FerrariSF90XXStradale implements Carro {
    private String motor, modoManejo, ruedasMarca, color, tipoFrenos;

    public FerrariSF90XXStradale(String motor, String modoManejo, String ruedasMarca, String color, String tipoFrenos) {
        this.motor = motor;
        this.modoManejo = modoManejo;
        this.ruedasMarca = ruedasMarca;
        this.color = color;
        this.tipoFrenos = tipoFrenos;
    }

    public void encender() {
        System.out.println("Ferrari SF90 XX Stradale encendido");
    }

    public void acelerar() {
        System.out.println("Ferrari SF90 XX Stradale acelerando");
    }

    public void apagar() {
        System.out.println("Ferrari SF90 XX Stradale apagado");
    }

    public void mostrarDetalles() {
        System.out.println("Ferrari SF90 XX Stradale - Motor: " + motor + ", Modo de Manejo: " + modoManejo + ", Ruedas: " + ruedasMarca + ", Color: " + color + ", Frenos: " + tipoFrenos);
    }
}
