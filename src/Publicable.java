public interface Publicable {

    String numeroSerieMotor();
    String marca();
    String versionAndroidAuto();
    String color();

    int precio();
    int anio();
    int cantCambios();
    int cantPuertas();
    int peso();
    int potencia();
    int capacidadBaul();
    int kilometros();
    int valvulas();
    int pulgadasPantalla();
    int cantPlazas();
    int cantAirbags();

    float cilindrada();

    boolean tieneAndroidAuto();
    boolean tieneAppleCar();
    boolean tieneCajaAutomatica();
    boolean tieneLevantavidrioAdelante();
    boolean tieneFarosAntiniebla();
    boolean tieneAirbagDelantero();
    boolean tieneAirbagTrasero();
    boolean tieneGnc();
    boolean es4x4();
    boolean esElectrico();
    boolean esHibrido();

}
