class Persona {

    //Atributos

    private String nombre;
    private int edad;
    private int telefono;

    //Getters y Setters 

    public String getNombre () {
        return nombre;
    }

    public int getEdad () {
        return edad;
    }
    
    public int getTelefono () {
        return telefono;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        
        Persona Nepomuseno = new Persona();

        Nepomuseno.setNombre("Nepomuseno");
        Nepomuseno.setEdad(34);
        Nepomuseno.setTelefono(1598337254);

        System.out.println(Nepomuseno.getNombre());
        System.out.println(Nepomuseno.getEdad());
        System.out.println(Nepomuseno.getTelefono());

    }//main

}//class