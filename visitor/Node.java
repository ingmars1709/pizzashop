package visitor;

public class Node<A> implements Tree<A> {

    private final Tree<A> t2;
    private final Tree<A> t1;

    public Node(final Tree<A> t1, final Tree<A> t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public <T> T accept(final Visitor<T,A> visitor) {
        return visitor.visitProd(t1, t2);
    }
}
