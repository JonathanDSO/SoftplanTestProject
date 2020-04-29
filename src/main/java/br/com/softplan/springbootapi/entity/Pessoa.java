package br.com.softplan.springbootapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;

import br.com.softplan.springbootapi.enums.SexoEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Pessoa {

	@ApiModelProperty(value = "Código da pessoa")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ApiModelProperty(value = "Nome da pessoa")
	@Column(nullable = false)
	private String nome;

	@ApiModelProperty(value = "Sexo da pessoa")
	@Enumerated(EnumType.STRING)
	@Column(length = 1)
	private SexoEnum sexo;

	@ApiModelProperty(value = "E-mail da pessoa")
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
	@Column()
	private String email;

	@ApiModelProperty(value = "Data de nascimento da pessoa")
	@Column(name = "data_nascimento", nullable = false)
	private Date dataNascimento;

	@ApiModelProperty(value = "Naturalidade da pessoa")
	@Column()
	private String naturalidade;

	@ApiModelProperty(value = "Nacionalidade da pessoa")
	@Column()
	private String nacionalidade;

	@ApiModelProperty(value = "CPF da pessoa")
	@CPF
	@Column(nullable = false, unique = true)
	private String cpf;

}