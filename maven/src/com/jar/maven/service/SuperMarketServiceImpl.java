package com.jar.maven.service;

import java.util.List;

import com.jar.maven.dto.SuperMarketDTO;
import com.jar.maven.repository.SuperMarketRepository;
import com.jar.maven.repository.SuperMarketRepositoryImpl;


public class SuperMarketServiceImpl implements SuperMarketService {

	SuperMarketRepository repository = new SuperMarketRepositoryImpl();
	
	@Override
	public boolean validateAndSave(SuperMarketDTO dto) {
		System.out.println("validating and saving the method");
		int id = dto.getId();
		String name = dto.getName();
		String company = dto.getCompany();
		String gstNo = dto.getGstNo();
		int pincode = dto.getPincode();
		String type = dto.getType();
		if(id>0) {
			System.out.println("id is valid");
			if(name!=null && name.length()>3 && name.length()<25) {
				System.out.println("name is valid");
				if(company!=null && company.length()>3 && company.length()<25) {
					System.out.println("company name is valid");
					if(gstNo!=null && gstNo.length() == 15) {
						System.out.println("gstno is valid");
						if (pincode>0) {
							System.out.println("pincode is valid");
							if(type!=null && type.length()>3 && type.length()<25) {
								System.out.println("type is valid");
								this.repository.save(dto);
							}else {
								System.err.println("type is invalid");
							}
						}else {
							System.err.println("pincode is invalid");
						}
					}else {
						System.err.println("gstno is invalid");
					}
				}else {
					System.err.println("company name is invalid");
				}
			}else {
				System.err.println("name is invalid");
			}
		}else {
			System.err.println("id is invalid");
		}
		
		return true;
	}

	@Override
	public void displayByName(String name) {
		System.out.println("display by name method is running");
		this.repository.displayByName(name);

	}

	@Override
	public boolean validateAndSave(List<SuperMarketDTO> list) {
		System.out.println("validating and saving the data by using list");
		this.repository.save(list);
		return true;
	}
	
	@Override
	public SuperMarketDTO findByName(String name) {
		
		return repository.findByName(name);
	}
	
	@Override
	public SuperMarketDTO findById(int id) {
		
		return repository.findById(id);
	}
	
	@Override
	public List<SuperMarketDTO> findAll() {
		
		return this.repository.findAll();
	}
	
	@Override
	public List<SuperMarketDTO> findByType(String type) {
		// TODO Auto-generated method stub
		return repository.findByType(type);
	}
	
	@Override
	public List<SuperMarketDTO> findByPincodeAndType(String type, int pincode) {
		// TODO Auto-generated method stub
		return repository.findByPincodeAndType(type, pincode);
	}
	
	@Override
	public int totalCount() {
		// TODO Auto-generated method stub
		return repository.totalCount();
	}
}
