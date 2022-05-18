package Modelo;

public class Usuario {

    //Atributos
    private String cc;
    private String nombreUsario;
    private String apellidoUsuario;
    private char sexo;

    //Constructor por defecto
    public Usuario() {
    }

    //Contructor sobrecargado
    public Usuario(String cc, String nombreUsario, String apellidoUsuario, char sexo) {
        this.cc = cc;
        this.nombreUsario = nombreUsario;
        this.apellidoUsuario = apellidoUsuario;
        this.sexo = sexo;
    }

    //Gets
    public String getCc() {
        return this.cc;
    }

    public String getNombreUsario() {
        return this.nombreUsario;
    }

    public String getApellidoUsuario() {
        return this.apellidoUsuario;
    }

    public char getSexo() {
        return this.sexo;
    }

    //Sets
    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setNombreUsario(String nombreUsario) {
        this.nombreUsario = nombreUsario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" + "cc=" + cc + ", nombreUsario=" + nombreUsario + ", apellidoUsuario=" + apellidoUsuario + ", sexo=" + sexo + '}';
    }

}
