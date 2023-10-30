public class KiaPicanto implements Carro {
    private String motor, transmision, sistemaAudioMarca, color, tipoRin;

    public KiaPicanto(String motor, String transmision, String sistemaAudioMarca, String color, String tipoRin) {
        this.motor = motor;
        this.transmision = transmision;
        this.sistemaAudioMarca = sistemaAudioMarca;
        this.color = color;
        this.tipoRin = tipoRin;
    }

    public void encender() {
        System.out.println("Kia Picanto encendido");
    }

    public void acelerar() {
        System.out.println("Kia Picanto acelerando");
    }

    public void apagar() {
        System.out.println("Kia Picanto apagado");
    }

    public void mostrarDetalles() {
        System.out.println("Kia Picanto - Motor: " + motor + ", Transmisión: " + transmision + ", Sistema de Audio: " + sistemaAudioMarca + ", Color: " + color + ", Tipo de Rin: " + tipoRin);
    }
}
