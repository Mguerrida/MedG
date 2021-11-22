package com.ExpertTestBDD.quizz.stepDefinitions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFiles {
	

	

		public  static List<UserAccountDTO> readThemeData(String pathFile, int indexSheet) throws IOException
		{
			List<UserAccountDTO> listusers = new ArrayList<UserAccountDTO>();
		    FileInputStream inputStream = new FileInputStream(new File(pathFile));
		    Workbook workbook = new XSSFWorkbook(inputStream);
		    
		    Sheet firstSheet = workbook.getSheetAt(indexSheet);
		    
		     System.out.println("firstSheet"+" "+firstSheet.getSheetName());  
		    
		    Iterator<Row> iterator = firstSheet.iterator();
		 
		    while (iterator.hasNext()) {
		        Row nextRow = iterator.next();
		        Iterator<Cell> cellIterator = nextRow.cellIterator();
		        UserAccountDTO user = new UserAccountDTO();
		 
		        while (cellIterator.hasNext()) {
		            Cell nextCell = cellIterator.next();
		            int columnIndex = nextCell.getColumnIndex();
		 
		            switch (columnIndex) {
		            case 1:
		            	user.setusername(nextCell.getStringCellValue());
		                break;
		            case 2:
		            	user.setpassword(nextCell.getStringCellValue());
		                break;
		            case 3:
		            	user.setTabDevloppment(nextCell.getStringCellValue());
		                break;
		            case 4 :
		            	user.settabIstqb(nextCell.getStringCellValue());
		                break;
		                    
		                
		            }
		 
		 
		        }
		        listusers.add(user);
	
		    }
		 
		    workbook.close();
		    inputStream.close();
		 
		    return listusers;
		    
		
		 
		}


		
		
	}


		
		
	



