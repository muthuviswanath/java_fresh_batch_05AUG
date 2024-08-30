package discussion.inheritance;

public class Photoshop {

	void openFile(SysFile file) {
		if (file instanceof JpegFile){
            file.behavior();
        }
        else if (file instanceof PngFile){
            file.behavior();
            
        }
	}
}


class SysFile{
	void behavior() {
		System.out.println("File behavior...");
	}	
}


class JpegFile extends SysFile {
	@Override
	void behavior() {
		System.out.println("Opened as a flat image");
	}
}

class PngFile extends SysFile {
	@Override
	void behavior() {
		System.out.println("Opened as a image with layers");
	}
}