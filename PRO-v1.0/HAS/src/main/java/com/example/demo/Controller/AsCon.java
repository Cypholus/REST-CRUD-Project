package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AsMod;
import com.example.demo.Service.AsSer;

@RestController
public class AsCon {
	@Autowired
	AsSer s;
	@PostMapping("addDetails")
	public AsMod add(@RequestBody AsMod m)
	{
		return s.saveinfo(m);
	}
	@GetMapping("showDetails")
	public List<AsMod> show()
	{
		return s.showinfo();
	}
	@GetMapping("showbyid/{Id}")
	public Optional<AsMod> showid(@PathVariable int Id)
	{
		return s.showbyid(Id);
	}
	@PostMapping("addList")
	public List<AsMod> addnDetails(@RequestBody List <AsMod> m)
	{
		return s.savedetails(m);
	}
	@PutMapping("update")
	public AsMod modify(@RequestBody AsMod m)
	{
		return s.changeinfo(m);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody AsMod m)
	{
		s.deleteinfo(m);
		return "Deleted successfully";
	}
	@DeleteMapping("deletebyid/{id}")
	public String delid (@PathVariable int Id)
	{
		s.deleteid(Id);
		return "Deleted Successfully";
	}
}