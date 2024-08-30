package discussion.inheritance;

public class Windows {
	public static void main(String[] args) {
		Photoshop p = new Photoshop();
		PngFile png = new PngFile();
		JpegFile jpeg = new JpegFile();
		p.openFile(jpeg);
		p.openFile(png);
	}
}
