package com.solvd.touragency.additionals;


    public  class Additional {


        public String AlcoholFree;
        public String FoodFree;
        String type;
        boolean isAlcoholFree;
        boolean isFoodFree;


        public Additional(String name) {
            this.type = type;
        }

        public static void main(String[] args) {

        }

        public void AlcoholFree() {

            System.out.println("Free Tequila!");
            this.isAlcoholFree = true;
        }

        public void FoodFree() {

            System.out.println("Free mussels!");
            this.isFoodFree = true;
        }

        public void takediner() {
        }

    public void dinner() throws AdditionalException {

        System.out.println("Having a full dinner!");
        if (isAlcoholFree && isAlcoholFree) {
            System.out.println("All inclusive");
        } else {
            throw new AdditionalException("nonfree " + " nonfree!");
        }
    }

}
