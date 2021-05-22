/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Danya
 */
public class StrF {
    
    public static String lab4equation(String text){
        
        text = text.replaceAll("[,.():;!?]", "");// удаление символов из текста
        text = text.toLowerCase();//большие буквы становятся маленькими                
        return (String)text;
    }
    
    public static String lab4equation1(String text){
        int NumOfWords = 0;
        
    if (text.length() != 0) {
            NumOfWords++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    NumOfWords++;
                }
            }
        }
        String res = Integer.toString(NumOfWords);
        
        
        return (String) res;
    
    }
    
    public static String lab4equation2(String text){
        int unique = 0; //количество уникальных слов
        List<String> list = Arrays.asList(text.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) { //если слово единственное в списке слов , счетчик уникальных слов увеличивается на 1
            if (Collections.frequency(list, word) == 1)
                unique++;
        }
        String res = Integer.toString(unique);
        return (String) res;
            
    }
    
     public static String lab4equation3(String text){
         
         List<String> list = Arrays.asList(text.split(" "));
         Set<String> uniqueWords = new HashSet<>(list);
         
         
         int PopularWord = 0;//количество повторений самого популярного слова
        int PopularWorld1 = 0; //количество повторений одного из самых популярных слов
        String[] MostPopularWords = new String[7];//список самых популярных слов и их количество
         for (int i = 0; i < 4; i++){ //составление списка самых популярных слов в массив
            for (String word : uniqueWords) {
                if (i == 0 || PopularWorld1 > Collections.frequency(list, word)) {
                    if (PopularWord == 0)
                        PopularWord = Collections.frequency(list, word);

                    //System.out.println(Collections.frequency(list, word));

                    if (Collections.frequency(list, word) > PopularWord) {
                        PopularWord = Collections.frequency(list, word);
                        MostPopularWords[i] = word + " - " + PopularWord;
                        PopularWorld1 = PopularWord;
                    }

                }

            }
                PopularWord = 0;
        }
         
         String res = MostPopularWords[0];
         return(String)res;
     }
     
      public static String lab4equation4(String text){
          String[] WordsWI = text.split(" ");
          int Words4Symbols = 0;//колво слов с 4 символами
        String[] words4smb = text.split(" ");

        for (int i = 0; i < words4smb.length; i++) {
            if (words4smb[i].toString().length() == 4)
                Words4Symbols++;
        }
        
        String res = Integer.toString(Words4Symbols);
        return(String)res;
      }
     
     
}

