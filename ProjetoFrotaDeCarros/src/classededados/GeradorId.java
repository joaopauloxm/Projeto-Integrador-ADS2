package classededados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class GeradorId {
	private int idPlaca = 0;
	private int idMarca = 0;
        private int idModelo = 0;
	String arquivoIds = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\identificadores.txt";
	
	public GeradorId() throws Exception {
		FileWriter fileWIds = null;
		BufferedWriter bufferWIds = null;
		FileReader fileRIds = null;
		BufferedReader bufferRIds = null;
		try {
			if (!(new File(arquivoIds)).exists()) {
				fileWIds = new FileWriter(arquivoIds, true); 
				bufferWIds = new BufferedWriter(fileWIds);
				bufferWIds.write(idPlaca + ";" + idMarca + ";" + idModelo);
			}
			else {
				fileRIds = new FileReader(arquivoIds);
				bufferRIds = new BufferedReader(fileRIds);
				String strIds[] = bufferRIds.readLine().split(";");
				if (strIds.length != 3) throw new Exception("Dados incorretos.");
				idPlaca = Integer.parseInt(strIds[0]);
				idMarca = Integer.parseInt(strIds[1]);
                                idModelo = Integer.parseInt(strIds[2]);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (bufferWIds != null) bufferWIds.close();
			if (bufferRIds != null) bufferRIds.close();
		}
	}
	
	public int getIdPlaca() {
		return ++idPlaca;
	}

	public int getIdMarca() {
		return ++idMarca;
	}
	public int getIdModelo (){
                return ++ idModelo;
        }
	public void finalize() throws Exception {
		FileWriter fileWIds = null;
		BufferedWriter bufferWIds = null;
		try {
			fileWIds = new FileWriter(arquivoIds, false); 
			bufferWIds = new BufferedWriter(fileWIds);
			bufferWIds.write(idPlaca + ";" + idMarca + ";" + idModelo );
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (bufferWIds != null) bufferWIds.close();
			if (fileWIds != null) fileWIds.close();
		}
	}
}
