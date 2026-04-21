package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.MenuPrincipalView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        MenuPrincipalView ventanaPrincipal = new MenuPrincipalView();
        ventanaPrincipal.setVisible(true);
    }
}
