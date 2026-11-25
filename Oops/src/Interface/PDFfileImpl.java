package Interface;

public class PDFfileImpl implements FileOperation{

	@Override
	public void readFile() {
		System.out.println("pdf file read");
	}

	@Override
	public void writeFile() {
		System.out.println("pdf file write");
		
	}

	@Override
	public void deleteFile() {
		System.out.println("pdf file deleted");
		
	}

}
