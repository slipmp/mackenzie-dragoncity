package br.com.projeto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbCasaCentral")
public class CasaCentral extends Construcao implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToOne
	@Column(name = "IdDragaoOvo")
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