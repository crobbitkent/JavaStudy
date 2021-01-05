package org.word.domain;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class ExcelReader {
	private int lastRowNum;
	Sheet sheet;
	// ���� ���
	@NonNull
	private String fileName;
	
	
	public void init() {
		String version = "xlsx";

		Workbook workbook = getWorkbook("C:\\testDB\\QuizList.xlsx", version);

		sheet = workbook.getSheetAt(0);
		
		lastRowNum = sheet.getLastRowNum();
	}

	private Workbook getWorkbook(String filename, String version) {

		try (FileInputStream stream = new FileInputStream(filename)) {
			// ǥ�� xls ����
			if ("xls".equals(version)) {
				return new HSSFWorkbook(stream);
				// Ȯ�� xlsx ����
			} else if ("xlsx".equals(version)) {
				return new XSSFWorkbook(stream);
			}
			throw new NoClassDefFoundError();
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}

	}

	public Cell getCell(int rownum, int cellnum) {
		Row row = getRow(sheet, rownum);
		
		return getCell(row, cellnum);
	}
	
	// Row�� ���� Cell�� ��ȯ, �����ϱ�
	private Cell getCell(Row row, int cellnum) {
		Cell cell = row.getCell(cellnum);

		return cell;
	}

	// Sheet�� ���� Row�� ��ȯ, �����ϱ�
	private Row getRow(Sheet sheet, int rownum) {
		Row row = sheet.getRow(rownum);

		return row;
	}

}
