public class AlmacenamientoServidor {
    protected double capacidadGb;
    protected double TasatranferenciaMb;
    protected String proveedor;

    public AlmacenamientoServidor(double capacidadGb,double TasatranferenciaMb,String proveedor){
        this.capacidadGb = capacidadGb;
        this.TasatranferenciaMb = TasatranferenciaMb;
        this. proveedor = proveedor;
    }
    public void mostrarDetalles() {
        System.out.println("Capacidad: " + capacidadGb + " GB");
        System.out.println("Velocidad: " + TasatranferenciaMb + " MB/s");
        System.out.println("Proveedor: " + proveedor);
    }
}
