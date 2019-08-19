package com.example.demo.service;
import java.awt.print.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Sach;

public interface BookService extends JpaRepository<Sach, Long> {
//	get Book
	public default List<Sach> GetAllBooks(){
		return this.findAll();
	}
	
//	get 1 Book
	
	public default Sach GetOneBook(long id) {
		return this.getOne(id);
	}
//	add book
	
	public default boolean InsertBook(Sach sach) {
		if(sach!=null) {
			this.save(sach);
			return true;
		}
		return false;
	}
//	update
	
	public default boolean UpadateBook(Sach sach) {
		Sach temp=this.getOne(sach.getIdSach());
		if(temp!=null) {
			this.save(temp);
			return true;
		}
		return false;
	}
//	delete
	public default boolean DeleteBook(long id) {
		Sach temp=this.getOne(id);
		if(temp!=null) {
			this.delete(temp);
			return true;
		}else {
			return false;
		}
		
	}
}
