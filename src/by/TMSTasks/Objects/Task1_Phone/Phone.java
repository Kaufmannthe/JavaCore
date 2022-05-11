package by.TMSTasks.Objects.Task1_Phone;

    public class Phone {
        private int mobileNumber;
        private String mobileModel;
        private int mobileWeight;
        private String userName;

        public Phone(int mobileNumber, String mobileModel, int mobileWeight, String userName) {
            this(mobileNumber,mobileModel); //Вызов конструктора с двумя параметрами
            this.mobileNumber = mobileNumber;
            this.mobileModel = mobileModel;
            this.mobileWeight = mobileWeight;
            this.userName = userName;

        }

        public Phone(int mobileNumber, String mobileModel) { //Конструктор с двумя параметрами
            this.mobileNumber = mobileNumber;
            this.mobileModel = mobileModel;
        }

        public Phone() {

        }

        void receiveCall(){
            System.out.println("Звонит " + getUserName());
        }

        public static void sendMessage(int... mobileNumber){
            for(int x : mobileNumber){      //Аргументы переменной длинны
                System.out.println("Сообщение будет направлено на номер: " + x);
            }
            System.out.println();
        }


        public String getMobileModel() {
            return mobileModel;
        }

        public int getMobileWeight() {
            return mobileWeight;
        }

        public String getUserName() {
            return userName;
        }

        public void setMobileNumber(int mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public void setMobileModel(String mobileModel) {
            this.mobileModel = mobileModel;
        }

        public void setMobileWeight(int mobileWeight) {
            this.mobileWeight = mobileWeight;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }



        public static void main(String[] args) {
            Phone artyomPhone = new Phone(5121346,"Huawei P8 lite",160,
                    "Artyom");
            artyomPhone.receiveCall();
            sendMessage(5121346,6533222);
        }
    }
