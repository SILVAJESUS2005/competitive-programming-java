public class Persona {
    String nombre;
    int edad;
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String []srgs){

        Persona persona_Uno = new Persona("Juan",20);
        Persona persona_Dos = new Persona("Juana",21);

        System.out.println(persona_Uno);
        System.out.println(persona_Dos);

    }
}