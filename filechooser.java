import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class filechooser {

    private void jButton1ActionPerformed(java.awt.event.ActionEvent) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(filechooser);

        try {
            String ruta = filechooser.getSelectedFile().getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader (ruta));
            String line;
            String texto = "";
            line.br.readline();
            while (line != null){
                texto += line;
                line = br.readline();
            }

            //JAVA FX EXAMPLE TEST ONE
            JFrame ventana = new JFrame("Heloo JAVA");
            JTextField texto = new JTextField(10); 
            ventana.setLayout(new FlowLayout());
            ventana.setSize(450, 400);
            ventana.setVisible(true);
            ventana.add(texto);
            texto.setText(texto),
		
		/* JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = file.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = file.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}


		*/
        } catch (Exception e) {
            //TODO: handle exception
        }  
    }

    public static void main(String[] args) {
        jButton1ActionPerformed ba = new jButton1ActionPerformed();
    }

}
