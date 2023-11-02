class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    Node<Integer> curr = head;
    int sum = 0;

    while (curr != null) {
      sum += curr.val;
      curr = curr.next;
    }
    // todo
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    Node<Integer> node = new Node<>(10);
    node.next = new Node<Integer>(5);
    node.next.next = new Node<Integer>(-5);
    node.next.next.next = new Node<Integer>(20);
    node.next.next.next.next = new Node<Integer>(-10);

    // 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(node));
  }
}
