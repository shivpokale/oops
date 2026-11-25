package Interface;

public class CsvFileImpl implements FileOperation {

	@Override
	public void readFile() {
		System.out.println("csv file read");
	}

	@Override
	public void writeFile() {
		System.out.println("csv file write");
	}

	@Override
	public void deleteFile() {
		System.out.println("csv file deleted");
	}

}
