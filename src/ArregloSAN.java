public class ArregloSAN extends AlmacenamientoServidor{
    private int cantidadDiscos;

    public ArregloSAN(double capacidadGb, double tasaTransferenciaMb, String proveedor, int cantidadDiscos) {
        super(capacidadGb, tasaTransferenciaMb, proveedor);
        this.cantidadDiscos = cantidadDiscos;
    }

    public double calcularRendimiento() {
        return TasatranferenciaMb * cantidadDiscos;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cantidad de discos: " + cantidadDiscos);
        System.out.println("Rendimiento calculado: " + calcularRendimiento() + " MB/s");
    }
}
