public class Test {
    public static void main(String args[]){
        StackLinkedList<String> strs = new StackLinkedList<String>();
        StackLinkedList<Integer> ints = new StackLinkedList<Integer>();

        //Testing push,peek and pop on stack of strings
        strs.push("Test 1");
        strs.push("Test 2");
        System.out.println(strs.peek());
        strs.pop();
        System.out.println(strs.peek());
        strs.pop();

        //Testing push,peek and pop on stack of integers
        ints.push(12);
        ints.push(34);
        System.out.println(ints.peek());
        ints.pop();
        System.out.println(ints.peek());
        ints.pop();

        //Test to see if stack capacity limit is working properly
        for (int i = 0; i < 11; i++){
            ints.push(i);
        }

        //This will not compile as the ints stack will only accept integers as inputs
        //ints.push("Hello");
    }
}
