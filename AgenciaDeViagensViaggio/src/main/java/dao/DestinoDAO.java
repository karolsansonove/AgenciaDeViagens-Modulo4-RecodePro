package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import models.Destino;

public class DestinoDAO {
	
	public void create(Destino destino) {
		String sql = "insert into Destino(uf, cidade, preco, url_imagem) values(?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, destino.getEstado());
			ps.setString(2, destino.getCidade());
			ps.setDouble(3, destino.getPreco());
			ps.setString(4, destino.getUrlImagem());
			
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                
            } catch(Exception e) {
                e.printStackTrace();
            }
		}
	}
	
	public void read() {
		
	}

	public void update() {
	
	}

	public void delete() {
		
	}
}
