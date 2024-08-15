/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import model.videogame;
import model.videogamebuilder;
/**
 *
 * @author PC Gamer
 */
public class videogamedao {
        public List<videogame> listartodos() throws SQLException {
        Connection con = util.ConectaBanco.getConexao();
        List<videogame> lista = new ArrayList<videogame>();
        PreparedStatement comando = con.prepareStatement("select * from videogame");
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            videogamebuilder vb = new videogamebuilder();
            vb.setAno(resultado.getString("ano"));
            vb.setFabricante(resultado.getNString("fabricante"));
            vb.setGarantia(resultado.getNString("garantia"));
            vb.setId(resultado.getInt("id"));
            vb.setMemoria(resultado.getInt("memoria"));
            vb.setNome(resultado.getString("nome"));
            vb.setProcessador(resultado.getString("processador"));
            vb.setTipo(resultado.getString("tipo"));
            vb.setTipomidia(resultado.getString("tipomidia"));
            vb.setValor(resultado.getDouble("valor"));
            videogame v = vb.constroi();
            lista.add(v);
        }

        con.close();
        return lista;

    }
    
    public void cadastrar(videogame u) throws SQLException {
                Connection con = util.ConectaBanco.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into videogame (nome,fabricante,tipo,garantia,valor,memoria,processador,tipomidia,ano)values (?,?,?,?,?,?,?,?,?)" );
        comando.setString(1, u.getNome());
        comando.setString(2, u.getFabricante());
        comando.setString(3, u.getTipo());
        comando.setString(4, u.getGarantia());
        comando.setDouble(5, u.getValor());
        comando.setInt(6, u.getMemoria());
        comando.setString(7, u.getProcessador());
        comando.setString(8, u.getTipomidia());
        comando.setString(9, u.getAno());
        comando.execute();
        con.close();
    }
    
    
         public void deletar(videogame v) {
         
         try {
             String id = Integer.toString(v.getId());
         Connection con = util.ConectaBanco.getConexao();
         PreparedStatement comando = con.prepareStatement("delete from videogame where id = ?");
         comando.setString(1, id);
         comando.execute();
         comando.close();
         } catch (SQLException ex) {
             throw new RuntimeException(ex);
         }
         
     }
         
         
    public model.videogame buscardados(String id) {
        model.videogame v = new model.videogame();
        try {
            Connection con = util.ConectaBanco.getConexao();
            PreparedStatement comando = con.prepareStatement("select * from videogame where id = ?");
            comando.setString(1, id);
            ResultSet rs = comando.executeQuery();
            rs.next();
            /* v = new model.videogame(Integer.parseInt(id), rs.getString("nome"), 
            rs.getString("fabricante"), rs.getString("tipo"), rs.getString("garantia"), 
            rs.getDouble("valor"), rs.getInt("memoria"), rs.getString("processador"),
            rs.getString("tipomidia"), rs.getString("ano")); */

            videogamebuilder vb = new videogamebuilder();
            vb.setId(Integer.parseInt(id));
            vb.setNome(rs.getString("nome"));
            vb.setFabricante(rs.getString("fabricante"));
            vb.setTipo(rs.getString("tipo"));
            vb.setGarantia(rs.getString("garantia"));
            vb.setValor(rs.getDouble("valor"));
            vb.setMemoria(rs.getInt("memoria"));
            vb.setProcessador(rs.getString("processador"));
            vb.setTipomidia(rs.getString("tipomidia"));
            vb.setAno(rs.getString("ano"));
            
            v = vb.constroi();
            comando.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return v;
    }
         
         
             public void editar(videogame v) {
         
         try {
         Connection con = util.ConectaBanco.getConexao();
         PreparedStatement comando = con.prepareStatement("update videogame set nome =?, fabricante = ?, tipo = ?, garantia = ?, valor = ?, memoria = ?, processador = ? , tipomidia = ?, ano = ? where id = ?");
         comando.setString(1, v.getNome());
         comando.setString(2, v.getFabricante());
         comando.setString(3, v.getTipo());
         comando.setString(4, v.getGarantia());
         comando.setDouble(5, v.getValor());
         comando.setInt(6, v.getMemoria());
         comando.setString(7, v.getProcessador());
         comando.setString(8, v.getTipomidia());
         comando.setString(9, v.getAno());
          comando.setInt(10, v.getId());
         comando.execute();
         comando.close();
         } catch (SQLException ex) {
             throw new RuntimeException(ex);
         }
         
     }   
             
             
    public List<videogame> filtro(String x) throws SQLException {

        Connection con = util.ConectaBanco.getConexao();

        List<videogame> lista = new ArrayList<videogame>();

        PreparedStatement comando = con.prepareStatement("select * from videogame where id = ? or fabricante = ? or garantia = ? or ano = ? or memoria = ? or nome = ? or processador = ? or tipo = ? or tipomidia = ? or valor = ?");
        comando.setString(1, x);
        comando.setString(2, x);
        comando.setString(3, x);
        comando.setString(4, x);
        comando.setString(5, x);
        comando.setString(6, x);
        comando.setString(7, x);
        comando.setString(8, x);
        comando.setString(9, x);
        comando.setString(10, x);

        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {

            videogamebuilder vb = new videogamebuilder();
            vb.setAno(resultado.getString("ano"));
            vb.setFabricante(resultado.getNString("fabricante"));
            vb.setGarantia(resultado.getNString("garantia"));
            vb.setId(resultado.getInt("id"));
            vb.setMemoria(resultado.getInt("memoria"));
            vb.setNome(resultado.getString("nome"));
            vb.setProcessador(resultado.getString("processador"));
            vb.setTipo(resultado.getString("tipo"));
            vb.setTipomidia(resultado.getString("tipomidia"));
            vb.setValor(resultado.getDouble("valor"));
            videogame v = vb.constroi();
            lista.add(v);

        }
        con.close();
        return lista;

    }
         
    
    
}
