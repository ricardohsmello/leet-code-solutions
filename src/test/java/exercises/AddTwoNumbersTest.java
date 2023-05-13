package exercises;

import br.com.ricas.exercises.AddTwoNumbers;
import br.com.ricas.exercises.model.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {

        //l1 = [2,4,3], l2 = [5,6,4]

        AddTwoNumbers add = new AddTwoNumbers();
        ListNode listNodeL11 = new ListNode(3);
        ListNode listNodeL12 = new ListNode(4, listNodeL11);
        ListNode listNodeL13 = new ListNode(9, listNodeL12);


        ListNode listNodeL21 = new ListNode(4);
        ListNode listNodeL22 = new ListNode(6, listNodeL21);
        ListNode listNodeL23 = new ListNode(3, listNodeL22);
        add.addTwoNumbers(listNodeL13, listNodeL23);
    }

    @Test
    public void addTwoNumbers01() {
        AddTwoNumbers add = new AddTwoNumbers();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        add.addTwoNumbers(l1, l2);
    }

    @Test
    public void addTwoNumbers02() {



    }
}
