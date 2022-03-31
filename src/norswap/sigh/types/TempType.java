package norswap.sigh.types;

import norswap.utils.NArrays;
import java.util.Arrays;

public final class TempType extends Type {
    public final Type[] passedTpsTypes;

    public TempType(Type... passedTpsTypes) {
        this.passedTpsTypes = passedTpsTypes;
    }

    @Override
    public String name() {
        String[] passedTps = NArrays.map(passedTpsTypes, new String[0], Type::name);
        return String.format("(%s)", String.join(",", passedTps));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof TempType))
            return false;
        TempType other = (TempType) o;

        return Arrays.equals(passedTpsTypes, other.passedTpsTypes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(passedTpsTypes);
    }
}
