/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.util.List;

/**
 *
 * @author user
 */
public class TestSoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<WordModel> listSoal;
        listSoal = WordQuestionGenerator.createQuestionInCollection();
        for (WordModel wordModel : listSoal) {
            System.out.println("Soal + "+wordModel.getBasicWord()+" Hint: "+wordModel.getHint());
            
        }
    }
    
}
