package Controllers;

import javax.swing.JOptionPane;

public class MetodosController {

    public void msg(String msg, String titulo, int tipoMsg) {
        /*
         * 0 = "ERROR_MESSAGE"
         * 1 = "INFORMATION_MESSAGE"
         * 2 = "WARNING_MESSAGE"
         * 3 = "QUESTION_MESSAGE"
         */
        JOptionPane.showMessageDialog(null, msg, titulo, tipoMsg);
    }

    public int SIoNo(String msg, String titulo) {
        return JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION);
    }

    public int menuBotones(String msg, String titulo, String opciones[], String valorDefecto) {
        int opcion = JOptionPane.showOptionDialog(null, msg, titulo, 0,
                JOptionPane.QUESTION_MESSAGE, null, opciones, valorDefecto);
        return opcion;
    }

    public String menuDesplegable(String opciones[], String msg, String titulo, String valorInicial) {
        Object opcion = JOptionPane.showInputDialog(null, msg,
                titulo, JOptionPane.QUESTION_MESSAGE, null,
                opciones, valorInicial);
        if (opcion != null) {
            return opcion.toString();
        } else {
            return "Cancelo la solicitud.";
        }
    }

    public String getCadena(String msg, String titulo) {
        String cadena = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
        return cadena;
    }

    public double getDouble(String msg, String titulo) {
        double valor = 0;
        String cadena;
        boolean valido = false;
        do {
            cadena = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
            if (cadena != null) {
                try {
                    valor = Double.parseDouble(cadena);
                    valido = true;
                } catch (NumberFormatException e) {
                    msg("Debe ingresar un número con decimales", "Double", 3);
                }

            } else {
                msg("Debe ingresar un número con decimales", "Double", 3);
            }
        } while (!valido);

        return valor;
    }

    public int getEntero(String msg, String titulo) {
        int valor = 0;
        String cadena;
        boolean valido = false;
        do {
            cadena = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
            if (cadena != null) {
                try {
                    valor = Integer.parseInt(cadena);
                    valido = true;
                } catch (NumberFormatException e) {
                    msg("Debe ingresar un número entero", "Entero", 3);
                }
            } else {
                msg("Debe ingresar un número entero.", "Entero", 3);
            }
        } while (!valido);

        return valor;
    }
}
