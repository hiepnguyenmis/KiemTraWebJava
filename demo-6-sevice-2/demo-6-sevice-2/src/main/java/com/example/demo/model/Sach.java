package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="sach")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Sach {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsach")
	private long IdSach;
	
	@Column(name = "masach",nullable = false)
	private String MaSach;
	
	@Column(name = "tensach",length = 100,nullable = true)
	private String TenSach;
	
	@Column(name = "maloaisach",nullable = false)
	private long MaLoaiSach;
	
	@Column(name = "tacgia",length = 45,nullable = false)
	private String TacGia;
	
	@Column(name = "giabia",length = 10,nullable = false)
	private String GiaBia;

	public long getIdSach() {
		return IdSach;
	}

	public void setIdSach(long idSach) {
		IdSach = idSach;
	}

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public long getMaLoaiSach() {
		return MaLoaiSach;
	}

	public void setMaLoaiSach(long maLoaiSach) {
		MaLoaiSach = maLoaiSach;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public String getGiaBia() {
		return GiaBia;
	}

	public void setGiaBia(String giaBia) {
		GiaBia = giaBia;
	}

	public Sach(long idSach, String maSach, String tenSach, long maLoaiSach, String tacGia, String giaBia) {
		super();
		IdSach = idSach;
		MaSach = maSach;
		TenSach = tenSach;
		MaLoaiSach = maLoaiSach;
		TacGia = tacGia;
		GiaBia = giaBia;
	}

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
