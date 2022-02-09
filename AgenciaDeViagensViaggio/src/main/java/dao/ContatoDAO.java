package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import models.Contato;

public class ContatoDAO {
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	public static boolean create(Contato contato) {
		String sql = "insert into Contato(nome, email, mensagem) values(?, ?, ?)";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getMensagem());
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

	public static Contato readById(int id) {
		String sql = "select * from contato where id_contato = ?";

		Contato c = new Contato();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				c.setId(rs.getInt("id_contato"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setMensagem(rs.getString("mensagem"));
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

		return c;
	}

	public static List<Contato> readAll() {
		String sql = "select * from contato";

		List<Contato> contatos = new ArrayList<>();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id_contato"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setMensagem(rs.getString("mensagem"));

				contatos.add(c);
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

		return contatos;
	}

	public static boolean update(Contato contato) {
		String sql = "UPDATE Contato SET nome = ?, email = ?, mensagem = ? WHERE id_contato = ?";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);


			ps.setInt(4, contato.getId());
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getMensagem());
			
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
		String sql = "delete from contato where id_contato = ?";

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
