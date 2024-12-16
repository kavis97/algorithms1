package pers.siva.algorithms;

public class ListModule {

    public static interface List<T> {
        public T head();

        public List<T> tail();

        public boolean isEmpty();
    }

    public static class NonEmptyList<T> implements List<T> {

        private final T _head;
        private final List<T> _tail;

        protected NonEmptyList(T _head, List<T> _tail) {
            this._head = _head;
            this._tail = _tail;
        }

        @Override
        public T head() {
            return _head;
        }

        @Override
        public List<T> tail() {
            return _tail;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean equals(Object other) {
            if (other == null || getClass() != other.getClass())
                return false;
            List<?> that = (List<?>) other;
            return head().equals(that.head()) && tail().equals(that.tail());
        }

        @Override
        public int hashCode() {
            return 37 * (head().hashCode() + tail().hashCode());
        }

        @Override
        public String toString() {
            return "(" + head() + ", " + tail() + ")";
        }

        public static class EmptyListHasNoHead extends RuntimeException {
        }

        public static class EmptyListHasNoTail extends RuntimeException {
        }

        public static final List<?> EMPTY = new List<>() {

            @Override
            public Object head() {
                throw new EmptyListHasNoHead();
            }

            @Override
            public List<Object> tail() {
                throw new EmptyListHasNoTail();
            }

            @Override
            public boolean isEmpty() {
                return true;
            }
        };

        public static <T> List<T> emptyList() {
            return (List<T>) EMPTY;
        }

        public static <T> List<T> list(T head, List<T> tail) {
            return new NonEmptyList<>(head, tail);
        }
    }
}
