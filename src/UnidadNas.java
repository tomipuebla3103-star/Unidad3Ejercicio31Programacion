public class UnidadNas extends AlmacenamientoServidor{
    private int bahiasDiscos;

    public UnidadNas(double capacidadGb, double tasaTransferenciaMb, String proveedor, int bahiasDiscos) {
        super(capacidadGb, tasaTransferenciaMb, proveedor);
        this.bahiasDiscos = bahiasDiscos;
    }

    public double calcularRendimiento() {
        return TasatranferenciaMb * bahiasDiscos;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bahias de discos: " + bahiasDiscos);
        System.out.println("Rendimiento calculado: " + calcularRendimiento() + " MB/s");
    }
}
