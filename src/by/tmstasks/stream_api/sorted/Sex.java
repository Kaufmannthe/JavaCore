package by.tmstasks.stream_api.sorted;

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
