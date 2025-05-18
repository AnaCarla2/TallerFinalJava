package Ejercicio1;

import java.util.ArrayList;

public class GestionUsuarios {
private ArrayList<Usuario> listaUsuarios;


    public GestionUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public GestionUsuarios() {
        this.listaUsuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

   public void registrarUsuarios(String nombre, String email, String contrasena){
      Usuario usuario1 = new Usuario(nombre,email, contrasena);
       listaUsuarios.add(usuario1);
       System.out.println("Usuario registrado con éxito ." );
   }

    public void verificarCredenciales(String email, String contrasena) {
        boolean encontrado = false;

        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(email) && u.getContrasena().equals(contrasena)) {
                System.out.println("¡Inicio de sesión exitoso!Bienvenido/a ." + u.getNombre());
                encontrado = true;
                break; // Ya no es necesario seguir buscando
            }
        }

        if (!encontrado) {
            System.out.println("Credenciales incorrectas");
        }
    }



    }




