package visitor;

public class VisitorTest {

    public static void main(String[] args) {
        new VisitorTest().run();
    }

    private void run() {
        final Tree<Integer> tree =
                new Node<>(
                        new Node<>(new Leaf<>(3), new Leaf<>(4)),
                        new Leaf<>(5));

        System.out.println(tree.accept(new SumVisitor()));
    }
}
