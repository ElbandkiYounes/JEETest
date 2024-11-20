package metier.commons.Util;

public class Either<L, R> {
    private final L left;
    private final R right;
    private final boolean isLeft;

    private Either(L left, R right, boolean isLeft) {
        this.left = left;
        this.right = right;
        this.isLeft = isLeft;
    }

    public static <L, R> Either<L, R> left(L value) {
        return new Either<>(value, null, true);
    }

    public static <L, R> Either<L, R> right(R value) {
        return new Either<>(null, value, false);
    }

    public boolean isLeft() {
        return isLeft;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }
}