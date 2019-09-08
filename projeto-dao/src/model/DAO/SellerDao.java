package model.DAO;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deletebyId(Seller obj);
	Seller findById(Integer id);
	
	List<Seller> findALL();
	List<Seller> findByDepartment(Department department);
}