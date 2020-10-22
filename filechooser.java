import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class filechooser {

	public static void main(String[] args) {

		JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = file.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = file.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}

	}

}
