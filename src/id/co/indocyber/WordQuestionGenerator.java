/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public final class WordQuestionGenerator {

    public static List<WordModel> createQuestionInCollection() {

        List<WordModel> soalSoal = new ArrayList<>();
        try {

            Scanner scan;
            scan = new Scanner(new File("C:/JAVA_LATIHAN/SoalTebakGunung.txt"));

            while (scan.hasNextLine()) { //cek apakah masih ada baris
                String soalDanHint = scan.nextLine(); // ambil baris
                String[] data = soalDanHint.split(","); // pisahkan data dengan '.'
                String dataSoal = data[0];
                String dataHint = data[1].trim();
                WordModel WM = new WordModel(dataSoal, dataHint);
                soalSoal.add(WM);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordQuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soalSoal;
    }
}
