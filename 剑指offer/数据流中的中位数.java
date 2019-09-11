import java.util.Comparator;
import java.util.PriorityQueue;
public class Solution {
    PriorityQueue<Integer> left = new PriorityQueue<Integer>(11, new Comparator<Integer>(){
        @Override
        public int compare(Integer a, Integer b){
            return b.compareTo(a);
        }
    });
    PriorityQueue<Integer> right = new PriorityQueue<Integer>();
    public void Insert(Integer num) {
        if (left.size() == 0 || num.compareTo(left.peek()) <= 0){
            left.offer(num);
            if (left.size() - right.size() == 2) right.offer(left.poll());
        }
        else{
            right.offer(num);
            if (left.size() < right.size()) left.offer(right.poll());
        }
    }

    public Double GetMedian() {
        if (left.size() == right.size()) return ((double)left.peek() + right.peek()) / 2;
        else return (double)left.peek();
    }


}