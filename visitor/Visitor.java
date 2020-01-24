package visitor;

public interface Visitor<T, A> {

    T visitUnit(A a);
    T visitProd(Tree<A> t1, Tree<A> t2);

}