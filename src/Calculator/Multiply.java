public abstract interface Multiply extends Calc{
    Multiply (String ply) {
        this.ply = ply;
}

    @Override
    default String ply() {
        return null;
    }
