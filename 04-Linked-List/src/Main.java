public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
           // 输出对象时一般会自动调用toString()方法把对象转换为字符串
            System.out.println(linkedList.toString());
        }

        // linkedList.set(2, 666);
        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
