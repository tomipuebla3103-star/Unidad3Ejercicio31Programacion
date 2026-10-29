//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    UnidadNas nas = new UnidadNas(2000, 100, "Synology", 4);
    ArregloSAN san = new ArregloSAN(10000, 500, "Dell", 8);
    AlmacenamientoNube nube = new AlmacenamientoNube(5000, 200, "Amazon", 0.05);

    System.out.println("=== UNIDAD NAS ===");
    nas.mostrarDetalles();

    System.out.println("\n=== ARREGLO SAN ===");
    san.mostrarDetalles();

    System.out.println("\n=== ALMACENAMIENTO EN LA NUBE ===");
    nube.mostrarDetalles();
}
