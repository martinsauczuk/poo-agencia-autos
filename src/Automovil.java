public class Automovil implements Publicable {

    private String numeroSerieMotor;
    private String marca;
    private String versionAndroidAuto;
    private String color;

    private int precio;
    private int anio;
    private int cantCambios;
    private int cantPuertas;
    private int peso;
    private int potencia;
    private int capacidadBaul;
    private int kilometros;
    private int valvulas;
    private int pulgadasPantalla;
    private int cantPlazas;
    private int cantAirbags;

    private float cilindrada;

    private boolean tieneAndroidAuto;
    private boolean tieneAppleCar;
    private boolean tieneCajaAutomatica;
    private boolean tieneLevantavidrioAdelante;
    private boolean tieneFarosAntiniebla;
    private boolean tieneAirbagDelantero;
    private boolean tieneAirbagTrasero;
    private boolean tieneGnc;
    private boolean es4x4;
    private boolean esElectrico;
    private boolean esHibrido;

    @Override
    public String numeroSerieMotor() {
        return this.numeroSerieMotor;
    }

    @Override
    public String marca() {
        return this.marca;
    }

    @Override
    public String versionAndroidAuto() {
        return this.versionAndroidAuto;
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public int precio() {
        return this.precio;
    }

    @Override
    public int anio() {
        return this.anio;
    }

    @Override
    public int cantCambios() {
        return this.cantCambios;
    }

    @Override
    public int cantPuertas() {
        return this.cantPuertas;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public int potencia() {
        return this.potencia;
    }

    @Override
    public int capacidadBaul() {
        return this.capacidadBaul;
    }

    @Override
    public int kilometros() {
        return this.kilometros;
    }

    @Override
    public int valvulas() {
        return this.valvulas;
    }

    @Override
    public int pulgadasPantalla() {
        return this.pulgadasPantalla;
    }

    @Override
    public int cantPlazas() {
        return this.cantPlazas;
    }

    @Override
    public int cantAirbags() {
        return this.cantAirbags;
    }

    @Override
    public float cilindrada() {
        return this.cilindrada;
    }

    @Override
    public boolean tieneAndroidAuto() {
        return this.tieneAndroidAuto;
    }

    @Override
    public boolean tieneAppleCar() {
        return this.tieneAppleCar;
    }

    @Override
    public boolean tieneCajaAutomatica() {
        return this.tieneCajaAutomatica;
    }

    @Override
    public boolean tieneLevantavidrioAdelante() {
        return this.tieneLevantavidrioAdelante;
    }

    @Override
    public boolean tieneFarosAntiniebla() {
        return tieneFarosAntiniebla;
    }

    @Override
    public boolean tieneAirbagDelantero() {
        return this.tieneAirbagDelantero;
    }

    @Override
    public boolean tieneAirbagTrasero() {
        return this.tieneAirbagTrasero;
    }

    @Override
    public boolean tieneGnc() {
        return this.tieneGnc;
    }

    @Override
    public boolean es4x4() {
        return es4x4;
    }

    @Override
    public boolean esElectrico() {
        return this.esElectrico;
    }

    @Override
    public boolean esHibrido() {
        return this.esHibrido;
    }
}
