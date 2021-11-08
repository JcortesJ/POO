class Profesor{
    private String nombre;
    private int edad;
    private String ID;
    private String email;
    private ArrayList<Grupos> dictados;
    private ArrayList<Notas> califica;
    //METODOS GET Y SET
    
    public void setNombre (String a){
        this.nombre = a;
    }
    
    public String getNombre ( ){
        return this.nombre;
    }
    
        public void setEdad (int i){
            this.edad = i;
    }
    
    public int getEdad ( ){
        return this.edad;
    }
    
        public void setID (String ID ){
             this.ID = ID;
    }
    
    public String getID ( ){
        return this.ID;
    }
    
        public void setEmail (String a ){
           this.email=a;
    }
    
    public String getEmail ( ){
        return this.email;
    }
    
    //GET Y SET PARA LOS ARRAYLIST
    //PARA LOS get ES indispensable tener el indice de cada elemento
    //recuerda que a los set se les da de argumento un objeto.
        public void setGrupo (Grupos e){
              this.dictados.add(e);
    }
    
    public Grupos getGrupo (int a){
        return dictados.get(a);
    }
    
       public void setNotas (Notas e){
              this.califica.add(e);
    }
    
    public Notas getNotas (int a){
        return califica.get(a);
    }


    
    
}

class Estudiante{
    private String nombre;
    private int edad;
    private String usuario;
    private String ID;
    private Papitos acudiente;
    private ArrayList<Grupos> atiende;
    private ArrayList<Subsidios> obtiene;
    private ArrayList<Materias> materiasinscritas;
    private ArrayList<Notas> recibe;
    
    public void setAcudiente(Papitos a){
        this.acudiente = a;
    }
    
    public Papitos getAcudiente(){
        return this.acudiente;
    }
    
}

class Papitos{
    private String nombre;
    private String ID;
    private ArrayList<Estudiante> acudiente;
    
    public void setNombre( String a){
        this.nombre = a;
    }
    
    public String getNombre( String a){
        return this.nombre;
    }
    
       public void setID( String a){
        this.ID = a;
    }
    
    public String getID( String a){
        return this.ID;
    }
    
    public void setAcudiente(Estudiante a){
        acudiente.add(a);
    }
    
    public Estudiante getAcudiente(int a){
        return acudiente.get(a);
    }
    
    
}



class Grupos{
    private int numero;
    private String[] horario;
    private ArrayList<Materias> nombre;
    private Profesor profesor;
    private int cupos;
    private ArrayList<Estudiante> estudiantes;
    //Los estudiantes deben poder inscribirse a los grupos
    private ArrayList<Notas> notasGrupo;
    
    public void setHorario(String i, int indice){ //habria que decirle al usuario, que cada dia de la semana tiene un numero
        //y que segun ese dia pues ponga el respectivo.
        this.horario[indice] = i; 
    }
    
    public void getHorario(){
        for(int i=0; i< horario.length; i++){
            System.out.println(horario[i]);
        }
        //queda pendiente hacer un override del metodo String, para mostrar de una forma más
        //apropiada la información. 
    }
    
    }
    
            

class Subsidios{
    private String tipo;
    private double valor;
    private int duracionSemestres;
    private ArrayList<Estudiante> beneficiarios;
}

class Notas{
    private int valor;
    private ArrayList<Estudiante> asignar;
    
}

class Materias{
   private int codigo;
    private String nombre;
    private int creditos;
    private ArrayList<Grupos> grupos;

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigoMateria){
        this.codigo = codigoMateria;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreMateria){
        this.nombre = nombreMateria;
    }

    public int getCreditos(){
        return this.creditos;
    }
    public void setCreditos(int creditosMateria){
        this.creditos = creditosMateria;
    }

    public Grupos getGrupos(int indice){
        return this.grupos.get(indice);
    }
    public void setGrupos(Grupos grupoMateria){
        this.grupos.add(grupoMateria);
    }
}
    


    

