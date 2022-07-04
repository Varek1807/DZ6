package ru.netology.sqr;
public class SQRService {
    public int boundaryValues(int max, int min) {
        int result = 0;
        int sqareNumber;
        for (int i = 10; i < 100; i++) {
            sqareNumber = i * i;
            if (sqareNumber > max) {
                break;
            }
            if (sqareNumber > min) {
                result = result + 1;
            }
        } return(result);
    }
}
