package com.wook.myapp.tdd;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by NESOY on 2017-01-31.
 */
public class MovieTest {
	
	@Autowired
	private Movie movie;
	
    @Test
    public void foo(){

    }
    
    @Before
    public void setUp() throws Exception {
        movie = new Movie();
    }
    
    
    @Test
    public void canCreateMovie2(){
        //Movie movie = new Movie();
        assertThat(movie.averageRating(),is(0));
    }
    
    @Test
    public void should_return_1_when_was_rated(){
        //Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.averageRating(),is(1));
    }
    
    @Test
    public void should_return_4_when_3_and_5_were_rated(){
        movie.rate(3);
        movie.rate(5);
        assertThat(movie.averageRating(),is(4));
    }
    
 
    
}