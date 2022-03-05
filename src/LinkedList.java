/** 
 * @file LinkedList
 * @description LinkedList fonksiyonlarini tutan sinif.
 * @assignment Odev1
 * @date 24.04.2020
 * @author dilara.demirhan@stu.fsm.edu.tr
/**
 *
 * @author dilara
 * @param <T>
 */
public class LinkedList<T> {

    private anaNode<T> head;

    Node addLast(anaNode<T> newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            anaNode temp = head;

            while (temp.nextNode != null) {
                temp = (anaNode) temp.nextNode;
            }

            temp.nextNode = newNode;
        }
        return newNode;
    }

    Node addLast(T newData) {
        anaNode newNode = (anaNode) addLast(new anaNode<>(newData));
        return newNode;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean varMi(T data) {
        anaNode temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = (anaNode) temp.nextNode;
        }
        return false;
    }

    void ardisikKarakterler(char k) {

        anaNode temp = head; 
        while (temp != null && !temp.data.equals(k)) {
            temp = (anaNode) temp.nextNode;
        }
        if (temp == null) { 
            System.out.println("Boyle bir karakter yok.");
        } else {
            System.out.print(k + " karakterinden sonra gelen karakterler: ");
            ListeNode temp2 = temp.altNode;
            while (temp2 != null) {
                System.out.print(temp2.data.toString().charAt(0) + " (" + temp2.sayi + " kez) ");
                temp2 = temp2.altNode;
            }
            System.out.println("");
        }

    }

    void enCokArdisik(char k) {
        anaNode temp = head;
        while (temp != null && !temp.data.equals(k)) {
            temp = (anaNode) temp.nextNode;
        }
        if (temp == null) { // k yoksa
            System.out.println("Boyle bir karakter yok.");
        } else {

            int enCokSayi = 0; 
            char encok = 0; 
            ListeNode temp2 = temp.altNode;
            while (temp2 != null) {
                if (temp2.sayi > enCokSayi) {
                    enCokSayi = temp2.sayi;
                    encok = temp2.data.toString().charAt(0);
                }
                temp2 = temp2.altNode;
            }
            if (enCokSayi == 0) {
                System.out.println(k + " karakterinden sonra hiçbir karakter gelmiyor.");
            } else {
                System.out.println(k + " karakterinden sonra en cok gelen karakter: " + encok + " (" + enCokSayi + " kere.)");
            }

        }
    }

    void enAzArdisik(char k) {
        anaNode temp = head;
        while (temp != null && !temp.data.equals(k)) {
            temp = (anaNode) temp.nextNode;
        }
        if (temp == null) {   
            System.out.println("Boyle bir karakter yok.");
        } else { 

            int enAzSayi = 2147483647;  
            char enaz = 0;  

            ListeNode temp2 = temp.altNode;
            while (temp2 != null) {
                if (temp2.sayi <= enAzSayi) {
                    enAzSayi = temp2.sayi;
                    enaz = temp2.data.toString().charAt(0);
                }
                temp2 = temp2.altNode;
            }
            if (enAzSayi == 0) {
                System.out.println(k + " karakterinden sonra hiçbir karakter gelmiyor.");
            } else {
                System.out.println(k + " karakterinden sonra en az gelen karakter: " + enaz + " (" + enAzSayi + " kere.)");
            }
        }
    }

    void enCokArdisik() {
        if (!isEmpty()) {
            int encok = 1;   
            Node enCokHead = null;   
            ListeNode enCok = null;    
            anaNode temp = head;
            while (temp != null && temp.altNode != null) {
                ListeNode temp2 = temp.altNode;
                while (temp2 != null) {
                    if (temp2.sayi >= encok) {
                        encok = temp2.sayi;
                        enCok = temp2;
                        enCokHead = temp;
                    }
                    temp2 = temp2.altNode;
                }

                temp = (anaNode) temp.nextNode;
            }
            if (enCokHead != null && enCok != null) {
                System.out.println("En cok tekrar eden karater cifti: " + enCokHead.data + " " + enCok.data.toString().charAt(0) + " (" + encok + " kere.)");
            }
        }
    }

    void enAzArdisik() {
        if (!isEmpty()) {
            int enaz = 1;              
            Node enAzHead = null;     
            ListeNode enAz = null;   
            anaNode temp = head;
            while (temp != null && temp.altNode != null) {
                ListeNode temp2 = temp.altNode;
                while (temp2 != null) {
                    if (temp2.sayi <= enaz) {
                        enaz = temp2.sayi;
                        enAz = temp2;
                        enAzHead = temp;
                    }
                    temp2 = temp2.altNode;
                }

                temp = (anaNode) temp.nextNode;
            }
            System.out.println("En az tekrar eden karater cifti: " + enAzHead.data + " " + enAz.data.toString().charAt(0) + " (" + enaz + " kere.)");
        }
    }

    void print() {
        anaNode<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = (anaNode<T>) temp.nextNode;
        }

        System.out.println("null");
    }

    int size() {
        anaNode<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = (anaNode<T>) temp.nextNode;
        }
        return count;
    }

    Node NodeBul(int index) {
        anaNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = (anaNode<T>) temp.nextNode;
        }
        return temp;
    }


    void printDiger() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(i + ". Liste: ");
            Node temp = this.NodeBul(i);
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.altNode;
            }
            System.out.println("");
        }
    }
}
