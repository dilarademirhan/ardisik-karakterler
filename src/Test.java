/** 
 * @file Test
 * @assignment Odev1
 * @date 
 * @author dilara.demirhan@stu.fsm.edu.tr
 */ 


import java.io.FileReader;
import java.util.Scanner;

public class Test<T> {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Dosya: "); //C:\\Users\\dilar\\Desktop\\veri.txt
        String f = s.nextLine();

        //File f = new File("C:\\Users\\dilar\\Desktop\\veri.txt");
        LinkedList anaListe = new LinkedList();

        try {
            FileReader fr = new FileReader(f);
            int i = fr.read();
            char temp3 = '.';
            while (i != -1) {  
                char c = (char) i;
                c = Character.toLowerCase(c);
                if (Character.isAlphabetic(c) && !anaListe.varMi(c)) {
                    anaListe.addLast(c);
                }
                anaNode temp2 = (anaNode) anaListe.NodeBul(0);         
                while (temp2 != null) {
                    Node temp4 = temp2;  
                    int z = 0;  
                    if (temp2.data.equals(temp3)) {
                        while (temp4.altNode != null) {
                            String str = temp4.altNode.data.toString(); 
                            if (str.charAt(0) == c && Character.isAlphabetic(c)) {  
                                temp4.altNode.sayi++; 
                                temp4.altNode.data = c + ", " + temp4.altNode.sayi; 
                                z = 1; 
                            }
                            temp4 = temp4.altNode;
                        }
                        if (z == 0 && Character.isAlphabetic(c)) {  
                            temp4.altNode = new ListeNode(c + ", " + 1); 
                        }
                    }
                    temp2 = (anaNode) temp2.nextNode;
                }
                temp3 = c;

                i = fr.read();
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        anaListe.print();
        anaListe.printDiger();
        anaListe.ardisikKarakterler('v');
        anaListe.ardisikKarakterler('r');
        anaListe.enAzArdisik('t');
        anaListe.enCokArdisik('a');
        anaListe.enAzArdisik('n');
        anaListe.enCokArdisik();
        anaListe.enCokArdisik('g');
        anaListe.enAzArdisik();

    }

}
