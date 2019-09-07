package model.DAO;

import java.util.List;

import model.entities.Departamentos;

public interface DepartamentosDAO {
	
	void insert(Departamentos obj);
	void update(Departamentos obj);
	void deletebyId(Departamentos obj);
	Departamentos findById(Integer id);
	
	List<Departamentos> findALL();
}