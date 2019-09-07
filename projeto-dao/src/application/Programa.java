package application;

import java.util.Date;

import model.DAO.FabricaDAO;
import model.DAO.VendedoresDAO;
import model.entities.Departamentos;
import model.entities.Vendedores;

public class Programa {

	public static void main(String[] args) {
		
		Departamentos obj = new Departamentos(1, "Books");
		System.out.println(obj);
		
		Vendedores vendedores = new Vendedores(21,"Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(vendedores);
		
		VendedoresDAO vendedoresDAO = FabricaDAO.criarVendedoresDAO();
	}
}