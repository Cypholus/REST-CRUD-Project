package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Model.AsMod;
import com.example.demo.Repository.AsRepo;

@org.springframework.stereotype.Service
public class AsSer {
	@Autowired
	AsRepo r;
	public AsMod saveinfo(AsMod m)
	{
		return r.save(m);
	}
	public List<AsMod> savedetails(List<AsMod> m)
	{
		return (List<AsMod>)r.saveAll(m);
	}
	public List<AsMod> showinfo()
	{
		return r.findAll();
	}
	public Optional<AsMod> showbyid(int Id)
	{
		return r.findById(Id);
	}
	public AsMod changeinfo(AsMod m)
	{
		return r.saveAndFlush(m);
	}
	public void deleteinfo(AsMod m)
	{
		r.delete(m);
	}
	public void deleteid(int Id)
	{
		r.deleteById(Id);
	}
}