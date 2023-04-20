package com.generation.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos") /* CREATE TABLE tb_produtos */
public class Produto {

	@Id // O atributo é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremented
	private Long id;

	@NotNull(message = "Nome é obrigatório!")
	private String nome;

	@NotNull(message = "Descrição é obrigatória!")
	@Size(min = 1, max = 500, message = "Descrição deve ter, no mínimo, 01 e, no máximo, 500 caracteres!")
	private String descricao;

	private String imagem;

	@NotNull(message = "Plataforma é obrigatória!")
	@Size(min = 1, max = 100, message = "Plataforma deve ter, no mínimo, 01 e, no máximo, 100 caracteres!")
	private String console;

	@NotNull(message = "Desenvolvedor é obrigatório!")
	@Size(min = 1, max = 255, message = "Desenvolvedor deve ter, no mínimo, 01 e, no máximo, 255 caracteres!")
	private String desenvolvedor;

	@NotNull(message = "Preço é obrigatório!")
	@Positive(message = "Preço deve ser maior que zero!")
	private BigDecimal preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
