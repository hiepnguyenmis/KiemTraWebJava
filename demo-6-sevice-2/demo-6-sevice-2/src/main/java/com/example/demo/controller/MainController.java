/*URL:
 * Get All Books : /api/getAllBooks
 * Get 1 Book: /api/getOneBook/1
 * Insert Book:/api/createBook
 * Update Book:/api/upadateBook/1
 * Delete Book:/api/deleteBook/1
 * ***
 * Get All Category : /api/getAllCategories
 * Get 1 Category: /api/getOneCategory/1
 * Insert Category:/api/createCategory
 * Delete Category:/api/deleteCategory/1
 * 
 * 
 * */


package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoaiSach;
import com.example.demo.model.Sach;
import com.example.demo.model.User;
import com.example.demo.service.BookService;
import com.example.demo.service.CategoryService;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	LoginService reponsitoryLogin;
	@Autowired
	BookService reponsitoryBook;
	@Autowired
	CategoryService repositoryCategory;
	
//	Create user
	@RequestMapping(value = "/createUser",  method=RequestMethod.POST, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public boolean Insert_User(User users) {
		try {
			return reponsitoryLogin.InsertUser(users);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}
//	Update
	@RequestMapping(value="/upadateUser", method=RequestMethod.POST, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public boolean Update_User(@Valid  User user) {
		try {
			return reponsitoryLogin.UpdateUser(user);
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
// Delete
	@RequestMapping(value="/deteteUser/{id}",method=RequestMethod.POST)
	@ResponseBody
	public boolean Delete_User(@PathVariable("id") long id) {
		try {
			return reponsitoryLogin.DeleteUser(id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
//getUser api/getUsers
	@RequestMapping(value = "/getUsers",produces = {
			
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<User> Get_All_Users() {
		return reponsitoryLogin.GetAllUsers();
	}

//getOneUser api/getOneUsers/1
	@RequestMapping(value = "/getUsers/{id}",produces = {
			
			MediaType.APPLICATION_JSON_VALUE } )
	@ResponseBody
	public User Get_One_User(@PathVariable("id") int id) {
		return reponsitoryLogin.GetOnetUser(id);
	}
//	get All Books
	@RequestMapping(value="/getAllBooks",produces = {
			MediaType.APPLICATION_JSON_VALUE
	})
	@ResponseBody
	public List<Sach> GetBooks() {
		return reponsitoryBook.GetAllBooks();
	}
	
//	get One Books
	@RequestMapping(value="/getOneBook/{id}",produces = {
			MediaType.APPLICATION_JSON_VALUE
	})
	@ResponseBody
	public Sach GetOneBook(@PathVariable("id") int id) {
		return reponsitoryBook.GetOneBook(id);
	}
	
//	Insert Book
	@RequestMapping(value = "/createBook",  method=RequestMethod.POST, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public boolean Insert_Book(Sach sach) {
		try {
			return reponsitoryBook.InsertBook(sach);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}
	
//	upadate Book
	
	@RequestMapping(value="/upadateBook", method=RequestMethod.POST, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public boolean Update_Book(@Valid  Sach sach) {
		try {
			return reponsitoryBook.UpadateBook(sach);
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
//	Delete
	
	@RequestMapping(value="/deleteBook/{id}",method=RequestMethod.POST)
	@ResponseBody
	public boolean Delete_Books(@PathVariable("id") long id) {
		try {
			return reponsitoryBook.DeleteBook(id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
/**===================================================================**/
//	get All Categories
	@RequestMapping(value="/getAllCategories",produces = {
			MediaType.APPLICATION_JSON_VALUE
	})
	@ResponseBody
	public List<LoaiSach> GetCategories() {
		return repositoryCategory.GetAllCategory();
	}
	//get One Books
	@RequestMapping(value="/getOneCategory/{id}",produces = {
			MediaType.APPLICATION_JSON_VALUE
	})
	@ResponseBody
	public LoaiSach GetOneCategory(@PathVariable("id") long id) {
		return repositoryCategory.getOne(id);
	}
	
//	Insert Category
	@RequestMapping(value = "/createCategory",  method=RequestMethod.POST, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseBody
	public boolean Insert_Category(LoaiSach loaiSach) {
		try {
			return repositoryCategory.InsertCategory(loaiSach);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}
//	delete
	@RequestMapping(value="/deleteCategory/{id}",method=RequestMethod.POST)
	@ResponseBody
	public boolean Delete_Category(@PathVariable("id") long id) {
		try {
			return repositoryCategory.DeleteCategory(id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
}
