package model.DAO;

import model.DAO.impl.VendedoresDAOjdbc;

public class FabricaDAO {
	
	public static VendedoresDAO criarVendedoresDAO() {
		
		return new VendedoresDAOjdbc();
	}
}
