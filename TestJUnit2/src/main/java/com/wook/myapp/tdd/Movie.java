package com.wook.myapp.tdd;

/**
 * Created by NESOY on 2017-01-31.
 */
public class Movie {
	
    private int sumOfRate = 0;
    private int countOfRate = 0;
    
    public Integer averageRating() {
        return countOfRate == 0 ? 0 : sumOfRate/ countOfRate;
    }
    
    public void rate(int rate) {
        this.sumOfRate += rate;
        this.countOfRate++;
    }
}
