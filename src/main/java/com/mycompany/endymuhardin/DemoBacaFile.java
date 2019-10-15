/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.endymuhardin;

import com.mycompany.endymuhardin.helper.NasabahFileImporter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author okt19
 */
public class DemoBacaFile {
    public static void main(String[] args) {
        try {
            NasabahFileImporter ni = new NasabahFileImporter("src/main/resources/data-nasabah.txt");
            ni.proses();
        } catch (IOException ex) {
            Logger.getLogger(DemoBacaFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
