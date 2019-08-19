package com.example.demo.service;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoaiSach;
import com.example.demo.model.Sach;

public interface CategoryService extends JpaRepository<LoaiSach, Long> {
//	get Category
	public default List<LoaiSach> GetAllCategory(){
		return this.findAll();
	}
	
//	get 1 Category
	
	public default LoaiSach GetOneCategory(long id) {
		return this.getOne(id);
	}
//	add category
	public default boolean InsertCategory(LoaiSach loaiSach) {
		if(loaiSach!=null) {
			this.save(loaiSach);
			return true;
		}
		return false;
	}
//	delete
	public default boolean DeleteCategory(long id) {
		LoaiSach temp=this.getOne(id);
		if(temp!=null) {
			this.delete(temp);
			return true;
		}else {
			return false;
		}
	}
}
