package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import models.Destino;

public class DestinoDAO {
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	public static boolean create(Destino destino) {
		String sql = "insert into Destino(uf, cidade, preco, url_imagem) values(?, ?, ?, ?)";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			ps.setString(1, destino.getUF());
			ps.setString(2, destino.getCidade());
			ps.setString(3, destino.getPreco());
			ps.setString(4, destino.getUrlImagem());
			ps.execute();

			return true;

		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
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

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public static Destino readById(int id) {
		String sql = "select * from destino where id_destino = ?";

		Destino d = new Destino();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				d.setId(rs.getInt("id_destino"));
				d.setCidade(rs.getString("cidade"));
				d.setUF(rs.getString("uf"));
				d.setPreco(rs.getString("preco"));
				d.setUrlImagem(rs.getString("url_imagem"));
			}

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

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return d;
	}

	public static List<Destino> readAll() {
		String sql = "select * from destino";

		List<Destino> destinos = new ArrayList<>();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Destino d = new Destino();
				d.setId(rs.getInt("id_destino"));
				d.setCidade(rs.getString("cidade"));
				d.setUF(rs.getString("uf"));
				d.setPreco(rs.getString("preco"));
				d.setUrlImagem(rs.getString("url_imagem"));

				destinos.add(d);
			}

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

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return destinos;
	}

	public static boolean update(Destino destino) {
		String sql = "UPDATE Destino SET cidade = ?, uf = ?, preco = ?, url_imagem = ? WHERE id_destino = ?";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);


			ps.setInt(5, destino.getId());
			ps.setString(1, destino.getCidade());
			ps.setString(2, destino.getUF());
			ps.setString(3, destino.getPreco());
			ps.setString(4, destino.getUrlImagem());
			
			ps.executeUpdate();
			return true;

		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
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

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean delete(int id) {
		String sql = "delete from destino where id_destino = ?";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			return true;

		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
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

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
