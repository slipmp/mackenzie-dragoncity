package Entidades;

public class CasaCentral extends Construcao implements java.io.Serializable{

    private Dragao ovo;

    public Dragao getOvo() {
        return ovo;
    }

    public void setOvo(Dragao ovo) {
        this.ovo = ovo;
    }
    @Override
    public String getNome() {
        return "Casa Central";
    }

}
