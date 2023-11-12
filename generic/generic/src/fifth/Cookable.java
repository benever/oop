package fifth;

interface Cookable {
    Cookable cookable = new Cookable() {
        @Override
        public void cook(String str) {
            System.out.println("Вы приготовили "+ str);
        }
    };
    void cook(String str);

}