package br.ufg.inf.fs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hotel")
	private Integer idHotel;
	
	@Column(name="nome_hotel")
	private String nmHotel;
	
	private String endereco;

	@Column(name="quantidade_estrelas")
	private Integer qtdEstrelas;
	
	public Hotel() {
		super();
	}

	public Hotel(Integer idHotel, String nmHotel, String endereco, Integer qtdEstrelas) {
		super();
		this.idHotel = idHotel;
		this.nmHotel = nmHotel;
		this.endereco = endereco;
		this.qtdEstrelas = qtdEstrelas;
	}

	public Integer getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	public String getNmHotel() {
		return nmHotel;
	}

	public void setNmHotel(String nmHotel) {
		this.nmHotel = nmHotel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getQtdEstrelas() {
		return qtdEstrelas;
	}

	public void setQtdEstrelas(Integer qtdEstrelas) {
		this.qtdEstrelas = qtdEstrelas;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nmHotel=" + nmHotel + ", endereco=" + endereco + ", qtdEstrelas="
				+ qtdEstrelas + "]";
	}
	
}
