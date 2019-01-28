/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author luisg
 */
public class Arquivo {
    private int id;
    private String nomeArquivo;
    private String nomeConta;
    private String tipoArquivo;
    private Date dataCriacao;
    private String detalhes;

    public Arquivo() {
    }

    public Arquivo(int id, String nomeArquivo, String nomeConta, String tipoArquivo, Date dataCriacao, String detalhes) {
        this.id = id;
        this.nomeArquivo = nomeArquivo;
        this.nomeConta = nomeConta;
        this.tipoArquivo = tipoArquivo;
        this.dataCriacao = dataCriacao;
        this.detalhes = detalhes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    public boolean validaCampos(){
        return !nomeArquivo.equals("") &&
               !nomeConta.equals("");
    }
}
