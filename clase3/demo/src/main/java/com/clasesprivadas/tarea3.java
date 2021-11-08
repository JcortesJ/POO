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
    private Papitos acudiente;
    private int ID;
    private ArrayList<Grupos> atiende;
    private ArrayList<Materias> materiasInscritas;
    private ArrayList<Subsidios> subsidios;
    private ArrayList<Notas> notas;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreEstudiante){
        this.nombre = nombreEstudiante;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edadEstudiante){
        this.edad = edadEstudiante;
    }

    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuarioEstudiante){
        this.usuario = usuarioEstudiante;
    }

    public Papitos getAcudiente(){
        return this.acudiente;
    }
    public void setAcudiente(Papitos acudienteEstudiante){
        this.acudiente = acudienteEstudiante;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int idEstudiante){
        this.ID = idEstudiante;
    }

    public Grupos getAtiende(int indice){
        return this.atiende.get(indice);
    }
    public void setAtiende(Grupos grupoAtendido){
        this.atiende.add(grupoAtendido);
    }

    public Materias getMateriasInscritas(int indice){
        return this.materiasInscritas.get(indice);
    }
    public void setMateriasInscritas(Materias materiaEstudiante){
        this.materiasInscritas.add(materiaEstudiante);
    }

    public Subsidios getSubsidios(int indice){
        return this.subsidios.get(indice);
    }
    public void setSubsidios(Subsidios subsidioEstudiante){
        this.subsidios.add(subsidioEstudiante);
    }

    public Notas getNotas(int indice){
        return this.notas.get(indice);
    }
    public void setNotas(Notas notaestudiante){
        this.notas.add(notaestudiante);
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
}
    


    

