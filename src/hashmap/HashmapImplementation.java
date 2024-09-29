package hashmap;
import java.util.*;
public class HashmapImplementation {
    public static class Hashmap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float LOAD_FACTOR= 0.75F;
        class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private LinkedList<Node> [] Buckets;
        private void initBucket(int N){
            Buckets = new LinkedList[N]; // array of N size linked list is formed
         for(int i=0; i<Buckets.length; i++){
              Buckets[i] = new LinkedList<>(); // linked list if formed in each array format
              }
        }
        //constructor for hashmap
        Hashmap(){
         initBucket(DEFAULT_CAPACITY);
        }

      public void remove(K key){

      }

      public void put(K key,V value){


      }
//      public V get(K key){
//
//       return value;
//      }
       public int size(){
            return 0;
       }



    }
    public static void main(String[] args) {

        Hashmap<Integer,Integer> t = new Hashmap<Integer,Integer>();
    }
}
