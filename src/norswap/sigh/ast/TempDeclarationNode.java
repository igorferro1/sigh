package norswap.sigh.ast;

import norswap.autumn.positions.Span;
import norswap.utils.Util;
import java.util.List;

public class TempDeclarationNode extends DeclarationNode {
    public final String name;
    public final List<TempTypeNode> temp_types;
    // public final TypeNode returnType;
    // public final BlockNode block;

    @SuppressWarnings("unchecked")
    public TempDeclarationNode(Span span, Object temp_types, Object function) {
        super(span);
        this.temp_types = Util.cast(temp_types, List.class);
        this.name = Util.cast(function, GenericFunDeclarationNode.class).name();
        ;
    }

    @Override
    public String name() {
        return name; // TODO: Adjust this
    }

    @Override
    public String contents() {
        return "template " + name; // TODO: Adjust this
    }

    @Override
    public String declaredThing() {
        return "template";
    }
}
