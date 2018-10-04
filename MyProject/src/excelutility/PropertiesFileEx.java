package excelutility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileEx {
	//public static void getproperty() throws Exception {
		
	
public static void main(String[] args) throws Exception {
	Properties p=new Properties();
	InputStream input=new FileInputStream("E:\\input.properties");
	p.load(input);
	System.out.println(p.getProperty("browser"));
	/*PropertiesFileEx pe= new PropertiesFileEx();
	pe.getproperty();
	getproperty();*/
}
}
