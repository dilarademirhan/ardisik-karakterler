/** 
 * @file Node
 * @description Dugumlerin extend edildigi sinif. Butun dugumlere ait olan ozellik ve fonksiyonlar var.
 * @assignment Odev1
 * @date 24.04.2020
 * @author dilara.demirhan@stu.fsm.edu.tr
 */ 
/**
 *
 * @author dilara
 * @param <T>
 */
public class Node<T> {

    T data;
    ListeNode<T> altNode;

    public Node(T data) {
        this.data = data;
    }
  
}