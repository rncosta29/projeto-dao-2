package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Vendedores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	private Date dataAniversario;
	private Double salario;
	
	private Departamentos departamentos;
	
	public Vendedores(){		
	}

	public Vendedores(Integer id, String nome, String email, Date dataAniversario, Double salario,
			Departamentos departamentos) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.departamentos = departamentos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedores other = (Vendedores) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vendedores [id=" + id + ", nome=" + nome + ", email=" + email + ", dataAniversario=" + dataAniversario
				+ ", salario=" + salario + ", departamentos=" + departamentos + "]";
	}
}
