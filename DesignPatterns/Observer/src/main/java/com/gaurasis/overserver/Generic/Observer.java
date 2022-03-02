package com.gaurasis.overserver.Generic;

//public interface Observer<S extends Observable<S, O, A>, O extends Observer<S,O,A>,A> {
interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    public void update(S subject  , A argument);
}
