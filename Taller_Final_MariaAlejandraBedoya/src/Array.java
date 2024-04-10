//6. Cree dos arrays de tamaño 5, donde capture los datos  de un usuario (id, nombre, apellido, email, contraseña)
// en el primer array ingrese los datos anteriores ,
// en el segundo, escriba los datos del usuario ( 1, pepito , perez, pepito@mail.com, xyz123).
// Con un ciclo for recorra los arrays e imprima la  información en un formato clave valor.

public class Array {
    public static void main(String[] args) {
        String[] keys = {"ID", "Nombre", "Apellido", "Email", "Contraseña"};
        String[] userData = {"1", "Pepito", "Perez", "pepito@mail.com", "xyz123"};

        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + ": " + userData[i]);
        }
    }
}

