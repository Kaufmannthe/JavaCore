package by.TMSTasks.StreamAPI.Sorted;

public enum Sex {
    MALE{
        @Override
        public String toString() {
            return "Мужской";
        }
    },
    WOMAN{
        @Override
        public String toString() {
            return "Женский";
        }
    };
}
