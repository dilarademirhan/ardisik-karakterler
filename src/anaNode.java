/** 
 * @file anaNode
 * @description Ana dugumun ozellik ve fonksiyonlarini iceren sinif.
 * @assignment Odev1
 * @date 24.04.2020
 * @author dilara.demirhan@stu.fsm.edu.tr
 */ 
/**
 *
 * @author dilara
 * @param <T>
 */
public class anaNode<T> extends Node{
    Node<T> nextNode; 
    public anaNode(T data) {
       super(data);
    }
    
}