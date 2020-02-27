package com.api.ponto.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "client" )
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column
	private Integer id;
	
	//@Column
	@NotBlank
	private String company_name;
	
	//@Column
	@NotBlank
	private String fantasy_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getFantasy_name() {
		return fantasy_name;
	}

	public void setFantasy_name(String fantasy_name) {
		this.fantasy_name = fantasy_name;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", company_name=" + company_name + ", fantasy_name=" + fantasy_name + "]";
	}

}
