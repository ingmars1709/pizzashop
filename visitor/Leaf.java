package visitor;

public class Leaf<A> implements Tree<A>{

    private final A value;

    public Leaf(final A i) {
        this.value = i;
    }

    @Override
    public <T> T accept(final Visitor<T,A> visitor) {
        return visitor.visitLeaf(value);
    }
}
