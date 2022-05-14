package by.TMSTasks.StreamAPI.Task2;

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
