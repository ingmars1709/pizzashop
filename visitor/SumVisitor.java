package visitor;

public class SumVisitor implements Visitor<Integer, Integer> {


    @Override
    public Integer visitLeaf(final Integer value) {
        return value;
    }

    @Override
    public Integer visitNode(final Tree<Integer> t1, final Tree<Integer> t2) {
        return t1.accept(this) + t2.accept(this);
    }
}