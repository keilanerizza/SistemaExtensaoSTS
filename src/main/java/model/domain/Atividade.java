package model.domain;

import java.sql.Date;

public class Atividade {

	private Integer numero;
	private String titulo;
	private Integer cargaHoraria;
	private Date dataInicio;
	private Date dataFim;
	private Boolean aprovado;
	private Servidor coordenador;
}
