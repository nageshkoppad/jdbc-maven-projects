package com.jar.maven.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jar.maven.dto.SuperMarketDTO;
import static com.jar.maven.enum1.MySqlAccount.*;

public class SuperMarketRepositoryImpl implements SuperMarketRepository {

	@Override
	public boolean save(SuperMarketDTO dto) {
		System.out.println("date is saved"+dto);
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(),USERNAME.getValues(),SECRET.getValues());
			String sql = "insert into collection.sales values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getCompany());
			prepareStatement.setString(4,dto.getGstNo());
			prepareStatement.setInt(5, dto.getPincode());
			prepareStatement.setString(6, dto.getType());
			int executeUpdate = prepareStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println(executeUpdate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void displayByName(String name) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(),USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales where name =?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, name);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while(executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				String gstNo = executeQuery.getString(4);
				int pincode = executeQuery.getInt(5);
				String type = executeQuery.getString(6);
				System.out.println(id+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean save(List<SuperMarketDTO> list) {
		System.out.println("method saved using list"+list);
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "insert into collection.sales values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			
			
			for (SuperMarketDTO superMarketDTO : list) {
				prepareStatement.setInt(1, superMarketDTO.getId());
				prepareStatement.setString(2, superMarketDTO.getName());
				prepareStatement.setString(3, superMarketDTO.getCompany());
				prepareStatement.setString(4,superMarketDTO.getGstNo());
				prepareStatement.setInt(5, superMarketDTO.getPincode());
				prepareStatement.setString(6, superMarketDTO.getType());
				int executeUpdate = prepareStatement.executeUpdate();
				if(executeUpdate>0) {
					System.out.println(executeUpdate);
				}
				
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public SuperMarketDTO findByName(String name) {
		
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales where name=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, name);
			ResultSet result = prepareStatement.executeQuery();
			SuperMarketDTO dto = new SuperMarketDTO();
			while(result.next()) {
				int id = result.getInt(1);
				String name1 = result.getString(2);
				String companyName = result.getString(3);
				String gstNo = result.getString(4);
				int pincode = result.getInt(5);
				String type = result.getString(6);
				
				
				
				dto.setId(id);
				dto.setName(name1);
				dto.setCompany(companyName);
				dto.setGstNo(gstNo);
				dto.setPincode(pincode);
				dto.setType(type);
//				System.out.println(dto);
				
				return dto;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public SuperMarketDTO findById(int id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			ResultSet result = prepareStatement.executeQuery();
			while(result.next()) {
				int id1 = result.getInt(1);
				String name = result.getString(2);
				String companyName = result.getString(3);
				String gstNo = result.getString(4);
				int pincode = result.getInt(5);
				String type = result.getString(6);
				
				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				dto.setName(name);
				dto.setCompany(companyName);
				dto.setGstNo(gstNo);
				dto.setPincode(pincode);
				dto.setType(type);
				return dto;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public List<SuperMarketDTO> findAll() {
		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet result = prepareStatement.executeQuery();
			while(result.next()) {
				int id1 = result.getInt(1);
				String name = result.getString(2);
				String companyName = result.getString(3);
				String gstNo = result.getString(4);
				int pincode = result.getInt(5);
				String type = result.getString(6);
				
				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				dto.setName(name);
				dto.setCompany(companyName);
				dto.setGstNo(gstNo);
				dto.setPincode(pincode);
				dto.setType(type);
				
				dtos.add(dto);
//				System.out.println(dto);
			}
			return dtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<SuperMarketDTO> findByType(String type) {
		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales where type=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, type);
			ResultSet result = prepareStatement.executeQuery();
			while(result.next()) {
				int id1 = result.getInt(1);
				String name = result.getString(2);
				String companyName = result.getString(3);
				String gstNo = result.getString(4);
				int pincode = result.getInt(5);
				String type1 = result.getString(6);
				
				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				dto.setName(name);
				dto.setCompany(companyName);
				dto.setGstNo(gstNo);
				dto.setPincode(pincode);
				dto.setType(type1);
				
				dtos.add(dto);
//				System.out.println(dto);
			}
			return dtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<SuperMarketDTO> findByPincodeAndType(String type, int pincode) {
		try {
			List<SuperMarketDTO> dtos = new ArrayList<SuperMarketDTO>();
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select * from collection.sales where type=? && pincode=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, type);
			prepareStatement.setInt(2, pincode);
			ResultSet result = prepareStatement.executeQuery();
			while(result.next()) {
				int id1 = result.getInt(1);
				String name = result.getString(2);
				String companyName = result.getString(3);
				String gstNo = result.getString(4);
				int pincode1 = result.getInt(5);
				String type1 = result.getString(6);
				
				SuperMarketDTO dto = new SuperMarketDTO();
				dto.setId(id1);
				dto.setName(name);
				dto.setCompany(companyName);
				dto.setGstNo(gstNo);
				dto.setPincode(pincode1);
				dto.setType(type1);
				
				dtos.add(dto);
//				System.out.println(dto);
			}
			return dtos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public int totalCount() {
		try {
			
			Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),SECRET.getValues());
			String sql = "select Count(*) from collection.sales ";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet result = prepareStatement.executeQuery();
			while (result.next()) {
				
				int count = result.getInt(1);
				System.out.println(count);
			}
			 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}

