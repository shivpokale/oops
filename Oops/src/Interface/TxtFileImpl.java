package Interface;

public class TxtFileImpl implements FileOperation {

	@Override
	public void readFile() {
		System.out.println("txt file read");
		
	}

	@Override
	public void writeFile() {
		System.out.println("txt file write");
		
	}

	@Override
	public void deleteFile() {
		System.out.println("txt file deleted");	
	}

}
