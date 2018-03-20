package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Entity
public class ArmeModel implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (length=40, name="modelArme")
	private String model;
	@Column (length=40)
	private String type;
	
	
	
	public ArmeModel(String model, String type) {
		super();
		this.model = model;
		this.type = type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}
