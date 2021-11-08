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



public class Grupos{
    private int codigo;
    private int cupos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private String[] horario;
    private Asignatura asignatura;
    private ArrayList<Notas> notasGrupo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Notas> getNotasGrupo() {
        return notasGrupo;
    }

    public void setNotasGrupo(ArrayList<Notas> notasGrupo) {
        this.notasGrupo = notasGrupo;
    }
    
   }
    
            

class Subsidios{
    private String tipo;
    private double valor;
    private int duraciónSemestres;
    private ArrayList<Estudiante> beneficiarios;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuraciónSemestres() {
        return duraciónSemestres;
    }

    public void setDuraciónSemestres(int duraciónSemestres) {
        this.duraciónSemestres = duraciónSemestres;
    }

    public ArrayList<Estudiante> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Estudiante> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }
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
    


    

