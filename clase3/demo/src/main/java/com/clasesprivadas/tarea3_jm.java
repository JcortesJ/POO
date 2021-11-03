/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */


import java.util.List;

/**
 *
 * @author juan manuel
 */
public class tarea3_jm {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}

/*
Una institución educativa de carácter público se encuentra desarrollando un sistema 
de información académica similar al SIA. Para tal fin, busca apoyo de las y los estudiantes
que tienen conocimiento de programación para que aporten sus ideas e implementen un prototipo
diseñado desde el paradigma de la programación orientada a objetos. Deben tener en cuenta los 
siguientes requerimientos:

Hacer el modelo del sistema con las siguientes características:

Abstraer como mínimo 7 clases con sus atributos

Realizar el diagrama de clases UML

Contar con objetos como atributos para relacionar las clase (asociaciones)

Encapsular cada una de las clases

Hacer los get y set de cada uno de los atributos en cada una de las clases

Entregar, el diagrama UML y las clases del proyecto.


*/

class profesor{
    private String nombreApellido;
    private int edad;
    private String usuario;
    private String nivel_educativo;
    private List<Cursos> dictados;
    private List<Subsidios> obtiene;
    private List <Notas> califica;
}

class estudiante{
    private String nombreApellido;
    private int edad;
    private String usuario;
    private String gradoActual;
    private List<Cursos> atiende;
    private List<Subsidios> obtiene;
    private List <Notas> saca;
}

class UsuarioExterno{
    private String nombreApellido;
    private int edad;
    private String usuario;
    private int documento;
    
}



class Cursos{
    private int numero;
    private String[] horario;
    private String[] vecesAlaSemana;
    private Materia nombre;
    private profesor dadoPor;
    private 
}

class Subsidios{
    
}

class Notas{
    
}

class Materia{
   
}
    

