package composite_after;

public class Application {

	public static void main(String[] args) {
		
//		Drive cdrive = new Drive("C");
		
		CompositeDirecotryComponent mainDir = new CompositeDirecotryComponent("Main Directory");
		
		CompositeDirecotryComponent appdir = new CompositeDirecotryComponent("applications");
		CompositeDirecotryComponent datadir = new CompositeDirecotryComponent("my data");
		CompositeDirecotryComponent coursedir = new CompositeDirecotryComponent("cs525");
		
		File excelfile = new File("msexcel.exe", 2353256);
		File wordfile = new File("msword.exe", 3363858);
		File studentsfile = new File("students.doc", 34252);
		
		mainDir.add(appdir);
		mainDir.add(datadir);
		mainDir.add(coursedir);
		
//		cdrive.add(appdir);
//		cdrive.add(datadir);
		
		datadir.add(coursedir); 
		appdir.add(excelfile);
		appdir.add(wordfile); 
		
		coursedir.add(studentsfile);
		
		
		
		mainDir.print();
		
//		cdrive.print();
		
		
	} 
	
}
