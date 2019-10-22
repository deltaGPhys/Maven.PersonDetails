package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i < this.personArray.length){
            result += this.personArray[i].toString();
            i++;
        }

        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < this.personArray.length; i++){
            result += this.personArray[i].toString();
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person p : this.personArray) {
            result += p.toString();
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
