
import java.io.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        //String fileName = "/sys/class/thermal/thermal_zone0/temp";
		       // String line = null;
				/*

		           FileReader filename = new FileReader("C:/Users/Noémie/Desktop/Note");
		        
		        catch(FileNotFoundException e)
		        {
		        	//if the file it doesn't exist
		        }
		        */
		        
		        FileReader filereader = null;
		        BufferedReader bufferedreader = null;
		        try {
		            filereader = new FileReader("C:\\Users\\Noémie\\Documents\\ING3\\Semestre 1\\Projet_2\\Fichier.txt");
		            bufferedreader = new BufferedReader(filereader);
		            String strCurrentLine;
		            while ((strCurrentLine = bufferedreader.readLine()) != null) {
		              System.out.println(strCurrentLine);
		            }
		          } 
		        catch (IOException e) 
		        {
		            e.printStackTrace();
		        } 
		        finally {
		            try {
		              if (bufferedreader != null)
		                bufferedreader.close();
		              if (filereader != null)
		                filereader.close();
		            } 
		            catch (IOException e) 
		            {
		              e.printStackTrace();
		            }
		          }
		        

		        
		        
	}

}
