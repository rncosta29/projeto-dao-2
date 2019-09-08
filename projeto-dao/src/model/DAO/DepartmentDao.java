package model.DAO;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deletebyId(Department obj);
	Department findById(Integer id);
	
	List<Department> findALL();
}