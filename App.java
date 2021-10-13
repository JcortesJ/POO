package MyappJava.src;




public class App {
    static int numeros[]= new int[]{1,2,3,4,5,6,7,8,9} ;
    static int respuesta_cerveza[] = new int[3];
    static int cervezas [][]=new int[3][3];
    static char respuesta_cafe[]= new char[4];
    static char letras[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
    static char cafes[][]=new char[4][4];
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(holaMundo());
        llenar_cervezas();
        llenar_cafes();
        imprimir();
        diagonal_superior();
        diagonal_inferior();
    }

    public static String holaMundo() {
        String hola = "Hola mundo";
        return hola;    
    }

    static void llenar_cervezas(){
        //En esta funcion lo que hacemos es llenar la matriz de cervezas con los numeros del 1 al 9
        //La variable a nos sirve como contador para poner los numeros
            int a = 0;
        for(int i = 0; i< 3; i++){
            
            for(int j=0; j<3; j++){
                cervezas[i][j]=numeros[a] ;
                a++;
            }
            
        }
    }
    static void imprimir(){
        //En esta funcion imprimimos las matrices para asegurarnos de que todo est� bien
        System.out.println("Cervezas");
        System.out.println("\n");
            for(int i = 0; i< 3; i++){
            for(int j=0; j<3; j++){
                System.out.println("| "+cervezas[i][j]+" |");
                
                
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("Cafes" + "\n");
            for(int a = 0; a< 4; a++){
            for(int b=0; b<4; b++){
                System.out.println("| "+cafes[a][b]+" |");
            }
            System.out.println("\n");
        }
    }
    
    static void diagonal_superior(){
        //En esta funcion hayamos la diagonal superior, que se encuentra cuando i==j
            for(int i = 0; i< 3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    respuesta_cerveza[i] = cervezas[i][j];
                }
            }
            
        }
        System.out.println("\n");
        System.out.println("La respuesta  (cervezas) es: ");
        
        for(int k = 0; k<3; k++){
            System.out.println(respuesta_cerveza[k]+" ");
        }
    }
    
    //codigo para problema 2
    
    
    static void llenar_cafes(){
        //Aqui llenamos la matriz del cafe con un arreglo que contiene las letras. a nos sirve como contador del arreglo.
            int a = 0;
        for(int i = 0; i< 4; i++){
            
            for(int j=0; j<4; j++){
                cafes[i][j]=letras[a] ;
                a++;
            }
            
        }
    }
    
    static void diagonal_inferior(){
        //para hallar la diagonal inferior, debemos iniciar desde la ultima fila y ascender (i--), e iniciar desde la primera columna y aumentar (j++)
        //se halla cuando j+i == 3.
        //j nos sirve para mostrar en orden ascendente las letras. Puesto que si usaramos i  tendr�amos un orden descendente xd
    
            for(int i = 3; i >= 0; i--){
            for(int j = 0; j<4; j++){
                if(i+j==3){
                    respuesta_cafe[j] = cafes[i][j];
                    
                }
            }
            
        }
        System.out.println("\n");
        System.out.println("La respuesta (cafes) es: ");
        for(int k = 0; k<4; k++){
            
            System.out.println(respuesta_cafe[k]+" ");

        }
    }
}












