package com.jar.maven;

import java.util.ArrayList;
import java.util.List;

import com.jar.maven.dto.SuperMarketDTO;
import com.jar.maven.service.SuperMarketService;
import com.jar.maven.service.SuperMarketServiceImpl;

public class Runner {

	public static void main(String[] args) {
		SuperMarketDTO dto1 = new SuperMarketDTO(1, "Big bazar", "big bazar", "22AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto2 = new SuperMarketDTO(2, "Smart bazar", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto3 = new SuperMarketDTO(3, "D mart", "D company", "22AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto4 = new SuperMarketDTO(4, "hyper market", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto5 = new SuperMarketDTO(5, "super market", "big bazar", "22AAAAA0000A1Z5", 580021, "groceries");
		SuperMarketDTO dto6 = new SuperMarketDTO(6, "reliance", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto7 = new SuperMarketDTO(7, "more", "D company", "22AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto8 = new SuperMarketDTO(8, "vishal mart", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto9 = new SuperMarketDTO(9, "reliance", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");
		SuperMarketDTO dto10 = new SuperMarketDTO(10, "more", "D company", "22AAAAA0000A1Z7", 580023,"clothing and groceries");
		SuperMarketDTO dto11 = new SuperMarketDTO(11, "vishal mart", "reliance", "22AAAAA0000A1Z6", 580022, "clothing");

		List<SuperMarketDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto11);
		
		SuperMarketService service = new SuperMarketServiceImpl();
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.validateAndSave(dto4);
		service.validateAndSave(dto5);
		service.validateAndSave(dto6);
		service.validateAndSave(dto7);
		service.validateAndSave(dto8);
		service.validateAndSave(dto9);
		service.validateAndSave(dto10);
		service.validateAndSave(dto11);
		service.displayByName("D mart");
		
		
//		Iterator<SuperMarketDTO> list = collection.iterator();
//		while (list.hasNext()) {
//			SuperMarketDTO superMarketDTO = (SuperMarketDTO) list.next();
//			System.out.println(superMarketDTO);
//			SuperMarketService service = new SuperMarketServiceImpl();
//
//			service.validateAndSave(superMarketDTO);
//
//		}
		
//		for (SuperMarketDTO superMarketDTO : collection) {
//			System.out.println(superMarketDTO);
//			service.validateAndSave(superMarketDTO);
//		}
		
		
//		collection.forEach(ref->System.out.println(service.validateAndSave(ref)));
		
		SuperMarketDTO findByName = service.findByName("reliance");
		System.out.println(findByName);
		
		
		System.out.println("======================");
		
		SuperMarketDTO findById = service.findById(1);
		System.out.println(findById);
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findAll = service.findAll();
		findAll.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findByType = service.findByType("groceries");
		findByType.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		List<SuperMarketDTO> findByPincodeAndType = service.findByPincodeAndType("clothing",580022);
		findByPincodeAndType.forEach(ref->System.out.println(ref));
		
		System.out.println("======================");
		
		service.totalCount();
		
		
		
		
		
		
		
	
		
		 
		
		
		
		

	}

}
