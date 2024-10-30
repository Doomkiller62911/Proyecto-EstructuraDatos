
package Controllers;


public class MenuController {
    MetodosController metodos = new MetodosController();

    public void MenuPrincipal() {
        int opc = -1;
        String[] opciones = new String[4];
        opciones[0] = "Crear Camion";
        opciones[1] = "Hacer pedido";
        opciones[2] = "Consultar";
        opciones[3] = "Salir";

        while (opc != 3) {
            opc = metodos.menuBotones("Seleccione un opción", "Menú Principal", opciones, "Salir");
            switch (opc) {
                case 0:
                    
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    metodos.msg("Saliendo del sistema", "Cerrando", 2);
                    break;
            }

        }
    }
   
    
}
