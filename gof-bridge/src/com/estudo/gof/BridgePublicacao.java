package com.estudo.gof;

public class BridgePublicacao {
	private Publicacao publicacao;

	public BridgePublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}
}
