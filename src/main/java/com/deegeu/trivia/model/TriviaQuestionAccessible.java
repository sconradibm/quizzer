/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.trivia.model;

import java.util.List;

/**
 *
 * @author scottconrad
 */
public interface TriviaQuestionAccessible {
    
    TriviaQuestion getQuestionByIndex(long index);
    
    TriviaQuestion getQuestionById(long id);
    
    TriviaQuestion getRandomQuestion();
    
    List<TriviaQuestion> getQuestionList(long offset);
    
    List<TriviaQuestion> getSpecifiedQuestionList(long... id);
    
    long getQuestionListSize();
}
