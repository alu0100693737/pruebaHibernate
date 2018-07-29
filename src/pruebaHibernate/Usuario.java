package pruebaHibernate;

/**
 * Clase Usuario
 * Guarda la información de cada usuario
 * Prueba de uso de Hibernate
 * @author Ivan Garcia Campos   alu0100693737@ull.edu.es
 * @version 1.0, 29/07/2018
 */
public class Usuario {
	
	private Integer id;
	private String fullname;
	private String email;
	private String password;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
		
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
