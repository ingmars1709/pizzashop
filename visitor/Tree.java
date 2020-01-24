package visitor;

public interface Tree<A> {

    <T> T accept(Visitor<T,A> visitor);

}