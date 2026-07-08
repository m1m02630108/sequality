package org.example;

public class Calculate {
    public int sum(int x, int y)
    {
        return x + y;
    }

    public int getIndividualFee(int age) {
        if (age <= 12) {
            return 1000;
        } else {
            return 2000;
        }
    }

    public int getTotalFee(int age, int groupSize) {
        int fee = getIndividualFee(age);
        int total = fee * groupSize;

        if (groupSize >= 10){
            total = (int)(total * 0.9);
        }

        return total;
    }

}
