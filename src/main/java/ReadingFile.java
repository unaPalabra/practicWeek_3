import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Don_Aleut\\IdeaProjects\\Project_mod_25\\src\\main\\resources\\universityInfo.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet studientSheet = workbook.getSheet("Студенты");
        XSSFRow row = studientSheet.getRow(0);


        String name = row.getCell(0).getStringCellValue();
        System.out.println("name : " + name);

        workbook.close();


    }
}
