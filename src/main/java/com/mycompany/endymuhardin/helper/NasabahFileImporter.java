/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.endymuhardin.helper;

import com.mycompany.endymuhardin.Nasabah;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author okt19
 */
public class NasabahFileImporter {
    private File fileInput;
    private BufferedReader fileReader;
    
    public NasabahFileImporter(String namaFile) {
        this.fileInput = new File(namaFile);
    }
    
    private void bukaFile() throws FileNotFoundException {
        if (!fileInput.exists()) {
            throw new FileNotFoundException("File tidak ada.");
        }
        
        fileReader = new BufferedReader(new FileReader(fileInput));
    }
    
    private void tutupFile() throws IOException {
        if (fileReader != null) {
            fileReader.close();
        }
    }
    
    public List<Nasabah> proses() throws IOException {
        bukaFile();
        
        String data = fileReader.readLine();
        System.out.println("Header : " + data);
        
        while(data != null) {
            data = fileReader.readLine();
            System.out.println("Data : " + data);
        }
        tutupFile();
        return null;
    }
}
