public class AlmacenamientoNube extends AlmacenamientoServidor{
    private double costoPorGbMensual;

    public AlmacenamientoNube(double capacidadGb, double tasatransferenciaMb, String proveedor, double costoPorGbMensual) {
        super(capacidadGb, tasatransferenciaMb, proveedor);
        this.costoPorGbMensual = costoPorGbMensual;
    }

    public double calcularCostoMensual() {
        return capacidadGb * costoPorGbMensual;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Costo por GB mensual: $" + costoPorGbMensual);
        System.out.println("Costo mensual total: $" + calcularCostoMensual());
    }
}
