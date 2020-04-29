package br.com.softplan.springbootapi.enums;

import java.util.HashMap;
import java.util.Map;

public enum SexoEnum {

	M("M", "Masculino"), F("F", "Feminino");

	private String codigo;
	private String descricao;

	private static final Map<String, SexoEnum> funcaoPorCodigo = new HashMap<>();

	static {
		for (SexoEnum sexoEnum : SexoEnum.values()) {
			funcaoPorCodigo.put(sexoEnum.getCodigo(), sexoEnum);
		}
	}

	SexoEnum(String codigo) {
		this.codigo = codigo;
	}

	private SexoEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static SexoEnum geraCodigo(String cod) {
		if (cod.equals("M")) {
			return M;
		}
		return F;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static SexoEnum pegaFuncaoPorCodigo(String codigo) {
		return funcaoPorCodigo.get(codigo);
	}

}
