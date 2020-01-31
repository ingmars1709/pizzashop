package visitor;

public interface Visitor<T, A> {

    T visitLeaf(A a);
    T visitNode(Tree<A> t1, Tree<A> t2);

}