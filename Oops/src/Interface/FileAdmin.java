package Interface;

public class FileAdmin {
	
	public static void main(String[] args) {
		
		FileOperation fileOperation;
		
		fileOperation = new TxtFileImpl();
		System.out.println("===TXT FILE===");
		fileOperation.readFile();
		fileOperation.writeFile();
		fileOperation.deleteFile();
		System.out.println();
		
		fileOperation = new CsvFileImpl();
		System.out.println("===CSV FILE===");
		fileOperation.readFile();
		fileOperation.writeFile();
		fileOperation.deleteFile();
		System.out.println( );
		
		fileOperation = new PDFfileImpl();
		System.out.println("===PDF FILE===");
		fileOperation.readFile();
		fileOperation.writeFile();
		fileOperation.deleteFile();
		
	}

}
