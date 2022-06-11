package by.tmstasks.objects.enum_clothes;

public enum Clothing {
    XXS(32){
        @Override
        public void getDescription() {
            System.out.println("детский размер");
        }
    },
    XS(34), S(36), M(38), L(40);


    private int euroSize;

    public int getSize() {
        return euroSize;
    }

    Clothing() {
    }

    Clothing(int euroSize){
        this.euroSize = euroSize;
    }

    public void getDescription(){
            System.out.println("взрослый размер");
        }
    }

