/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Arquivo;

/**
 *
 * @author luisg
 */
public class ArquivoDAO {
    Conexao conexao = new Conexao();
    
    public void adicionar(Arquivo arquivo){
        try{
            String sql = "INSERT INTO arquivo(nomeArquivo, nomeConta, tipoArquivo,"
            + " dataCriacao, detalhes) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            stmt.setString(1, arquivo.getNomeArquivo());
            stmt.setString(2, arquivo.getNomeConta());
            stmt.setString(3, arquivo.getTipoArquivo());
            stmt.setDate(4, new java.sql.Date(arquivo.getDataCriacao().getTime()));
            stmt.setString(5, arquivo.getDetalhes());

            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public Arquivo buscarArquivo(Arquivo arquivo){
        try{
            String sql = "SELECT * FROM arquivo WHERE id = ?";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            stmt.setInt(1, arquivo.getId());
            Arquivo arq = new Arquivo();
            
            while(rs.next()){
                arq.setId(rs.getInt("id"));
                arq.setNomeArquivo(rs.getString("nomeArquivo"));
                arq.setNomeConta(rs.getString("nomeConta"));
                arq.setTipoArquivo(rs.getString("tipoArquivo"));
                arq.setDataCriacao(rs.getDate("dataCriacao"));
                arq.setDetalhes(rs.getString("detalhes"));
            }
            return arq;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Arquivo> buscarArquivoFiltro(String campo, String nome){
        try{
            String sql = "SELECT * FROM arquivo WHERE " +campo + " LIKE ?";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Arquivo> lista = new ArrayList<Arquivo>();
            
            while(rs.next()){
                Arquivo arquivo = new Arquivo();
                arquivo.setId(rs.getInt("id"));
                arquivo.setNomeArquivo(rs.getString("nomeArquivo"));
                arquivo.setNomeConta(rs.getString("nomeConta"));
                arquivo.setTipoArquivo(rs.getString("tipoArquivo"));
                arquivo.setDataCriacao(rs.getDate("dataCriacao"));
                arquivo.setDetalhes(rs.getString("detalhes"));
                lista.add(arquivo);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Arquivo> buscarArquivos(){
        try{
            String sql = "SELECT * FROM arquivo";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Arquivo> lista = new ArrayList<Arquivo>();
            
            while(rs.next()){
                Arquivo arquivo = new Arquivo();
                arquivo.setId(rs.getInt("id"));
                arquivo.setNomeArquivo(rs.getString("nomeArquivo"));
                arquivo.setNomeConta(rs.getString("nomeConta"));
                arquivo.setTipoArquivo(rs.getString("tipoArquivo"));
                arquivo.setDataCriacao(rs.getDate("dataCriacao"));
                arquivo.setDetalhes(rs.getString("detalhes"));
                lista.add(arquivo);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public void alterarArquivo(Arquivo arquivo){
        try{
            String sql = "UPDATE arquivo SET nomeArquivo = ?, nomeConta = ?, "
            + "tipoArquivo = ?, dataCriacao = ?, detalhes = ? WHERE id = ?";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, arquivo.getNomeArquivo());
            stmt.setString(2, arquivo.getNomeConta());
            stmt.setString(3, arquivo.getTipoArquivo());
            stmt.setDate(4, new java.sql.Date(arquivo.getDataCriacao().getTime()));
            stmt.setString(5, arquivo.getDetalhes());
            stmt.setInt(6, arquivo.getId());
            
            stmt.execute();            
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public void excluirArquivo(Arquivo arquivo){
        try{
            String sql = "DELETE FROM arquivo WHERE id = ?";
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, arquivo.getId());
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
