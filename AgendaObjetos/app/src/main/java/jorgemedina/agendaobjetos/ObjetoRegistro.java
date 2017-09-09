package jorgemedina.agendaobjetos;

import java.io.Serializable;

/**
 * Created by jlmgm on 03/09/2017.
 */

public class ObjetoRegistro implements Serializable{

    private String name;
    private String mail;
    private String twitt;
    private String telefono;
    private String nacimiento;

    public ObjetoRegistro(String name, String mail, String twitt, String telefono, String nacimiento){

        this.name=name;
        this.mail=mail;
        this.twitt=twitt;
        this.telefono=telefono;
        this.nacimiento=nacimiento;

    }


    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getTwitt() {
        return twitt;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

}