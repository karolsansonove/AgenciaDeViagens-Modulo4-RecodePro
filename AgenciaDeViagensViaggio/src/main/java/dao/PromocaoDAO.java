package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import models.Promocao;

public class PromocaoDAO {
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	public static boolean create(Promocao promo) {
		
		String sql = "insert into Promocao(descricao, percentual_desconto) values(?, ?)";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			ps.setString(1, promo.getDescricao());
			ps.setDouble(2, promo.getPercentDesconto());
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
	
	public static Promocao readById(int id) {
		
		String sql = "select * from promocao where id_promocao = ?";
		Promocao p = new Promocao();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				p.setId(rs.getInt("id_promocao"));
				p.setDescricao(rs.getString("descricao"));
				p.setPercentDesconto(rs.getDouble("percentual_desconto"));
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

		return p;
		
	}
	
	public static List<Promocao> readAll() {
		String sql = "select * from promocao";
		List<Promocao> promocoes = new ArrayList<>();

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
				Promocao p = new Promocao();
				p.setId(rs.getInt("id_promocao"));
				p.setDescricao(rs.getString("descricao"));
				p.setPercentDesconto(rs.getDouble("percentual_desconto"));
				promocoes.add(p);
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

		return promocoes;
	}
	
	public static boolean update(Promocao promo) {
		
		String sql = "UPDATE Promocao SET descricao = ?, percentual_desconto = ? WHERE id_promocao = ?";

		try {
			conn = ConnectionFactory.createConnection();
			ps = conn.prepareStatement(sql);


			ps.setInt(3, promo.getId());
			ps.setString(1, promo.getDescricao());
			ps.setDouble(2, promo.getPercentDesconto());
			
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
		
		String sql = "delete from promocao where id_promocao = ?";

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
