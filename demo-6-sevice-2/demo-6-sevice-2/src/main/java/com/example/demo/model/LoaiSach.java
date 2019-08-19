package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="loaisach")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LoaiSach {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtheloaisach")
	private long IdTheLoaiSach;
	
	@Column(name = "loaisach",length = 100,nullable = true)
	private String LoaiSach;

	public long getIdTheLoaiSach() {
		return IdTheLoaiSach;
	}

	public void setIdTheLoaiSach(long idtheloaisach) {
		this.IdTheLoaiSach = idtheloaisach;
	}

	public String getLoaiSach() {
		return LoaiSach;
	}

	public void setLoaiSach(String loaisach) {
		this.LoaiSach = loaisach;
	}

	public LoaiSach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoaiSach(long idtheloaisach, String loaisach) {
		super();
		IdTheLoaiSach = idtheloaisach;
		LoaiSach = loaisach;
	}
	
	
}
