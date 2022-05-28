package by.tmstasks.stream_api.filter.people;

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
