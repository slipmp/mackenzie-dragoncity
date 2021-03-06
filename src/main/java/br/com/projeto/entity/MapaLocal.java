package br.com.projeto.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbMapaLocal")
public class MapaLocal implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2226221138819724242L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
    protected int codigo;
	
	@Column(name="PosicaoX")
    private int posicaoX;

	@Column(name="PosicaoY")
    private int posicaoY;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdMapa")
    private Mapa mapa;

	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="IdConstrucao")
    private Construcao construcao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public Construcao getConstrucao() {
        return construcao;
    }

    public void setConstrucao(Construcao construcao) {
        this.construcao = construcao;
    }
}
